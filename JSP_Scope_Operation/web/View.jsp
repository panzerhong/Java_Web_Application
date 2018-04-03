<%-- 
    Document   : View
    Created on : Feb 16, 2018, 10:10:45 AM
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
        <h1>Hello World!</h1>
         <% 
            String user =(String)request.getParameter("user");
            if(user!=null)
            {
                session.setAttribute("userSess", user);
                application.setAttribute("userApp",user);
                pageContext.setAttribute("userPageCtx",user);
            }
            String userPageCtx =(String) pageContext.getAttribute("userPageCtx");
            String userSess = (String) session.getAttribute("userSess");
            String userApp = (String) application.getAttribute("userApp");
            
          out.println(" Request : "+user+"</br>");
          out.println(" Session : "+userSess+"</br>");
          out.println(" Application : "+userApp+"</br>");
          out.println(" page Context : "+userPageCtx+"</br>");
        %>
    </body>
</html>
