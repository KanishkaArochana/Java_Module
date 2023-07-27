/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical_02;

/**
 *
 * @author kanis
 */
public class Item {
    
    protected int location;
    protected String description;
    
        //Method       
    //Getter and Setter should be Public
   
    public Item(int location,String description){  //Constucter No return type
        //Constacter Name is class name is simmeler
       this.location=location;
        this.description= description;
    }

     //Setter Location                        
    public void setLocation(int location){
        this.location=location;
    }
    //Getter Location
    public int getlocation(){
        return location;
    }
    
    //Setter Description
    public void setDescription(String description){
       this.description=description;
    }
    
    //Getter Description
    public String getDescription(){
        return description;
    }
    
}
