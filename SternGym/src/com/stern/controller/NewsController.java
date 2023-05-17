// 
// 
// 

package com.stern.controller;

import java.io.IOException;
import java.io.File;
import org.springframework.web.multipart.MultipartFile;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import com.stern.pojo.News;
import com.stern.pojo.Newskinds;
import java.util.List;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.stern.pojo.NewsExample;
import com.stern.pojo.NewskindsExample;
import org.springframework.ui.Model;
import com.stern.service.NewsKindsService;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.service.NewsService;
import org.springframework.stereotype.Controller;

@Controller
public class NewsController
{
    @Autowired
    private NewsService newsService;
    @Autowired
    private NewsKindsService newsKindsService;
    
    @RequestMapping({ "/news.html" })
    public String newsPage(final Model model, final String page) {
        final List<Newskinds> newskinds = this.newsKindsService.selectByExample(new NewskindsExample());
        model.addAttribute("newskinds", (Object)newskinds);
        int _page;
        if (page == null) {
            _page = 1;
        }
        else {
            _page = Integer.parseInt(page);
        }
        final NewsExample newsExample = new NewsExample();
        newsExample.setOrderByClause("ncreatetime DESC");
        PageHelper.startPage(_page, 10);
        final List<News> news = this.newsService.selectByExampleWithBLOBs(newsExample);
        final PageInfo<News> newsPageInfo = (PageInfo<News>)new PageInfo((List)news);
        final int totalPages = newsPageInfo.getPages();
        model.addAttribute("totalPages", (Object)totalPages);
        model.addAttribute("currentPage", (Object)_page);
        model.addAttribute("news", (Object)news);
        return "news";
    }
    
    @RequestMapping({ "/newsajax.html" })
    @ResponseBody
    public Map<String, Object> newsajaxPage(final Model model, final String page) {
        final List<Newskinds> newskinds = this.newsKindsService.selectByExample(new NewskindsExample());
        final NewsExample newsExample = new NewsExample();
        newsExample.setOrderByClause("ncreatetime DESC");
        PageHelper.startPage(Integer.parseInt(page), 10);
        final List<News> news = this.newsService.selectByExampleWithBLOBs(newsExample);
        final PageInfo<News> newsPageInfo = (PageInfo<News>)new PageInfo((List)news);
        final Map<String, Object> newsMap = new HashMap<String, Object>();
        final int totalPages = newsPageInfo.getPages();
        newsMap.put("news", news);
        newsMap.put("newskinds", newskinds);
        model.addAttribute("totalPages", (Object)totalPages);
        model.addAttribute("currentPage", (Object)Integer.parseInt(page));
        return newsMap;
    }
    
    @RequestMapping({ "/newsinfo.html" })
    public String newsInfo(final Model model, final String nid) {
        final List<Newskinds> newskinds = this.newsKindsService.selectByExample(new NewskindsExample());
        model.addAttribute("newskinds", (Object)newskinds);
        final News news = this.newsService.selectByPrimaryKey(Integer.parseInt(nid));
        model.addAttribute("news", (Object)news);
        return "newsinfo";
    }
    
    @RequestMapping({ "/admin/news.html" })
    public String adminnews(final Model model) {
        final List<Newskinds> newskinds = this.newsKindsService.selectByExample(new NewskindsExample());
        model.addAttribute("newskinds", (Object)newskinds);
        return "admin/news/newslist";
    }
    
    @RequestMapping({ "/admin/newslist.html" })
    @ResponseBody
    public Map<String, Object> newslistPage(final String page, final String limit, final Model model, final String ntitle) {
        final List<Newskinds> newskinds = this.newsKindsService.selectByExample(new NewskindsExample());
        model.addAttribute("newskinds", (Object)newskinds);
        final NewsExample newsExample = new NewsExample();
        final NewsExample.Criteria criteria = newsExample.createCriteria();
        if (ntitle != null && !ntitle.equals("")) {
            criteria.andNtitleLike("%" + ntitle + "%");
        }
        PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(limit));
        final List<News> news = this.newsService.selectByExampleWithBLOBs(newsExample);
        final PageInfo<News> pageInfo = (PageInfo<News>)new PageInfo((List)news);
        final Map<String, Object> pageMap = new HashMap<String, Object>();
        pageMap.put("code", 0);
        pageMap.put("msg", "");
        pageMap.put("count", pageInfo.getTotal());
        pageMap.put("data", pageInfo.getList());
        return pageMap;
    }
    
    @RequestMapping({ "/admin/news/goaddorupdate.html" })
    public String adminGoaddorupdatePage(final Model model, @RequestParam(required = false) final String nid) {
        final List<Newskinds> newskinds = this.newsKindsService.selectByExample(new NewskindsExample());
        model.addAttribute("newskinds", (Object)newskinds);
        if (nid != null && !nid.equals("")) {
            final News news = this.newsService.selectByPrimaryKey(Integer.parseInt(nid));
            model.addAttribute("news", (Object)news);
        }
        return "admin/news/newsaddorupdate";
    }
    
    @RequestMapping({ "/admin/news/addorupdate.html" })
    public String adminAddorupdatePage(final News news, final String time) {
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            final Date date = sdf.parse(time);
            news.setNcreatetime(date);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        if (news.getNid() == null) {
            this.newsService.insertSelective(news);
        }
        else {
            this.newsService.updateByPrimaryKeySelective(news);
        }
        return "forward:/admin/news.html";
    }
    
    @RequestMapping({ "/admin/newsinfo.html" })
    public String adminNewsInfo(final Model model, final String nid) {
        final News news = this.newsService.selectByPrimaryKey(Integer.parseInt(nid));
        model.addAttribute("news", (Object)news);
        final List<Newskinds> newskinds = this.newsKindsService.selectByExample(new NewskindsExample());
        model.addAttribute("newskinds", (Object)newskinds);
        return "admin/news/newsinfo";
    }
    
    @RequestMapping({ "/admin/news/del.html" })
    @ResponseBody
    public Map<String, Object> newsDel(final String nid) {
        final int i = this.newsService.deleteByPrimaryKey(Integer.parseInt(nid));
        final Map<String, Object> delMap = new HashMap<String, Object>();
        if (i > 0) {
            delMap.put("status", 1);
        }
        else {
            delMap.put("status", 0);
        }
        return delMap;
    }
    
    @RequestMapping({ "/admin/news/upload.html" })
    @ResponseBody
    public Map<String, Object> uploadImg(final MultipartFile file) {
        final String extName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        final String fileName = String.valueOf(System.currentTimeMillis()) + extName;
        final File newFile = new File(String.valueOf(Thread.currentThread().getContextClassLoader().getResource("").getPath().substring(0, Thread.currentThread().getContextClassLoader().getResource("").getPath().length() - 16)) + "/sterngymimages/" + fileName);
        try {
            file.transferTo(newFile);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        final Map<String, Object> uploadMap = new HashMap<String, Object>();
        final Map<String, String> srcMap = new HashMap<String, String>();
        srcMap.put("src", "http://www.csbishe.cn:8009/SternGym/sterngymimages/" + fileName);
        uploadMap.put("code", 0);
        uploadMap.put("msg", "");
        uploadMap.put("data", srcMap);
        return uploadMap;
    }
}
