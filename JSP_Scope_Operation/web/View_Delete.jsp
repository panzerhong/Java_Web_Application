<%-- 
    Document   : View_Delete
    Created on : Feb 15, 2018, 10:25:13 AM
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
        <a href="View.jsp">
            View
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
            
            RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
            rd.forward(request, response);
            %>
        </a>
        <a href="Delete.jsp">Delete</a>
    </body>
</html>
