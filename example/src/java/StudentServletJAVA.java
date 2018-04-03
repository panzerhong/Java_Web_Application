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
/**
 *
 * @author yinma
 */
public class StudentServletJAVA extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        
        //Fetching the info from HTTPServletRequest
        String name = req.getParameter("username");
        String pass = req.getParameter("password");
        
        //Printing on Console (Server log)
        System.out.println("Welcome : "+name);
        System.out.println("Your password : "+pass);
        
        //Generage response webpage
        try
        {
            PrintWriter pw = resp.getWriter();
            pw.println("Welcomer USER : "+name);
            pw.println("Your password : "+pass);
            
            
        }catch(IOException ie)
        {
            System.out.println("Error in project");
        }
    }   
}
