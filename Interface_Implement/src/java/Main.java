
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
public class Main {
    public static void main (String[] args)
    {
        Car car = null;
        Scanner s = new Scanner(System.in);
        int ch = Integer.parseInt(s.next());
        switch (ch)
        {
            case 1:
                car = FactoryClass.getInstance("toyota");
                break;
            case 2: 
                car = FactoryClass.getInstance("BMW");
                break;
            default:
                System.out.print("No car choose ");
                
        }
        
    }
    
}
