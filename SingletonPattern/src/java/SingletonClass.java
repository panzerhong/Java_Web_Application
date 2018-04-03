/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yinma
 */
public class SingletonClass {
    
    static SingletonClass stc = new SingletonClass();
    private SingletonClass()
    {
        
    }
    public void sayHello()
    {
        System.out.println("Hello...");
    }
    public static SingletonClass getInstance() {
        return stc;
//      It will return the static object "stc" from the SingletonClass only.
    }
}
