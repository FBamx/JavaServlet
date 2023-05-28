package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

// session通过cookie JSESSIONID来标识。当服务器收到请求时，会查看是否收到JSESSIONID这个cookie，如果有
// 收到，则认为这是一个session。没有收到则会创建一个session对象，并将JSESSIONID返回给客户端
// session默认存活30分钟
@WebServlet("/s11")
public class SessionServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet11...");
        HttpSession session = req.getSession();
        System.out.println(session.getId());
        System.out.println(session.getCreationTime());
        System.out.println(session.getLastAccessedTime());
        System.out.println(session.isNew());
        session.setAttribute("food", "apple");
    }
}
