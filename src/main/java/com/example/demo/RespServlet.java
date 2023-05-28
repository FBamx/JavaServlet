package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

// request 作用域
@WebServlet("/s07")
public class RespServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("content-type", "text/html;charset=UTF-8");
        System.out.println("Servlet07...");
        PrintWriter writer = resp.getWriter();
        writer.write("我爱你");
//        ServletOutputStream outputStream = resp.getOutputStream();
//        outputStream.write("woaini".getBytes());
    }
}
