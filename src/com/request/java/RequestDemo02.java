package com.request.java;
/*
* 演示通过referer头实现防盗链
* */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/demo02")
public class RequestDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getHeader("referer"));
        if ("we".equalsIgnoreCase(request.getHeader("referer"))) {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("正在播放...");
        } else {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("不准看");
        }
    }
}
