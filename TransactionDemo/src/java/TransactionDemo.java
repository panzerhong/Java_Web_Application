
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yinma
 */
public class TransactionDemo {

    public static Connection getCon() {
        return null;

    }

    public static void debit(int acno, int amt) throws SQLException {
        Statement stt = con.createStatement();
        stt.execute("update bank set balance = balance -'" + amt + "' where acno='" + acno + "'");
    }
    

    public static void credit(int acno, int amt, Connection con) throws
             {
        Statement stt = con.createStatement();
        stt.execute("update bank set balance = balance +'" + amt + "' where acno='" + acno + "'");
    }

    public static void main(String[] args) {
        int debAc, creAc, amt;
        Connection con = getCon();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the acno and amt to be debited");
        debAc = s.nextInt();
        amt = s.nextInt();

        System.out.println("Enter the acno to be credited : ");
        try {
            debit(debAc, amt, con);
            credit(creAc, amt, con);
        } catch (Exception e) {
            System.out.println("There is no ")
        } 
    }
}
