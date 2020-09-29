package com.itheima.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:lizheng
 * @Data:2020/8/10 21:40
 */
@WebServlet("/lsForward")
public class lsForwordRequest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 王五找我借钱 ,我没有,我老婆有
        request.setCharacterEncoding("UTF-8");
        System.out.println("我没有钱,也没有老婆");
        request.setAttribute("老婆","你有没有钱");

        request.getRequestDispatcher("ForWord").forward(request,response);
        System.out.println("嘿嘿");
    }
}
