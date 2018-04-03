<%-- 
    Document   : index
    Created on : Feb 20, 2018, 10:54:18 AM
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
        <%--<jsp:useBean class="Student.StudentModel" id="sm1">
        <%
            sm1.setId(123);
            sm1.setAge(100);
            sm1.setName("YIN MAZATIN");
            
            
            out.println(sm1.getID());
            out.println(sm1.getAge());
            out.println(sm1.getName());
        %>
        </jsp:useBean>--%>
        
        <form action ="Process.jsp">
            <input type="text" name="name"/>
            <input type="text" name="sex"/>
            <input type="Date" name="DOB"/>
            <input type="submit" value="Click"/>
            
        </form>
    </form
    </body>
</html>
