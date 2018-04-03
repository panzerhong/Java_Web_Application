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

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author yinma
 */
@WebServlet(urlPatterns = {"/HelloWorld"})/*Annotation can be used to tie tge servlet to the URL*/
public class HelloWorld extends HttpServlet {
    private String message;
    
    public void init()throws ServletException{
        // Do required initialization
        message = "Helllo World";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
        //Set response content type
        response.setContentType("text/html");

        
        //Actual logic goes here
        PrintWriter out = response.getWriter();
        out.println("<h1>"+message+"</h1>");
    }
    public void destroy()
    {
        // do nothing
    } 
}
