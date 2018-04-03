/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/SecondServlet"})
public class SecondServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        Cookie []ck = request.getCookies();
        for(int i = 0;i<ck.length;i++)
        {
            Cookie ck1 = ck[i];
            pw.println(ck1.getName()+" : "+ck1.getValue()+"\n");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.getCookies();  
    }
    
    @Override
    public String getServletInfo()
    {
        return "Short desciption";
    }    
}
