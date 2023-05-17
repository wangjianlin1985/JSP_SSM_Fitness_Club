// 
// 
// 

package com.stern.controller;

import java.math.BigDecimal;
import java.io.IOException;
import com.stern.pojo.SheetExample;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.File;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;
import com.stern.pojo.Employee;
import java.util.Iterator;
import com.stern.pojo.EmployeeExample;
import com.stern.pojo.TblOrderExample;
import com.stern.pojo.Class;
import com.stern.pojo.ClassExample;
import org.springframework.web.bind.annotation.RequestMapping;
import com.stern.pojo.Sheet;
import com.stern.pojo.Course;
import java.util.List;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.stern.pojo.Coursefunction;
import com.stern.pojo.Coursecategory;
import com.stern.pojo.CourseExample;
import com.stern.pojo.CoursefunctionExample;
import com.stern.pojo.CoursecategoryExample;
import org.springframework.ui.Model;
import com.stern.service.OrderService;
import com.stern.service.ClassService;
import com.stern.service.CoursefunctionService;
import com.stern.service.CoursecategoryService;
import com.stern.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.service.CourseService;
import org.springframework.stereotype.Controller;

@Controller
public class CourseController
{
    @Autowired
    private CourseService courseService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CoursecategoryService coursecategoryService;
    @Autowired
    private CoursefunctionService coursefunctionService;
    @Autowired
    private ClassService classService;
    @Autowired
    private OrderService orderService;
    
    @RequestMapping({ "/course.html" })
    public String coursePage(final Model model, final String page, final String cate, final String func) {
        System.out.println(String.valueOf(cate) + "=====================================" + func);
        final List<Coursecategory> coursecategories = this.coursecategoryService.selectByExample(new CoursecategoryExample());
        model.addAttribute("coursecategories", (Object)coursecategories);
        final List<Coursefunction> coursefunctions = this.coursefunctionService.selectByExample(new CoursefunctionExample());
        model.addAttribute("coursefunctions", (Object)coursefunctions);
        int _page;
        if (page == null) {
            _page = 1;
        }
        else {
            _page = Integer.parseInt(page);
        }
        final CourseExample courseExample = new CourseExample();
        final CourseExample.Criteria criteria = courseExample.createCriteria();
        final CoursecategoryExample coursecategoryExample = new CoursecategoryExample();
        final CoursecategoryExample.Criteria criteria2 = coursecategoryExample.createCriteria();
        final CoursefunctionExample coursefunctionExample = new CoursefunctionExample();
        final CoursefunctionExample.Criteria criteria3 = coursefunctionExample.createCriteria();
        if (cate != null && !cate.equals("\u5168\u90e8")) {
            criteria2.andCateNameEqualTo(cate);
            final List<Coursecategory> coursecategories2 = this.coursecategoryService.selectByExample(coursecategoryExample);
            criteria.andCcateIdEqualTo(coursecategories2.get(0).getCateId());
        }
        if (func != null && !func.equals("\u5168\u90e8")) {
            criteria3.andFnameEqualTo(func);
            final List<Coursefunction> coursefunctions2 = this.coursefunctionService.selectByExample(coursefunctionExample);
            criteria.andCfunctionIdEqualTo(coursefunctions2.get(0).getFid());
        }
        PageHelper.startPage(_page, 6);
        final List<Course> courses = this.courseService.selectByExampleWithBLOBs(courseExample);
        final PageInfo<Course> pageInfo = (PageInfo<Course>)new PageInfo((List)courses);
        final int totalPages = pageInfo.getPages();
        model.addAttribute("totalPages", (Object)totalPages);
        model.addAttribute("currentPage", (Object)_page);
        model.addAttribute("courses", (Object)courses);
        model.addAttribute("cate", (Object)cate);
        model.addAttribute("func", (Object)func);
        final Sheet sheet = this.courseService.selectSheetByPrimaryKey(1);
        if (sheet != null) {
            model.addAttribute("sheetsrc", (Object)sheet.getSsrc());
        }
        return "course";
    }
    
