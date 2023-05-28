package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
1.服务端行为
2.地址栏不会改变
3.从始至终只有一个请求
4.request可以共享
 */

@WebServlet("/ser03")
public class Servlet03 extends HttpServlet {
    public Servlet03() {
        super();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接受客户端请求的参数
        String name = req.getParameter("uname");
        System.out.println("Servlet03 name is " + name);

        // 请求转发跳转到Servlet04
        req.getRequestDispatcher("ser04").forward(req, resp);
    }
}
