/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yinma
 */
@WebServlet(urlPatterns = {"/DemoServlet"})
/*Servlet Context*/
public class DemoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        
        //creating the ServletContext object
        ServletContext context = getServletContext();
        
        //Getting the value of the initalization parameter andprinting it 
        String driverName = context.getInitParameter("dname");
        pw.println("driver name is ="+driverName);
        
        pw.close();
    } 
}

