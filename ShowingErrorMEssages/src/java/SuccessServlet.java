/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yinma
 */
@WebServlet(urlPatterns = {"/SuccessServlet"})
public class SuccessServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try
        {
            LinkedList linkedList = (LinkedList) request.getAttribute("errorLinkedList");
            if(linkedList!=null)
            {
                out.println("<font color='red'>");
                out.println("<b>");
                out.println("please correct the following errors..");
                out.println("</b>");
                out.println("</br>");
                out.println("</br>");
                out.println("-------------------------------------------------</br>");
                
                for(int i = 0;i<linkedList.size();i++)
                {
                    out.println("</br>"+(i+1)+"."+linkedList.get(i));
                }
                out.println("</br>");
                out.println("</br>");
                out.println("</font>");
            }
        }
        // TODO output your page here. Y0u may use following
        out.println("<!DOCTYPE html");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>My Servlet</title>");
        out.println("</head>");
        out.println("<form action ='controler' method = 'post'>");
        out.println("Username : <input type='Text' name ='user'/></br>");
        out.println("Pasword : <input type ='password' name='pass' /></br>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
    finally
    {
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
}
