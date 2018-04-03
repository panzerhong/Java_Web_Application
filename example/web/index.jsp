<%-- 
    Document   : index
    Created on : Nov 22, 2017, 10:43:46 AM
    Author     : yinma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MY INDEX Page</title>
    </head>
    
    <body>
        <form action="StudentServletJAVA" method="get">
            User name : <input type="text" name="username" method="post"/><br>
            Password : <input type="password" name="password" method="post"><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
