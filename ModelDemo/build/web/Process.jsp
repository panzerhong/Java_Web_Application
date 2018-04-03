<%-- 
    Document   : Process
    Created on : Feb 20, 2018, 11:10:24 AM
    Author     : yinma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <jsp:useBean class ="Student.StudentModel" id="sm1">
        
        <jsp:setProperty name="sm1" property="name"/>
        <jsp:setProperty name="sm1" property="DOB"/>
        <jsp:setProperty name="sm1" property="sex"/>
        
        <jsp:getProperty name="sm1" property="name"/>
        <jsp:getProperty name="sm1" property="DOB"/>
        <jsp:getProperty name="sm1" property="sex"/>
        
        </jsp:useBean>
    
</html>
