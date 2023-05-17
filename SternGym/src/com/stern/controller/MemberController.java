// 
// 
// 

package com.stern.controller;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.io.IOException;
import javax.servlet.http.Cookie;
import java.net.URLDecoder;
import org.springframework.ui.Model;
import com.stern.utils.Funcs;
import com.stern.utils.SendMail;
import javax.servlet.ServletOutputStream;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.awt.image.RenderedImage;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import com.stern.pojo.MemberExample;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.FieldError;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import com.stern.pojo.Member;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.service.MemberService;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController
{
    @Autowired
    private MemberService memberService;
    @Autowired
    private DefaultKaptcha kaptcha;
    
    @RequestMapping({ "/user/register.html" })
    @ResponseBody
    public Map<String, Object> reg(@Validated final Member member, final BindingResult result, @RequestParam("gender") final String gender, @RequestParam("repassword") final String repassword) {
        final Map<String, Object> errorMap = new HashMap<String, Object>();
        final List<String> errorList = new ArrayList<String>();
        if (result.hasErrors() || !member.getMpassword().equals(repassword)) {
            errorMap.put("status", "0");
            if (!member.getMpassword().equals(repassword)) {
                errorList.add("\u4e24\u6b21\u8f93\u5165\u5bc6\u7801\u4e0d\u4e00\u81f4");
            }
            final FieldError nameError = result.getFieldError("mname");
            final FieldError mpasswordError = result.getFieldError("mpassword");
            final FieldError midnoError = result.getFieldError("midno");
            final FieldError mphoneError = result.getFieldError("mphone");
            final FieldError memailError = result.getFieldError("memail");
            if (nameError != null) {
                errorList.add(nameError.getDefaultMessage());
            }
            if (mpasswordError != null) {
                errorList.add(mpasswordError.getDefaultMessage());
            }
            if (midnoError != null) {
                errorList.add(midnoError.getDefaultMessage());
            }
            if (mphoneError != null) {
                errorList.add(mphoneError.getDefaultMessage());
            }
            if (memailError != null) {
                errorList.add(memailError.getDefaultMessage());
            }
            errorMap.put("errorList", errorList);
        }
        else {
            if (gender.equals("1")) {
                member.setMgender(1);
            }
            else {
                member.setMgender(0);
            }
            member.setMdate(new Date());
            this.memberService.addMember(member);
            errorMap.put("status", "1");
            errorMap.put("msg", "\u6ce8\u518c\u6210\u529f\uff0c\u8bf7\u524d\u5f80\u767b\u5f55\uff01");
        }
        return errorMap;
    }
    
    @RequestMapping({ "/user/verifyemailandphone.html" })
    @ResponseBody
    public Map<String, Object> verifyEmailAndPhone(final String memail, final String mphone) {
        final Map<String, Object> verifyMap = new HashMap<String, Object>();
        if (memail != null && !memail.equals(" ")) {
            final MemberExample memberExample1 = new MemberExample();
            final MemberExample.Criteria criteria = memberExample1.createCriteria();
            criteria.andMemailEqualTo(memail);
            final long memailCount = this.memberService.countByExample(memberExample1);
            if (memailCount > 0L) {
                verifyMap.put("status", 0);
                verifyMap.put("msg", "\u90ae\u7bb1\u5df2\u88ab\u6ce8\u518c");
                return verifyMap;
            }
        }
        if (mphone != null && !mphone.equals(" ")) {
            final MemberExample memberExample2 = new MemberExample();
            final MemberExample.Criteria criteria2 = memberExample2.createCriteria();
            criteria2.andMphoneEqualTo(mphone);
            final long mphoneCount = this.memberService.countByExample(memberExample2);
            if (mphoneCount > 0L) {
                verifyMap.put("status", 0);
                verifyMap.put("msg", "\u624b\u673a\u53f7\u5df2\u88ab\u6ce8\u518c");
                return verifyMap;
            }
        }
        verifyMap.put("status", 1);
        return verifyMap;
    }
    
    @RequestMapping({ "/login/captcha.html" })
    public void captcha(final HttpServletRequest request, final HttpServletResponse response) throws Exception {
        final String capText = this.kaptcha.createText();
        request.getSession().setAttribute("KAPTCHA_SESSION_KEY", (Object)capText);
        final BufferedImage bi = this.kaptcha.createImage(capText);
        final ServletOutputStream out = response.getOutputStream();
        ImageIO.write(bi, "jpg", (OutputStream)out);
        try {
            out.flush();
        }
        finally {
            out.close();
        }
        out.close();
    }
    
    @RequestMapping({ "/kaptchaverify.html" })
    @ResponseBody
    public Map<String, Object> verifyCode(final String code, final HttpServletResponse response, final HttpServletRequest request) {
        final Map<String, Object> verifyMap = new HashMap<String, Object>();
        final String codeText = (String)request.getSession().getAttribute("KAPTCHA_SESSION_KEY");
        if (codeText.equals(code)) {
            verifyMap.put("status", 1);
        }
        else {
            verifyMap.put("status", 0);
            verifyMap.put("msg", "\u9a8c\u8bc1\u7801\u9519\u8bef");
        }
        return verifyMap;
    }
    
    @RequestMapping({ "/user/resetpwd.html" })
    @ResponseBody
    public Map<String, Object> resetPwd(final String email) {
        final Map<String, Object> map = new HashMap<String, Object>();
        if (email != null && !email.equals(" ")) {
            final MemberExample memberExample = new MemberExample();
            final MemberExample.Criteria criteria = memberExample.createCriteria();
            criteria.andMemailEqualTo(email);
            final List<Member> members = this.memberService.selectByExample(memberExample);
            if (members.size() > 0) {
                if (SendMail.sendMail(email, members.get(0).getMname())) {
                    final String newPwd = Funcs.MD5("stern123456789");
                    members.get(0).setMpassword(newPwd);
                    this.memberService.updateByPrimaryKeySelective(members.get(0));
                    map.put("msg", "\u91cd\u7f6e\u6210\u529f\uff0c\u8bf7\u7528\u65b0\u5bc6\u7801\u767b\u5f55,\u5982\u679c\u6ca1\u6709\u67e5\u6536\u5230\u90ae\u4ef6\uff0c\u8bf7\u5230\u5783\u573e\u7bb1\u4e2d\u67e5\u770b\uff01");
                }
                else {
                    map.put("msg", "\u91cd\u7f6e\u5931\u8d25");
                }
            }
            else if (members.size() == 0) {
                map.put("msg", "\u8be5\u90ae\u7bb1\u6ca1\u6709\u88ab\u6ce8\u518c");
            }
        }
        else {
            map.put("msg", "\u8bf7\u8f93\u5165\u6b63\u786e\u7684\u90ae\u7bb1");
        }
        return map;
    }
    
    @RequestMapping({ "/login.html" })
    public String loginPage(final HttpServletRequest request, final Model model) throws IOException {
        final Cookie[] cookies = request.getCookies();
        String username = "";
        String pwd = "";
        if (cookies != null) {
            Cookie[] array;
            for (int length = (array = cookies).length, i = 0; i < length; ++i) {
                final Cookie cookie = array[i];
                if (cookie.getName().equals("user")) {
                    username = URLDecoder.decode(cookie.getValue().split("#")[0], "UTF-8");
                    pwd = cookie.getValue().split("#")[1];
                    break;
                }
            }
            model.addAttribute("mname", (Object)username);
            model.addAttribute("mpassword", (Object)pwd);
        }
        return "login";
    }
    
    @RequestMapping({ "/user/login.html" })
    @ResponseBody
    public Map<String, String> login(final String mname, final String mpassword, final HttpServletRequest request, final HttpServletResponse response) throws Exception {
        final Map<String, String> res = new HashMap<String, String>();
        final Member member = this.memberService.selectMemberByNameAndPwd(mname, mpassword);
        if (member != null) {
            res.put("status", "1");
            if (request.getParameter("isRemember") != null) {
                final Cookie cookie = new Cookie("user", String.valueOf(URLEncoder.encode(mname, "utf-8")) + "#" + mpassword);
                cookie.setPath("/");
                cookie.setMaxAge(604800);
                response.addCookie(cookie);
            }
            res.put("username", mname);
            request.getSession().setAttribute("member", (Object)member);
        }
        else {
            res.put("status", "0");
            res.put("msg", "\u7528\u6237\u540d\u6216\u8005\u5bc6\u7801\u9519\u8bef\uff01");
        }
        return res;
    }
    
    @RequestMapping({ "/member/loginout.html" })
    @ResponseBody
    public Map<String, Object> loginout(final HttpServletRequest request) {
        final Map<String, Object> loginoutMap = new HashMap<String, Object>();
        request.getSession().removeAttribute("member");
        request.getSession().invalidate();
        loginoutMap.put("status", 1);
        return loginoutMap;
    }
    
    @RequestMapping({ "admin/adminindex.html" })
    public Object admin(final HttpServletRequest request, final HttpServletResponse response, final Model model) throws IOException {
        final Member member = (Member)request.getSession().getAttribute("member");
        if (!member.getMname().equals("admin")) {
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8;");
            final PrintWriter writer = response.getWriter();
            writer.print("<script>alert('\u6ca1\u6709\u8bbf\u95ee\u6743\u9650\uff01');parent.location.href='" + request.getContextPath() + "/index.html'</script>");
            return false;
        }
        return String.valueOf(request.getContextPath()) + "/admin/adminindex";
    }
    
    @RequestMapping({ "/admin/memberlist.html" })
    public String memberlistPage() {
        return "admin/member/membermanage";
    }
    
    @RequestMapping({ "/admin/userlist.html" })
    @ResponseBody
    public Map<String, Object> userlistPage(final String page, final String limit, final String mname) {
        final MemberExample memberExample = new MemberExample();
        if (mname != null && !mname.equals("")) {
            final MemberExample.Criteria criteria = memberExample.createCriteria();
            criteria.andMnameLike("%" + mname + "%");
        }
        PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(limit));
        final List<Member> members = this.memberService.selectByExample(memberExample);
        final PageInfo<Member> pageInfo = (PageInfo<Member>)new PageInfo((List)members);
        final Map<String, Object> pageMap = new HashMap<String, Object>();
        pageMap.put("code", 0);
        pageMap.put("msg", "");
        pageMap.put("count", pageInfo.getTotal());
        pageMap.put("data", pageInfo.getList());
        return pageMap;
    }
    
    @RequestMapping({ "/admin/member/goupdate.html" })
    public String memberGoUpdate(final Model model, final String mid) {
        final Member member = this.memberService.selectByPrimaryKey(Integer.parseInt(mid));
        model.addAttribute("member", (Object)member);
        return "admin/member/memberedit";
    }
    
    @RequestMapping({ "/admin/member/doupdate.html" })
    @ResponseBody
    public Map<String, Object> memberGoUpdate(final Member member) {
        final Map<String, Object> updateMap = new HashMap<String, Object>();
        final int i = this.memberService.updateByPrimaryKeySelective(member);
        if (i > 0) {
            updateMap.put("status", 1);
        }
        else {
            updateMap.put("status", 0);
        }
        return updateMap;
    }
    
    @RequestMapping({ "/admin/del.html" })
    @ResponseBody
    public Map<String, Object> userdelPage(final String mid) {
        final int i = this.memberService.deleteByPrimaryKey(Integer.parseInt(mid));
        final Map<String, Object> delMap = new HashMap<String, Object>();
        if (i > 0) {
            delMap.put("status", 1);
        }
        else {
            delMap.put("status", 0);
        }
        return delMap;
    }
}
