package com.techxtor.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class EntryServlet extends HttpServlet {

/*
    //method = all
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int sum = num1+num2;

        PrintWriter out = res.getWriter();
        out.println("Sum is " + sum);
    }

*/

/*
    // method = "/POST"
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int sum = num1+num2;

        PrintWriter out = res.getWriter();
        out.println("Sum is " + sum);
    }

*/

    // method = "/GET"
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int sum = num1 + num2;


/*
        // Request Dispatcher
        req.setAttribute("sum", sum);
        RequestDispatcher rd = req.getRequestDispatcher("square");
        rd.forward(req, res);
*/


/*
       // Redirect: using query-params
       res.sendRedirect("new-domain?message=using-query-params");
*/


/*
        // Redirect: using session
        HttpSession session = req.getSession();
        session.setAttribute("message", "using-session");
        res.sendRedirect("new-domain");
*/


        // Redirect: using cookie
        Cookie cookie = new Cookie("message", "using-cookie");
        res.addCookie(cookie);
        res.sendRedirect("new-domain");
    }
}
