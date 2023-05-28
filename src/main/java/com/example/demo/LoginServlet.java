package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ser02")
public class LoginServlet extends HttpServlet {
    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        System.out.println(req.getParameter("uname"));
        System.out.println(req.getParameter("upass"));
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
