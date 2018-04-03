/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DB {

    public static void main(String[] args){
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");/*Call driver from the library*/
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Football Legend","root","");
            /* make te connection from the Database to the driver via creating object reference "c"*/
            Statement stt =c.createStatement(); /* create the statement object "stt" for */
            ResultSet s = stt.executeQuery("select * from player");
            
            while(s.next())
            {
                String name = s.getString("name");
                int goal = s.getInt("goal");
                String nationality = s.getString("nationality");
                
                System.out.print(name+"     ");
                System.out.print(goal+"     ");
                System.out.print(nationality+"     ");
                System.out.println("\n\n");
            }
            
        String name = null;
        String nationality = null;
        int goal = 0;
        System.out.println("Enter the data");
        Scanner se = new Scanner(System.in);
        name = se.next();
        goal = se.nextInt();
        nationality = se.next();
        stt.execute("insert into player values('"+name+"','"+goal+"','"+nationality+"') " );
        
            
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DBDemo.class.getName()).log(Level.SEVERE,null,ex);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(DBDemo.class.getName()).log(Level.SEVERE,null,ex);
        }
        
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/kitstudent","root","");
//        Statement stt = c.createStatement();
//        ResultSet s = stt.executeQuery("select * from student");
//        while(s.next()){
//            String name = s.getString("name");
//            int id = s.getInt("id");
//            System.out.println(name);
//            System.out.println(id);
//        }
    }
}
