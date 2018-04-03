<%-- 
    Document   : index
    Created on : Feb 15, 2018, 9:11:00 AM
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
            String userReq = (String)request.getParameter("user"); // To Request the particular data
            
            if(userReq!=null)
            {
                // work the same way as the above code
//                pageContext.setAttribute("userPageCtx",userReq,PageContext.REQUEST_SCOPE);
                pageContext.setAttribute("userSess",userReq,PageContext.SESSION_SCOPE);
                pageContext.setAttribute("userApp",userReq,PageContext.APPLICATION_SCOPE);
                pageContext.setAttribute("userPageCtx",userReq,PageContext.PAGE_SCOPE);
                
//                session.setAttribute("userSess",userReq);
//                application.setAttribute("userApp",userReq);
//                pageContext.setAttribute("userPageCtx",userReq);
            }
//            String userPageCtx = (String)pageContext.getAttribute("userPageCtx"); // New Tap 
//            String userSess = (String)session.getAttribute("userSess");
//            String userApp = (String)application.getAttribute("userApp");
//          
//            
//            out.println(" Request : "+userReq+"</br>");
//            out.println(" Session : "+userSess+"</br>");
//            out.println(" Application : "+userApp+"</br>");
//            out.println(" page Context : "+userPageCtx+"</br>");
        %>
    </body>
</html>
