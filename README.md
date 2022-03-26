### Important Notes:

#### Listener Method:
`service(HttpServletRequest req, HttpServletResponse res)`
 - It is generic and accepts all http methods

`doPost(HttpServletRequest req, HttpServletResponse res)`
 - for *POST* only
`doGet(HttpServletRequest req, HttpServletResponse res)`
 - for *GET* only

 - Refer `service(HttpServletRequest req, HttpServletResponse resp)` method in `HttpServlet.class`

#### Calling Servlet from Servlet
1. Request Dispatcher [__for same domain__]
2. URL Redirect [__for different domain__]

##### Request Dispatcher:
 - Servlet_1 calls Servlet_2 passing req and res
`
        RequestDispatcher rd = req.getRequestDispatcher("servlet_2");
        rd.forward(req, res);
`
 - Browser URL remain same of Servlet_1

 - Data forwarding:
  > - Request/Response Object is forwarded from Servlet_1 

##### URL Redirect:
 - Browser send request to Servlet_1 [__Request_1___]
 - Servlet_1 informs the browser to call Servlet_2
 `
 res.sendRedirect("new-domain");
 `
 - Browser calls Servlet_2 [__Request_2__]
 > - It is a complete new request.

 - [More at Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/HTTP/Redirections)
 - Data forwarding:
 > - query-params
 > - session
 > - cookies

#### Servlet Context:
Servlet Context is shared by all Servlets

#### Servlet Config;:
Servlet Config is specific to particular Servlet where it's defined

### URLS:
 - index: http://localhost:8080/servlet_concept_war_exploded/

 - config-context: http://localhost:8080/servlet_concept_war_exploded/config-context