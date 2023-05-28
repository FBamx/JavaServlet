package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
    每一个web应用都有且仅有一个ServletContext对象，又称为Application对象。在Web容器启动的时候，会为每一个WEB应用程序创建一个对应
    的ServletContext对象。
    该对象有两大作用，第一、作为域对象用来共享数据，此时数据在整个应用程序中共享；第二、该对象保存了当前应用程序的相关信息。例如可以通过
    getServerInfo()方法获取当前服务器的信息，getRealPath(String path)的真实路径。
 */

@WebServlet("/s14")
public class ServletContext extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        javax.servlet.ServletContext servletContext = req.getServletContext();
        servletContext.setAttribute("book", "love is true");
        System.out.println(servletContext.getServerInfo());
        System.out.println(servletContext.getRealPath("RedirectServlet"));
        System.out.println(servletContext.getRealPath("RespServlet"));
    }
}
