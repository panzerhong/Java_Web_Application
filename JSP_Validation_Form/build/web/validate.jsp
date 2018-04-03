<%-- 
    Document   : validate
    Created on : Feb 9, 2018, 11:03:56 AM
    Author     : yinma
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = request.getParameter("name");
            String dob = request.getParameter("dob");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String password = request.getParameter("password");
            String CP = request.getParameter("confirmpassword");
            ArrayList<String> error= new ArrayList();
            
            // Empty Validation
            if (name.isEmpty()||dob.isEmpty()||email.isEmpty()||password.isEmpty()||CP.isEmpty())
            {
                error.add("Please input all relevant information");
//                out.println("Please input all the relevant information");
            }
          
            // NAME Validation
            char chname[] = name.toCharArray(); // Convert stirng to the character array.
            for(int i=0;i<chname.length;i++){
                if(Character.isDigit(chname[i]) ){
                    error.add("name cannot include number");
                    //out.println("name cannot include number");
                    break;
                }
            }
            for(int i=0;i<chname.length;i++){
                if(!Character.isLetter(chname[i]) ){
                    //out.println("name cannot include special number");
                    error.add("name cannot include special number");
                    break;
                }
            }
            
            // Password Validation
            if(!password.matches("?=.*[0-9]")){
               error.add("password must include the digit and special symbol");
            }
            else if(!password.matches("(?=.*[a-z])"))
            {
                error.add("password must include the digit and special symbol");
            }
            else if (!password.matches("?=.*[A-Z]"))
            {
                error.add("password must include the digit and special symbol");
            }
            else if (!password.matches("?=.*[@#$%^&+=]"))
            {
                error.add("password must include the digit and special symbol");
            }
            else if(!password.matches(".{8,}"))
            {
                error.add("Password must be at least 8 digits");
            }
            else if(!password.matches("?=\\S+$"))
            {
                error.add("Password must not include white space");
            }
            
            else if (!password.equals(CP))
            {
               error.add("Your password and confirm password is incorrect");
            }
            else
            {
                session.setAttribute("name",name);
                session.setAttribute("dob", dob);
                session.setAttribute("email",email);
                session.setAttribute("password",password);
                RequestDispatcher rd = request.getRequestDispatcher("SuccessSignUp.jsp");
                rd.forward(request, response);
            }
            
            // Phone number validation 
            if(!phone.matches("?=.*[0-9]"))
            {
                error.add("PhoneNumber must be digit");
            }
           
        %>
    </body>
</html>
