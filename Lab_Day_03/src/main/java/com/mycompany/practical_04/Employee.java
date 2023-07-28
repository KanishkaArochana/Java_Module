/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical_04;

/**
 *
 * @author kanis
 */
public class Employee {
    private int empID;
    private String empName;
    private String empDesignation;
    
   public Employee(int empID,String empName,String empDesignation){
    
       this.empID=empID;
       this.empName=empName;
       this.empDesignation=empDesignation;
}
   public void setempID(int empID){
       this.empID=empID;
   }
   public int getempId(){
       return empID;
   }
   
   public void setempName(String empName){
       this.empName=empName;
   }
   
    public String getempName(){
       return empName;
   }
   
   public void setempDesignation(String empDesignation){
       this.empDesignation=empDesignation;
   }
   public String getempDesignation(){
       return empDesignation;
   }
}
