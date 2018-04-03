<%-- 
    Document   : Logout
    Created on : Feb 13, 2018, 11:18:18 AM
    Author     : yinma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout page</title>
    </head>
    <body>
        <% 
            session.invalidate();
            response.sendRedirect("index.html");
        %>
    </body>
</html>