    @RequestMapping({ "/courseinfo.html" })
    public String coursePage(final Model model, final String cid) {
        final Course course = this.courseService.selectByPrimaryKey(Integer.parseInt(cid));
        model.addAttribute("course", (Object)course);
        if (cid.equals("8") || cid.equals("18")) {
            final ClassExample classExample = new ClassExample();
            final ClassExample.Criteria criteria = classExample.createCriteria();
            criteria.andCourseIdEqualTo(Integer.parseInt(cid));
            final List<Class> classes = this.classService.selectByExample(classExample);
            for (final Class aClass : classes) {
                final TblOrderExample tblOrderExample = new TblOrderExample();
                final TblOrderExample.Criteria criteria2 = tblOrderExample.createCriteria();
                criteria2.andClassIdEqualTo(aClass.getClassid());
                final long haveOrder = this.orderService.countByExample(tblOrderExample);
                aClass.setHaveOrder((int)(Object)new Long(haveOrder));
            }
            model.addAttribute("classes", (Object)classes);
            final EmployeeExample employeeExample = new EmployeeExample();
            final EmployeeExample.Criteria criteria3 = employeeExample.createCriteria();
            criteria3.andEpostIdEqualTo(1);
            final List<Employee> trainers = this.employeeService.selectByExample(employeeExample);
            model.addAttribute("trainers", (Object)trainers);
        }
        return "courseinfo";
    }
    
    @RequestMapping({ "/admin/course.html" })
    public String admincourse(final Model model) {
        final List<Employee> employees = this.employeeService.selectByExample(new EmployeeExample());
        model.addAttribute("employees", (Object)employees);
        final List<Coursecategory> coursecategories = this.coursecategoryService.selectByExample(new CoursecategoryExample());
        model.addAttribute("coursecategories", (Object)coursecategories);
        final List<Coursefunction> coursefunctions = this.coursefunctionService.selectByExample(new CoursefunctionExample());
        model.addAttribute("coursefunctions", (Object)coursefunctions);
        return "admin/course/courselist";
    }
    
