// 
// 
// 

package com.stern.controller;

import com.stern.pojo.Class;
import com.stern.pojo.TblOrderExample;
import java.util.Date;
import com.stern.pojo.Member;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ResponseBody;
import com.stern.pojo.TblOrder;
import java.util.List;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import com.stern.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.service.OrderService;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController
{
    @Autowired
    private OrderService orderService;
    @Autowired
    private ClassService classService;
    
    @RequestMapping({ "/admin/order.html" })
    public String adminOrder() {
        return "admin/order/orderlist";
    }
    
    @RequestMapping({ "/admin/orderlist.html" })
    @ResponseBody
    public Map<String, Object> orderList(final String page, final String limit, final String mname) {
        final Map<String, Object> orderPageMap = new HashMap<String, Object>();
        PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(limit));
        final List<TblOrder> orders = this.orderService.selectAllOrderWithMember(mname);
        final PageInfo<TblOrder> orderPageInfo = (PageInfo<TblOrder>)new PageInfo((List)orders);
        orderPageMap.put("code", 0);
        orderPageMap.put("msg", "");
        orderPageMap.put("count", orderPageInfo.getTotal());
        orderPageMap.put("data", orders);
        return orderPageMap;
    }
    
    @RequestMapping({ "/class/order.html" })
    @ResponseBody
    public Map<String, Object> orderCourse(final String classId, final HttpServletRequest request) {
        final Map<String, Object> orderMap = new HashMap<String, Object>();
        final TblOrder order = new TblOrder();
        final Member member = (Member)request.getSession().getAttribute("member");
        order.setMemberId(member.getMid());
        order.setOcreatetime(new Date());
        order.setOstatus(0);
        order.setClassId(Integer.parseInt(classId));
        final TblOrderExample tblOrderExample = new TblOrderExample();
        final TblOrderExample.Criteria criteria = tblOrderExample.createCriteria();
        criteria.andMemberIdEqualTo(member.getMid());
        criteria.andClassIdEqualTo(Integer.parseInt(classId));
        final List<TblOrder> tblOrders = this.orderService.selectByExample(tblOrderExample);
        if (!tblOrders.isEmpty()) {
            orderMap.put("msg", "\u60a8\u5df2\u7ecf\u9884\u8ba2\u8fc7\u8be5\u8bfe\u7a0b\uff0c\u4e0d\u53ef\u91cd\u590d\u9884\u8ba2");
        }
        else {
            final TblOrderExample tblOrderExample2 = new TblOrderExample();
            final Class clazz = this.classService.selectByPrimaryKey(Integer.parseInt(classId));
            final TblOrderExample.Criteria criteria2 = tblOrderExample2.createCriteria();
            criteria2.andClassIdEqualTo(Integer.parseInt(classId));
            final long haveOrder = this.orderService.countByExample(tblOrderExample2);
            if ((int)(Object)new Long(haveOrder) == clazz.getClassvolume()) {
                orderMap.put("msg", "\u73ed\u7ea7\u5df2\u7ecf\u6ee1\u5458");
            }
            else {
                final int i = this.orderService.insertSelective(order);
                if (i > 0) {
                    orderMap.put("msg", "\u9884\u8ba2\u6210\u529f");
                }
                else {
                    orderMap.put("msg", "\u9884\u8ba2\u5931\u8d25");
                }
            }
        }
        return orderMap;
    }
    
    @RequestMapping({ "/admin/order/del.html" })
    @ResponseBody
    public Map<String, Object> delOrder(final String oid) {
        final Map<String, Object> delMap = new HashMap<String, Object>();
        final int i = this.orderService.deleteByPrimaryKey(Integer.parseInt(oid));
        if (i > 0) {
            delMap.put("status", 1);
        }
        else {
            delMap.put("status", 0);
        }
        return delMap;
    }
}
