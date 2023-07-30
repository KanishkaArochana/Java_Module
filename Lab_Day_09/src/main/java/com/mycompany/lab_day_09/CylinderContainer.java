/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_day_09;

/**
 *
 * @author kanis
 */
public class CylinderContainer extends Container  {
    
    private double height;
    private double radius;
    
    public CylinderContainer(double hight,double radius){
         this.height =hight;
         this. radius=radius;
        
    }
   @Override
    public double Volume(){
       
       double volume=Math.PI*radius*radius*height;

      return volume;
}
}
