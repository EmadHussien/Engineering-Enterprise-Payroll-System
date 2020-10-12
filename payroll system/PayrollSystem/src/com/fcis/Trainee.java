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
public class Trainee extends Employee {
    
  private  String Universty_Name;
  private double GPA;
  private int  Academic_year;
  private static int countID =0  ;


  private static ArrayList<Trainee> Train=new ArrayList<Trainee>();

      
     public  Trainee (String University_Name,Double GPA,int Academic_year,String Name,String Department, int Age , String Gender)
     {
      super( Name, Department,  Age ,  Gender);
      this.Universty_Name = University_Name;
      this.GPA = GPA;
        this.Academic_year = Academic_year;
        ID = ++countID;
     
         
     }
     public  Trainee ()
     {
      Name=null;
      Universty_Name="";
      GPA=0.0;
     Academic_year=0;
     
     }
     
     
      public  void Add_trainee(Trainee T)
    {
        Train.add(T);
    }
    
      
        public void Edit_Trainee(Trainee T)
    {
        
     for (int i=0;i<Train.size();i++)
        {               
            if(Train.get(i).getID()==T.getID())
            {
               Train.set(i,T);
               break;
               
            }
        }
    }
    
        
         
    public  boolean Remove(int id)
    {
        for(int i=0;i<Train.size();i++)
        {
            
             if(Train.get(i).ID == id)
            {
                Train.remove(i);
                return true;
            }
            
            
        }
        return false ;
    }
   
   
   
   @Override
    public  Object DisplayAll ()
    {
        
        Object RowData [][] = new Object [Train.size()][9];

        for(int i=0 ; i<Train.size();i++)
        {
            RowData[i][0]=Train.get(i).ID;
            RowData[i][1]=Train.get(i).Name;
            RowData[i][2]=Train.get(i).Department;
            RowData[i][3]=Train.get(i).getSalary();
            RowData[i][4]=Train.get(i).Age;
            RowData[i][5]=Train.get(i).Gender;
            RowData[i][6]=Train.get(i).getUniversty_Name();
            RowData[i][7]=Train.get(i).getGPA();
            RowData[i][8]=Train.get(i).getAcademic_year();
          

        }
        
        return RowData;
        
    }
    
   
   
     public static int Train_count()
     {
         return Train.size();
     }
    
     
     
    public static ArrayList<Trainee> getTrain() {
        return Train;
    }
     
     
     @Override
         public  double getSalary() {
             Salary=5000.0;
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

         
    
     
     
     
 

    public String getUniversty_Name() {
        return Universty_Name;
    }

    public void setUniversty_Name(String Universty_Name) {
        this.Universty_Name = Universty_Name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getAcademic_year() {
        return Academic_year;
    }

    public void setAcademic_year(int Academic_year) {
        this.Academic_year = Academic_year;
    }

     
     
     
     
     
     
     
     
     
     
    public  int getID() {
        return ID;
    }

    public static int getCountID() {
        return countID;
    }

    
     
     
     
     
     
     
    
}
