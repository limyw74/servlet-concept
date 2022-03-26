package com.techxtor.demo;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ConfigContextDemo extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        PrintWriter out = res.getWriter();

        out.print("Hello ");

        //Servlet Context
        ServletContext ctx = getServletContext();

        // name from context
        out.println(ctx.getInitParameter("name"));
        // phone from context
        out.println(ctx.getInitParameter("phone"));
    }
}
