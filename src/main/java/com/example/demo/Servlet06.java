package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// request 作用域
@WebServlet("/s06")
public class Servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet06...");
        // 获取域对象
        String name = (String)req.getAttribute("name");
        Integer age = (Integer)req.getAttribute("age");
        List<String> list = (List<String>) req.getAttribute("list");
        System.out.println("name is " + name);
        System.out.println("age is " + age);
        System.out.println("list is " + list.toString());
    }
}
