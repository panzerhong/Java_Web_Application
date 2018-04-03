/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 
 * HTTPSession 
 * store, remove data by using the session from HTTP session
 * when user stop interact, when user access the webpage cannot identify who you are
 */
public class servletsession extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("user");
        String pass = req.getParameter("pass");
        
        HttpSession se = req.getSession();
        
        PrintWriter pw = resp.getWriter();
        
        se.setAttribute("name",name);
        se.setAttribute("pass", pass);
        pw.println("Username : "+name+",Password : "+pass);pw.println("<\n>");
        pw.println("Object "+se);
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.x
    }
}
