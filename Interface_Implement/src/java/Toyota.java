/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yinma
 */
public class Toyota implements Car{
    @Override 
    public void start()
    {
        System.out.println("Driving Toyota");
    }
    @Override
    public void stop()
    {
        System.out.println("Stopping Toyota");
    }
    
}
