// 
// 
// 

package com.stern.controller;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.ResponseBody;
import com.stern.pojo.Employee;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.stern.pojo.EmployeeExample;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import com.stern.pojo.Post;
import java.util.List;
import com.stern.pojo.PostExample;
import org.springframework.ui.Model;
import com.stern.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.service.PostService;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController
{
    @Autowired
    private PostService postService;
    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping({ "/admin/employee.html" })
    public String employeePage(final Model model) {
        final List<Post> posts = this.postService.selectByExample(new PostExample());
        model.addAttribute("posts", (Object)posts);
        return "admin/employee/employeelist";
    }
    
    @RequestMapping({ "/admin/employeelist.html" })
    @ResponseBody
    public Map<String, Object> employeelistPage(final String page, final String limit, final Model model, final String ename) {
        final Map<String, Object> employeeMap = new HashMap<String, Object>();
        final List<Post> posts = this.postService.selectByExample(new PostExample());
        model.addAttribute("posts", (Object)posts);
        final EmployeeExample employeeExample = new EmployeeExample();
        final EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        if (ename != null && !ename.equals("")) {
            criteria.andEnameLike("%" + ename + "%");
        }
        PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(limit));
        final List<Employee> employees = this.employeeService.selectByExample(employeeExample);
        final PageInfo<Employee> employeePageInfo = (PageInfo<Employee>)new PageInfo((List)employees);
        employeeMap.put("code", 0);
        employeeMap.put("msg", "");
        employeeMap.put("count", employeePageInfo.getTotal());
        employeeMap.put("data", employeePageInfo.getList());
        return employeeMap;
    }
    
    @RequestMapping({ "/admin/employee/goaddorupdate.html" })
    public String goUpdate(final Model model, final String eid) {
        final List<Post> posts = this.postService.selectByExample(new PostExample());
        model.addAttribute("posts", (Object)posts);
        if (eid != null && !eid.equals(" ")) {
            final Employee employee = this.employeeService.selectByPrimaryKey(Integer.parseInt(eid));
            model.addAttribute("employee", (Object)employee);
        }
        return "admin/employee/employeeedit";
    }
    
    @RequestMapping({ "/admin/employee/doaddorupdate.html" })
    @ResponseBody
    public Map<String, Object> doaddorupdate(final Employee employee, final String time) {
        final Map<String, Object> updateMap = new HashMap<String, Object>();
        int i = 0;
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            final Date date = sdf.parse(time);
            employee.setEhire(date);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        if (employee.getEid() == null) {
            i = this.employeeService.insertSelective(employee);
            if (i > 0) {
                updateMap.put("msg", "\u6dfb\u52a0\u6210\u529f");
                updateMap.put("status", 1);
            }
            else {
                updateMap.put("msg", "\u6dfb\u52a0\u5931\u8d25");
                updateMap.put("status", 0);
            }
        }
        else {
            i = this.employeeService.updateByPrimaryKeySelective(employee);
            if (i > 0) {
                updateMap.put("msg", "\u66f4\u65b0\u6210\u529f");
                updateMap.put("status", 1);
            }
            else {
                updateMap.put("msg", "\u66f4\u65b0\u5931\u8d25");
                updateMap.put("status", 0);
            }
        }
        return updateMap;
    }
    
    @RequestMapping({ "/admin/employee/del.html" })
    @ResponseBody
    public Map<String, String> delEmployee(final String eid) {
        final Map<String, String> delMap = new HashMap<String, String>();
        final int i = this.employeeService.deleteByPrimaryKey(Integer.parseInt(eid));
        if (i > 0) {
            delMap.put("status", "1");
        }
        else {
            delMap.put("status", "0");
        }
        return delMap;
    }
    
    @RequestMapping({ "/admin/trainer.html" })
    public String adminTrainer(final Model model) {
        return "admin/trainer/trainerlist";
    }
    
    @RequestMapping({ "/admin/trainerlist.html" })
    @ResponseBody
    public Map<String, Object> trainerPage(final String page, final String limit, final String ename, final Model model) {
        final Map<String, Object> trainerMap = new HashMap<String, Object>();
        final EmployeeExample employeeExample = new EmployeeExample();
        final EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andEpostIdEqualTo(1);
        if (ename != null && !ename.equals(" ")) {
            criteria.andEnameLike("%" + ename + "%");
        }
        PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(limit));
        final List<Employee> trainers = this.employeeService.selectByExample(employeeExample);
        final PageInfo<Employee> trainerPageInfo = (PageInfo<Employee>)new PageInfo((List)trainers);
        trainerMap.put("code", 0);
        trainerMap.put("msg", "");
        trainerMap.put("count", trainerPageInfo.getTotal());
        trainerMap.put("data", trainers);
        return trainerMap;
    }
    
    @RequestMapping({ "/admin/trainer/goaddorupdate.html" })
    public String trainerGoAddOrUpdate(final String eid, final Model model) {
        if (eid != null && !eid.equals(" ")) {
            final Employee trainer = this.employeeService.selectByPrimaryKey(Integer.parseInt(eid));
            model.addAttribute("trainer", (Object)trainer);
        }
        return "admin/trainer/traineredit";
    }
    
    @RequestMapping({ "/admin/trainer/doaddorupdate.html" })
    @ResponseBody
    public Map<String, Object> trainerDoAddOrUpdate(final Employee employee, final String time) {
        final Map<String, Object> trainerMap = new HashMap<String, Object>();
        int i = 0;
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            final Date ehire = sdf.parse(time);
            employee.setEhire(ehire);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        if (employee.getEid() != null && !employee.getEid().equals(" ")) {
            i = this.employeeService.updateByPrimaryKeySelective(employee);
            if (i > 0) {
                trainerMap.put("msg", "\u66f4\u65b0\u6210\u529f");
                trainerMap.put("res", 1);
            }
            else {
                trainerMap.put("msg", "\u66f4\u65b0\u5931\u8d25");
                trainerMap.put("res", 0);
            }
        }
        else {
            i = this.employeeService.insertSelective(employee);
            if (i > 0) {
                trainerMap.put("msg", "\u6dfb\u52a0\u6210\u529f");
                trainerMap.put("res", 1);
            }
            else {
                trainerMap.put("msg", "\u6dfb\u52a0\u5931\u8d25");
                trainerMap.put("res", 0);
            }
        }
        return trainerMap;
    }
    
    @RequestMapping({ "/admin/trainer/del.html" })
    @ResponseBody
    public Map<String, Object> delTrainer(final String eid) {
        final Map<String, Object> delMap = new HashMap<String, Object>();
        final int i = this.employeeService.deleteByPrimaryKey(Integer.parseInt(eid));
        if (i > 0) {
            delMap.put("status", 1);
        }
        else {
            delMap.put("status", 0);
        }
        return delMap;
    }
}
