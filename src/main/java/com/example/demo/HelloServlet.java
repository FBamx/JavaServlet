package com.example.demo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/ser01")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getRequestURL().toString());
        System.out.println(req.getRequestURI());
        System.out.println(req.getMethod());
        System.out.println(req.getQueryString());
        System.out.println(req.getProtocol());
        resp.getWriter().write("hello elisii!");
    }

    public void destroy() {
        System.out.println("Servlet destroy...");
    }
}