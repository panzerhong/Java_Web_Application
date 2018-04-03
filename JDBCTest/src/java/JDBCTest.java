
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",null,null);
            /*bank = Name of Database, 3306 = Port Number, */
            Statement stt = con.createStatement();
            ResultSet rs = stt.executeQuery("select * from db");
            int id = 0,amt =0;
            String name = null;
            
            while(rs.next())
            {
                id = rs.getInt("acno");
                name = rs.getString("name");
                amt = rs.getInt("balance");
                
                System.out.println("Acno: "+id+" :name : "+" : Balance : "+amt);
                
                
            }
            
        }
        catch(ClassNotFoundException e)
        {
            
        }
        catch(SQLException e)
        {
            
        }
    }
}