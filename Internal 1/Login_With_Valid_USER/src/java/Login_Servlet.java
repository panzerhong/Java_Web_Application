/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yinma
 */
@WebServlet(urlPatterns = {"/Login_Servlet"})
public class Login_Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
        PrintWriter pw = response.getWriter();
        pw.println("IN GET");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
        String name =request.getParameter("name");
        String pass =request.getParameter("pass");
        PrintWriter pw = response.getWriter();
        if(name.equals("yinmazatin")&&pass.equals("1234"))
        {
            
            pw.println("Your UN = "+name+"Your PW = "+pass+" is right");
        }
        else
        {
            pw.println("Your UN = "+name+"Your PW = "+pass+" is wrong");
        }
    }
}