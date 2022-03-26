package com.techxtor.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RequestDispatcherServletDemo extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        int sum = (int) req.getAttribute("sum");

        PrintWriter out = res.getWriter();

        out.println("Hello to Square " + sum * sum);

    }

}
