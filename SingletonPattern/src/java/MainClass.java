/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yinma
 */
public class MainClass {
    public static void main(String args[])
    {
        SingletonClass stc = SingletonClass.getInstance();
        SingletonClass stc1 = SingletonClass.getInstance();
        SingletonClass stc2 = SingletonClass.getInstance();
        stc.sayHello();
        stc1.sayHello();
        stc2.sayHello();
    }
}
