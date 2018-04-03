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
public class StudentModel {
    private int id,age;
    private String name;
    
    public int getID()
    {
        return id;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name= name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}
