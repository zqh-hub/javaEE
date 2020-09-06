package com.servlet.java;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = {"/demo"})
public class ServletDemo01 implements Servlet {
    /*
     * 初始化方法：
     * 在Servlet被创建时执行，只会执行一次
     * */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("服务开始....");
    }

    /*
     * 获取ServletConfig对象
     * ServletConfig：Servlet的配置对象
     * */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /*
     * 提供服务的方法：
     * 每次Servlet被方法时都会执行，执行多次
     * */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("23");
    }

    /*
     * 获取Servlet信息（版本，作者）
     * */
    @Override
    public String getServletInfo() {
        return null;
    }

    /*
     * 销毁方法：
     * 在服务器正常关闭时执行，执行一次
     * */
    @Override
    public void destroy() {
        System.out.println("服务结束....");
    }
}
