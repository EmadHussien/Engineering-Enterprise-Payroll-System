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
public class Engineer extends Employee 
{
     private Double Grade;
     private double work_hours;
     private double tax_rate;
     private double pay_rate;
     private String Position;
     private static int countID =0  ;
     private double base_salary;
     private double taxes;


     private static ArrayList<Engineer> Eng =new ArrayList<Engineer>();

     
     
     
     
     
     public  Engineer (String Name,String Department, int Age , String Gender)
     {
      super( Name, Department,  Age ,  Gender);
      Grade=0.0;
      work_hours=0.0;
      tax_rate=0.0;
      pay_rate=0.0;
      Position="";
      base_salary=0.0;
      taxes=0.0;
      ID=++countID;
     
         
     }
     public  Engineer ()
     {
         Name=null;
         Grade=0.0;
         work_hours=0.0;
         tax_rate=0.0;
         pay_rate=0.0;
         Position="";
         base_salary=0.0;
         taxes=0.0;
     
     }

      public  void Add_Engineer( Engineer E)
    {
        Eng.add(E);
       //  System.out.println("Added Succesed ");
    }
      
     
     public void Edit_Eng(Engineer E)
    {
         for (int i=0;i<Eng.size();i++)
        {               
            if(Eng.get(i).getID()==E.getID())
            {
               Eng.set(i,E);
               break;
               
            }
        }
    }

    public  boolean Remove(int id)
    {
        for (int i=0;i<Eng.size();i++)
        {
            if(Eng.get(i).ID == id)
            {
                Eng.remove(i);
                return true ;
            }
        }

        return false ;
    }
    
      @Override
       public double getSalary() {
        base_salary = (work_hours*pay_rate);
        taxes = (tax_rate/100)*base_salary;
        Salary = base_salary - taxes ;
        
        return Salary;
    }

  
      @Override
        public  Object DisplayAll ()
        {
                Object RowData [][] = new Object [Eng.size()][10];
     
                for(int i=0 ; i<Eng.size();i++)
                {
                    RowData[i][0]=Eng.get(i).ID;
                    RowData[i][1]=Eng.get(i).Name;
                    RowData[i][2]=Eng.get(i).Department;
                    RowData[i][3]=Eng.get(i).getSalary();
                    RowData[i][4]=Eng.get(i).Age;
                    RowData[i][5]=Eng.get(i).Gender;
                    RowData[i][6]=Eng.get(i).getPosition();
                    RowData[i][7]=Eng.get(i).getWork_hours();
                    RowData[i][8]=Eng.get(i).getPay_rate();
                    RowData[i][9]=Eng.get(i).getTax_rate();


                   }
                return RowData;
        }

       
       
      
        public static int Eng_count()
    {
        return Eng.size();
    }
     
     
            public static  ArrayList<Engineer> getEng() {
        return Eng;
    }

   
      
        
        
     
     
     
    public  int getID() {
        return ID;

    }
     
     
     
     

    public Double getGrade() {
        return Grade;
    }

    public void setGrade(Double Grade) {
        this.Grade = Grade;
    }

    public double getWork_hours() {
        return work_hours;
    }

    public void setWork_hours(double work_hours) {
        this.work_hours = work_hours;
    }

    public double getTax_rate() {
        return tax_rate;
    }

    public void setTax_rate(double tax_rate) {
        this.tax_rate = tax_rate;
    }

    public double getPay_rate() {
        return pay_rate;
    }

    public void setPay_rate(double pay_rate) {
        this.pay_rate = pay_rate;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public static int getCountID() {
        return countID;
    }
     
    
    
    
    
    
    
    
}
