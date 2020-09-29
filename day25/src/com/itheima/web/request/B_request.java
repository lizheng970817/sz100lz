package com.itheima.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author:lizheng
 * @Data:2020/8/10 19:15
 */
@WebServlet("/demo1")
public class B_request extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        // 通过name属性值,获取输入的value值
        String username = request.getParameter("username");
        System.out.println(username);
        String password = request.getParameter("password");
        System.out.println(password);
        // 通过name属性值,获取value数组
        String hobby = request.getParameter("hobby");
        System.out.println(hobby);
        //通过getParameterMap方法,获取所有值返回一个map集合
        Map<String, String[]> map = request.getParameterMap();
        for (Map.Entry<String, String[]> stringEntry : map.entrySet()) {
            List<String> strings = Arrays.asList(stringEntry.getValue());
            String key = stringEntry.getKey();
            System.out.println(strings+key);
        }


    }
}
