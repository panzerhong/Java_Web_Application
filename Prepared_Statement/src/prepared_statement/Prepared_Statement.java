/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yinma
 */
public class Prepared_Statement {

    public static void main(String[] args) {
        try {
         int id;
         String name;
         Scanner s=new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kitstudent","root","");
            PreparedStatement ps = con.prepareStatement("insert into student values (?,?)");
            
            System.out.println("Enter id and name : ");
            id = s.nextInt();
            name=s.next();
            ps.setInt(1,id);
            ps.setString(2,name);           
            
            ps.execute();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prepared_Statement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Prepared_Statement.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }    
}
