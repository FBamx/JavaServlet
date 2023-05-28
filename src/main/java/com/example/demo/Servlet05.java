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
@WebServlet("/s05")
public class Servlet05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet05...");
        // 设置域对象
        req.setAttribute("name", "admin");
        req.setAttribute("age", 18);
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        req.setAttribute("list", list);
        req.getRequestDispatcher("s06").forward(req, resp);
    }
}
