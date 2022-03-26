service(): doPost doGet

doPost(): for POST only
doGet(): for GET only

// see service method in HttpServlet.class

Request Dispatcher:
 - Servlet1 calls Servlet2 passing req and res

`
        RequestDispatcher rd = req.getRequestDispatcher("sq");
        rd.forward(req, res);
`
- Browser URL remain same of S1

If the domain is different [ex. domain1.com and domain2.com] - we do url redirect

Browser send rquest to S1 [Request1]
S1 informs browser to call s2
Browser calss S2 [Request2]
https://developer.mozilla.org/en-US/docs/Web/HTTP/Redirections
data can be forwarded using session management

dt:
queryparam
session
cookies

servlet contxt is shared by all servlet

specific servler 


http://localhost:8080/servlet_concept_war_exploded/

http://localhost:8080/servlet_concept_war_exploded/config-context