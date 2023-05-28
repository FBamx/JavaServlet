package com.example.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
session域对象与req域对象区别

请求转发
    一次转发
    req有效
    session有效
重定向
    两次转发
    req无效
    session有效
 */

@WebServlet("/s12")
public class SessionAttributeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ServletContext servletContext = req.getServletContext();
        String food = (String)session.getAttribute("food");
        System.out.println(food);
        System.out.println((String)servletContext.getAttribute("book"));
    }
}
