// 
// 
// 

package com.stern.controller;

import com.stern.pojo.Reply;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import java.util.List;
import com.stern.pojo.Member;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import com.stern.pojo.Message;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.service.MessageService;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController
{
    @Autowired
    private MessageService messageService;
    
    @RequestMapping({ "/member/sendmessage.html" })
    @ResponseBody
    public Map<String, Object> sendMsg(final String msgcontent, final String mid) {
        final Map<String, Object> sendMsgMap = new HashMap<String, Object>();
        if (msgcontent == null) {
            sendMsgMap.put("msg", "\u7559\u8a00\u4e0d\u80fd\u4e3a\u7a7a");
            return sendMsgMap;
        }
        final Message message = new Message();
        message.setMsgMid(Integer.parseInt(mid));
        message.setMsgContent(msgcontent);
        message.setMsgDate(new Date());
        final int i = this.messageService.insertSelective(message);
        if (i > 0) {
            sendMsgMap.put("status", 1);
            sendMsgMap.put("msg", "\u7559\u8a00\u6210\u529f");
        }
        else {
            sendMsgMap.put("status", 0);
            sendMsgMap.put("msg", "\u7559\u8a00\u5931\u8d25");
        }
        return sendMsgMap;
    }
    
    @RequestMapping({ "/message.html" })
    public String memberCenter(final HttpServletRequest request, final Model model) {
        final Member member = (Member)request.getSession().getAttribute("member");
        final List<Message> messages = this.messageService.selectMessageWithReply(member.getMid());
        model.addAttribute("messages", (Object)messages);
        return "membermessage";
    }
    
    @RequestMapping({ "/admin/message.html" })
    public String adminMsg() {
        return "admin/message/messagelist";
    }
    
    @RequestMapping({ "/admin/messagelist.html" })
    @ResponseBody
    public Map<String, Object> messageList(final String page, final String limit, final String msgcontent) {
        final Map<String, Object> messagePageMap = new HashMap<String, Object>();
        PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(limit));
        final List<Message> messages = this.messageService.selectAllMessageWithReplyAndMember(msgcontent);
        final PageInfo<Message> messagePageInfo = (PageInfo<Message>)new PageInfo((List)messages);
        messagePageMap.put("code", 0);
        messagePageMap.put("msg", "");
        messagePageMap.put("count", messagePageInfo.getTotal());
        messagePageMap.put("data", messages);
        return messagePageMap;
    }
    
    @RequestMapping({ "/admin/message/goreply.html" })
    public String gpReply(final String msgid, final Model model) {
        model.addAttribute("msgid", (Object)Integer.parseInt(msgid));
        return "admin/message/reply";
    }
    
    @RequestMapping({ "/admin/message/doreply.html" })
    @ResponseBody
    public Map<String, Object> doReply(final Reply reply) {
        final Map<String, Object> replyMap = new HashMap<String, Object>();
        final Date rdate = new Date();
        reply.setRdate(rdate);
        if (!reply.getRcontent().trim().equals("")) {
            final int i = this.messageService.insertSelective(reply);
            if (i > 0) {
                replyMap.put("status", 1);
                replyMap.put("msg", "\u56de\u590d\u6210\u529f");
            }
            else {
                replyMap.put("status", 0);
                replyMap.put("msg", "\u56de\u590d\u5931\u8d25");
            }
        }
        else {
            replyMap.put("status", 0);
            replyMap.put("msg", "\u56de\u590d\u4e0d\u80fd\u4e3a\u7a7a");
        }
        return replyMap;
    }
    
    @RequestMapping({ "/admin/message/delReply.html" })
    @ResponseBody
    public Map<String, String> delReply(final String rid) {
        final Map<String, String> delMap = new HashMap<String, String>();
        final int i = this.messageService.deleteReplyByPrimaryKey(Integer.parseInt(rid));
        if (i > 0) {
            delMap.put("status", "1");
        }
        else {
            delMap.put("status", "0");
        }
        return delMap;
    }
    
    @RequestMapping({ "/admin/message/delMsg.html" })
    @ResponseBody
    public Map<String, String> delMsg(final String msgid) {
        final Map<String, String> delMap = new HashMap<String, String>();
        final int i = this.messageService.deleteMsgByPrimaryKey(Integer.parseInt(msgid));
        if (i > 0) {
            delMap.put("status", "1");
        }
        else {
            delMap.put("status", "0");
        }
        return delMap;
    }
}
