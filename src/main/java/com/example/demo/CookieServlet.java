package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// request 作用域
@WebServlet("/s10")
public class CookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet10...");
        Cookie cookie = new Cookie("cc", "gg");
        cookie.setMaxAge(20);
        Cookie[] cookies = req.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cke : cookies) {
                System.out.println("cookie name: " + cke.getName() + " cookie value: " + cke.getValue());
            }
        }
        resp.addCookie(cookie);
    }
}
