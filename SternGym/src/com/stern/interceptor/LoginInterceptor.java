// 
// 
// 

package com.stern.interceptor;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter
{
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) throws Exception {
        if (request.getSession().getAttribute("member") != null) {
            return true;
        }
        if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
            response.getWriter().print("logout");
            return false;
        }
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8;");
        final PrintWriter writer = response.getWriter();
        writer.print("<script>alert('\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55\uff01');parent.location.href='" + request.getContextPath() + "/index.html'</script>");
        return false;
    }
}
