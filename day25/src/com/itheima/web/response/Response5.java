package com.itheima.web.response;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:lizheng
 * @Data:2020/9/10 23:56
 */
@WebServlet("/Response5")
public class Response5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        ServletContext servletContext = getServletContext();
        ServletConfig servletConfig = getServletConfig();



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //先设置字符编码
       // response.setHeader("Content-type", "text/html;charset=utf-8");
        //request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        System.out.println("我喜欢你,你喜欢我吗");
        response.getWriter().write("我喜欢你gg啊");
        //ServletOutputStream outputStream = response.getOutputStream();
        Cookie cookie = new Cookie("key","value");
        response.addCookie(cookie);

        // 重定向为什么不设置接收请求的字符编码会发生乱码,设置了响应字符
        // 设置了响应以text/html;charset=utf-8写出

    }
}
