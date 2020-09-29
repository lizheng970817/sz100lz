package com.itheima.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:lizheng
 * @Data:2020/8/10 19:12
 */
@WebServlet("/demo")
public class A_request extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求方式
        System.out.println(request.getMethod());
        // 获取当前项目名(自己在tomcat服务器上面部署的项目名称)
        System.out.println(request.getContextPath());
        //获取请求地址(没有 协议和主机名)
        System.out.println(request.getRequestURI());
        //获取请求地址(主机名)
        System.out.println(request.getRequestURL());
        System.out.println(request.getHeader("User-Agent"+1));
        System.out.println(request.getHeader("Authorization"));
    }
}
