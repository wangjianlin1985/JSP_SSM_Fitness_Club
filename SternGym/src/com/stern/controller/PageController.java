// 
// 
// 

package com.stern.controller;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import com.stern.pojo.News;
import com.stern.pojo.Newskinds;
import java.util.List;
import com.stern.pojo.Member;
import com.github.pagehelper.PageHelper;
import com.stern.pojo.NewsExample;
import com.stern.pojo.NewskindsExample;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import com.stern.service.NewsKindsService;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.service.NewsService;
import org.springframework.stereotype.Controller;

@Controller
public class PageController
{
    @Autowired
    private NewsService newsService;
    @Autowired
    private NewsKindsService newsKindsService;
    
    @RequestMapping({ "/index.html" })
    public String indexPage(final Model model, final HttpServletRequest request) {
        final List<Newskinds> newskinds = this.newsKindsService.selectByExample(new NewskindsExample());
        model.addAttribute("newskinds", (Object)newskinds);
        final NewsExample newsExample = new NewsExample();
        final NewsExample.Criteria criteria = newsExample.createCriteria();
        newsExample.setOrderByClause("ncreatetime DESC");
        criteria.andNkIdEqualTo(1);
        PageHelper.startPage(1, 4);
        final List<News> newsHuodong = this.newsService.selectByExampleWithBLOBs(newsExample);
        model.addAttribute("newsHuodong", (Object)newsHuodong);
        final NewsExample newsExample2 = new NewsExample();
        final NewsExample.Criteria criteria2 = newsExample2.createCriteria();
        criteria2.andNkIdEqualTo(4);
        PageHelper.startPage(1, 4);
        final List<News> newsGonggao = this.newsService.selectByExampleWithBLOBs(newsExample2);
        model.addAttribute("newsGonggao", (Object)newsGonggao);
        final Member member = (Member)request.getSession().getAttribute("member");
        model.addAttribute("member", (Object)member);
        return "index";
    }
    
    @RequestMapping({ "/about.html" })
    public String aboutPage() {
        return "about";
    }
    
    @RequestMapping({ "/register.html" })
    public String registerPage() {
        return "register";
    }
}