    @RequestMapping({ "/admin/courselist.html" })
    @ResponseBody
    public Map<String, Object> courselistPage(final String page, final String limit, final Model model, final String cname) {
        final List<Employee> employees = this.employeeService.selectByExample(new EmployeeExample());
        model.addAttribute("employees", (Object)employees);
        final CourseExample example = new CourseExample();
        if (cname != null && !"".equals(cname)) {
            final CourseExample.Criteria criteria = example.createCriteria();
            criteria.andCnameLike("%" + cname + "%");
        }
        PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(limit));
        final List<Course> courses = this.courseService.selectByExampleWithBLOBs(example);
        final PageInfo<Course> pageInfo = (PageInfo<Course>)new PageInfo((List)courses);
        final Map<String, Object> pageMap = new HashMap<String, Object>();
        pageMap.put("code", 0);
        pageMap.put("msg", "");
        pageMap.put("count", pageInfo.getTotal());
        pageMap.put("data", pageInfo.getList());
        return pageMap;
    }
    
    @RequestMapping({ "/admin/upload.html" })
    @ResponseBody
    public Map<String, Object> upload(final MultipartFile file) {
        final String extName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        final String filename = String.valueOf(System.currentTimeMillis()) + extName;
        final File newFile = new File(String.valueOf(Thread.currentThread().getContextClassLoader().getResource("").getPath().substring(0, Thread.currentThread().getContextClassLoader().getResource("").getPath().length() - 16)) + "/sterngymimages/" + filename);
        try {
            file.transferTo(newFile);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        final Map<String, String> srcMap = new HashMap<String, String>();
        srcMap.put("src", filename);
        final Map<String, Object> imgMap = new HashMap<String, Object>();
        imgMap.put("code", 0);
        imgMap.put("msg", "");
        imgMap.put("data", srcMap);
        return imgMap;
    }
    
    @RequestMapping({ "/admin/courseinfo.html" })
    public String courseInfo(final Model model, final String cid) {
        final Course course = this.courseService.selectByPrimaryKey(Integer.parseInt(cid));
        model.addAttribute("course", (Object)course);
        final EmployeeExample example = new EmployeeExample();
        final EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andEpostIdEqualTo(1);
        final List<Employee> trainers = this.employeeService.selectByExample(example);
        model.addAttribute("trainers", (Object)trainers);
        final List<Coursecategory> coursecategories = this.coursecategoryService.selectByExample(new CoursecategoryExample());
        model.addAttribute("coursecategories", (Object)coursecategories);
        final List<Coursefunction> coursefunctions = this.coursefunctionService.selectByExample(new CoursefunctionExample());
        model.addAttribute("coursefunctions", (Object)coursefunctions);
        return "admin/course/courseinfo";
    }
    
    @RequestMapping({ "/admin/goaddorupdate.html" })
    public String admingoaddPage(final Model model, @RequestParam(required = false) final String cid) {
        final EmployeeExample example = new EmployeeExample();
        final EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andEpostIdEqualTo(1);
        final List<Employee> trainers = this.employeeService.selectByExample(example);
        model.addAttribute("trainers", (Object)trainers);
        final List<Coursecategory> coursecategories = this.coursecategoryService.selectByExample(new CoursecategoryExample());
        model.addAttribute("coursecategories", (Object)coursecategories);
        final List<Coursefunction> coursefunctions = this.coursefunctionService.selectByExample(new CoursefunctionExample());
        model.addAttribute("coursefunctions", (Object)coursefunctions);
        if (cid != null && !cid.equals("")) {
            final Course course = this.courseService.selectByPrimaryKey(Integer.parseInt(cid));
            model.addAttribute("course", (Object)course);
        }
        return "admin/course/courseaddorupdate";
    }
    
    @RequestMapping({ "/admin/addorupdate.html" })
    public String adminaddorupdatePage(final Course course) {
        if (course.getCid() == null) {
            if (course.getTrainerId().equals(-1)) {
                course.setTrainerId(null);
            }
            course.setCcreatetime(new Date());
            this.courseService.insertSelective(course);
        }
        else {
            if (course.getTrainerId().equals(-1)) {
                course.setTrainerId(null);
            }
            this.courseService.updateByPrimaryKeySelective(course);
        }
        return "forward:/admin/course.html";
    }
    
    @RequestMapping({ "/admin/course/del.html" })
    @ResponseBody
    public Map<String, Object> courseDel(final String cid) {
        final int i = this.courseService.deleteByPrimaryKey(Integer.parseInt(cid));
        final Map<String, Object> delMap = new HashMap<String, Object>();
        if (i > 0) {
            delMap.put("status", 1);
        }
        else {
            delMap.put("status", 0);
        }
        return delMap;
    }
    
    @RequestMapping({ "/admin/courseupload.html" })
    public String courseUpload(final Model model) {
        final Sheet sheet = this.courseService.selectSheetByPrimaryKey(1);
        if (sheet != null) {
            model.addAttribute("sheetsrc", (Object)sheet.getSsrc());
        }
        return "admin/course/courseupload";
    }
    
    @RequestMapping({ "/admin/coursesheet.html" })
    @ResponseBody
    public Map<String, Object> uploatSheet(final MultipartFile file) {
        final Map<String, Object> uploadMap = new HashMap<String, Object>();
        final Map<String, String> srcMap = new HashMap<String, String>();
        final String filename = file.getOriginalFilename();
        final Sheet sheet = new Sheet();
        sheet.setSsrc(filename);
        if (this.courseService.countByExample(new SheetExample()) == 0L) {
            this.courseService.insertSelective(sheet);
        }
        else {
            sheet.setSid(1);
            this.courseService.updateByPrimaryKey(sheet);
        }
        final File newFile = new File(String.valueOf(Thread.currentThread().getContextClassLoader().getResource("").getPath().substring(0, Thread.currentThread().getContextClassLoader().getResource("").getPath().length() - 16)) + "/sterngymimages/" + filename);
        try {
            file.transferTo(newFile);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        srcMap.put("src", filename);
        uploadMap.put("data", srcMap);
        uploadMap.put("code", 0);
        uploadMap.put("msg", "");
        return uploadMap;
    }
}
