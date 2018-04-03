<%-- 
    Document   : Logout
    Created on : Feb 7, 2018, 9:26:41 AM
    Author     : yinma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("index.html");
        %>
    </body>
</html>
