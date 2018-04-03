/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yinma
 */
public class SecondServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter pw = response.getWriter();
        Cookie e[] = request.getCookies();
        for(int i=0;i<=e.length;i++)
        {
            pw.println(e[i].getName().toString()+" : "+e[i].getValue());
//            pw.println(e[i].getPath().toString()+" : " +e[i].getValue());
        }
        
    }
}
