package com.itheima.web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:lizheng
 * @Data:2020/8/10 22:46
 */
@WebServlet("/demo4")
public class response4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 操作响应头
        //resp.setHeader("Refresh","5;url=./C_request");
        //resp.setHeader("Location","day25/index.html");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("我喜欢你 ");
        resp.sendRedirect("Response5");
    }
}
