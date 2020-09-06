package com.request.java;
/*
* 获取请求行的方法
* */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/re")
public class RequestDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        String contextPath = request.getContextPath();
        String uri = request.getRequestURI();
        String remoteAddr = request.getRemoteAddr();
        StringBuffer requestURL = request.getRequestURL();
        String protocol = request.getProtocol();
        String queryString = request.getQueryString();
        String servletPath = request.getServletPath();

        System.out.println("method:"+method);//method:GET
        System.out.println("requestURL:"+requestURL); // requestURL:http://localhost:8080/req/re
        System.out.println("uri:"+uri); // uri:/req/re
        System.out.println("contextPath:"+contextPath);//contextPath:/req
        System.out.println("servletPath:"+servletPath); // servletPath:/re
        System.out.println("queryString:"+queryString); // queryString:user=12
        System.out.println("remoteAddr:"+remoteAddr); // remoteAddr:0:0:0:0:0:0:0:1
        System.out.println("protocol:"+protocol); // protocol:HTTP/1.1
    }
}
