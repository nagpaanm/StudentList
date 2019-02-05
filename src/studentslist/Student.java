package studentslist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class Student {
   
    private String name;
    private int id;
    private String DoB;
   
    private int maxHours;
    public Student()
    {
        name = "Not Set";
        id = 0;
    }
    public Student(String givenName,int givenId)
    {
        name = givenName;
        id = givenId;
    }
    
    
    public String getName()
    {
           return this.name;
     }
    
    //the setName method was here
    
    public void setId(int givenId)
    {
            this.id = givenId;
    }
    
    public int getId()
    {
        return id;
    }
}
