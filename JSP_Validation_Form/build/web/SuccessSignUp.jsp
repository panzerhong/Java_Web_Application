<%-- 
    Document   : SuccessSignUp
    Created on : Feb 9, 2018, 11:21:45 AM
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
        <h1>WELCOME</h1>
        <% 
            String name = (String) session.getAttribute("name");
            String dob = (String) session.getAttribute("dob");
            String email =(String) session.getAttribute("email");
            String password = (String) session.getAttribute("password");
            StringBuilder html = new StringBuilder();
            PrintWriter pw = response.getWriter();
            pw.println("You have successfully signup : "+"\n");
            html.append("<br>");
           pw.println("Welcome : "+name+"\n");
           pw.println("Date of Birth : "+ dob+"\n");
           pw.println("Email : "+email+"\n");
           pw.println("Password : "+password+"\n"); 
        %>
        <a href="Logout.jsp">logout</a>
    </body>
</html>
