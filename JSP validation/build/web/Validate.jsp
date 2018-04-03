<%-- 
    Document   : Validate
    Created on : Feb 7, 2018, 9:09:36 AM
    Author     : yinma
--%>

<%@page import="javax.websocket.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String user = request.getParameter("name");
            String pass = request.getParameter("pass");
            if (user.equals("zatin"))
            {
               session.setAttribute("name",user );
               session.setAttribute("pass", pass);
               RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
               rd.forward(request, response);
            }
        %>
    </body>
</html>
