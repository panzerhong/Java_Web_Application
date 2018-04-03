package Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yinma
 */
public class ModelDemo {
    public static void main(String[] args)
    {
        StudentModel sm1 = new StudentModel();
        StudentModel sm2 = new StudentModel();
        StudentModel sm3 = new StudentModel();
        
        sm1.setId(2321);
        sm1.setAge(23);
        sm1.setName("TIN");
        
        sm2.setId(1234);
        sm2.setAge(26);
        sm2.setName("Neth");
        
        System.out.println(sm1.getID());
        System.out.println(sm1.getAge());
        System.out.println(sm1.getName());
        
        System.out.println(sm2.getID());
        System.out.println(sm2.getAge());
        System.out.println(sm2.getName());
        
    }
}
