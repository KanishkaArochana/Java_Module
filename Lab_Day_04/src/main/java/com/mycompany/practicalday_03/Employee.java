/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicalday_03;

/**
 *
 * @author kanis
 */
public class Employee {
    
    private String eName;
    private int eAge;
    private double eSalary;
    
    public Employee(String eName,int eAge,double eSalary){
        this.eName=eName;
        this.eAge=eAge;
        this.eSalary=eSalary;
    }

    

    

    
    //Set eName
   public void setEname(String eName){
       this.eName=eName;
   }
    //Get eName
    public String getEname(){
        return eName;
    }
    
    //Set Age
    public void setEage(int eAge ){
        this.eAge=eAge;
    }
    
//    Get age
    public int getEage(){
        return eAge;
    }
    
//    Set Salary
   public void setEsalary(double eSalary){
       this.eSalary=eSalary;
   }
    
//    Get Salary
    public double getEsalary(){
        return eSalary;
    }
    
}
