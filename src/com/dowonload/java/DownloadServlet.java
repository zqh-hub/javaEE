package com.dowonload.java;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取参数
        String filename = request.getParameter("filename");
        ServletContext context = request.getServletContext();
        // 获取路径
        String realPath = context.getRealPath("/img/" + filename);
        // 加载流
        FileInputStream inputStream = new FileInputStream(realPath);
        // 获取哦MIME
        String mimeType = context.getMimeType(realPath);
        // 设置响应头
        response.setHeader("content-type", mimeType);

        String agent = request.getHeader("user-agent");
        String fileName = DownloadUtils.getFileName(agent, filename);
        response.setHeader("content-disposition", "attachment;filename=" + fileName);
        // 写入输出流
        ServletOutputStream outputStream = response.getOutputStream();
        byte[] b = new byte[1024 * 8];
        int len = 0;
        while ((len = inputStream.read(b)) != -1) {
            outputStream.write(b, 0, len);
        }
        outputStream.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
