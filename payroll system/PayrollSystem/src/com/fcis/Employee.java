/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcis;

import java.util.ArrayList;

/**
 *
 * @author emadh
 */
public abstract class Employee {
    
    
    protected  int ID ;
    protected String Name;
    protected double Salary;
    protected int Age;
    protected String Department;
    protected String Gender;

    
    
    public  Employee(String Name,String Department, int Age , String Gender)
    {
        
        this.Name = Name;
        this.Department=Department;
        this.Age = Age;
        this.Gender= Gender;
        
    }
    
      public Employee ()
    {
        Name=null;
    }
    
      
        public double getSalary() {
        return Salary;
    }

        

        
    public abstract boolean Remove(int id);

    public abstract Object DisplayAll ();
    

    
    
    
    
    
    
    
    
    
    
}
