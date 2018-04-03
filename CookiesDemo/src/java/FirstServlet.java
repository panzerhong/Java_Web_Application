/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yinma
 */
@WebServlet(urlPatterns = {"/FirstServlet"})
public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String name = request.getParameter("name");
       String pass = request.getParameter("pass");
       
       Cookie userCk = new Cookie ("userName",name);
       Cookie passCk = new Cookie ("pass",pass);
       
       response.addCookie(userCk);
       response.addCookie(passCk);
       
       PrintWriter pw = response.getWriter();
       pw .println("Cookies stored successfully");
       
       RequestDispatcher rd = request.getRequestDispatcher("/SecondServlet");
       rd.forward(request,response);    
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
   
}
