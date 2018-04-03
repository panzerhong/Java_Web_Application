<%-- 
    Document   : Validate
    Created on : Feb 1, 2018, 9:56:55 AM
    Author     : yinma
--%>

	
<%@page import="java.io.PrintWriter"%>
<%--<%! Declation %>--%>
<%--<% Scriptlet %>--%>
<%--<%= Expression %>--%>
<%-- Comment %>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--This is the example of JSP Basic tags --%>
<%
    String user = request.getParameter("user");
    PrintWriter pw = response.getWriter();
    pw.println("Welcome "+user);
    out.println("Welcome"+user);
%>

Welcome : <%= user %>
Date : <%= 10*200 %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
