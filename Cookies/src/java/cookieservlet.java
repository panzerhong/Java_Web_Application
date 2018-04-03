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
@WebServlet(urlPatterns = {"/cookieservlet"})
public class cookieservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String myname = req.getParameter("name");
        String mypass = req.getParameter("pass");
        Cookie NAME = new Cookie("name",myname);
        Cookie PASS= new Cookie("pass",mypass);
        
//        The resp obj start add from 0 then 1,2,3...
        resp.addCookie(NAME);
        resp.addCookie(PASS);
     
        RequestDispatcher rd =req.getRequestDispatcher("SecondServlet");/*RequestDispatcher - used to forward from 1 servlet to a new servlet*/
        rd.forward(req,resp);/*resp value was transfer to req*/       
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }    
}
