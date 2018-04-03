<%-- 
    Document   : Success
    Created on : Feb 7, 2018, 9:19:43 AM
    Author     : yinma
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           String username = (String) session.getAttribute("name");
           String password = (String) session.getAttribute("pass");
           PrintWriter pw = response.getWriter();
           pw.println("Welcome : "+username);
           pw.println("password : "+password);
           pw.println("Successful login");
        %>
        <a href="Logout.jsp">logout</a>
    </body>
</html>