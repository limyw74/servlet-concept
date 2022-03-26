package com.techxtor.demo;

import javax.servlet.ServletConfig;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RedirectServletDemo extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

//        Redirect: using query-params
//        String redirectMessage = req.getParameter("message");

//        Redirect: using session
//        HttpSession session = req.getSession();
//        String redirectMessage = (String) session.getAttribute("message");


        // Redirect: using cookie
        String redirectMessage = null;
        Cookie cookies[] = req.getCookies();
        for (Cookie c : cookies) {
            if (c.getName().equals("message")) {
                redirectMessage = c.getValue();
            }
        }
        PrintWriter out = res.getWriter();

        out.println("Message from Origin is --> " + redirectMessage);

        // Servlet Config
        ServletConfig cnfg = getServletConfig();
        out.println("Hello " + cnfg.getInitParameter("name"));

    }
}
