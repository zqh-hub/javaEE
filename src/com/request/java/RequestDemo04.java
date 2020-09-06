package com.request.java;
/*
* 通用方法获取参数
* */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/demo04")
public class RequestDemo04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*// getParameter()
        String user = request.getParameter("user");
        System.out.println(user);

        // getParameterNames()
        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String s = names.nextElement();
            System.out.println(s);
        }
*/      request.setCharacterEncoding("utf-8");
        String[] hoppies = request.getParameterValues("hobby");
        for (String hoppy : hoppies) {
            System.out.println(hoppy);
        }

        Map<String, String[]> map = request.getParameterMap();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String[] values = map.get(key);
            System.out.println(key+"--->"+Arrays.toString(values));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        System.out.println(user);
    }
}
