/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7.q7;

/**
 *
 * @author kanis
 */
public class Undergraduate extends Student {
    
    Override      //Final class can not inheritance(sub class)
                             //Final method can not Override
                             //Final variable can not Change values(Final variable Shoud be Assine value)
    public void display(){
        System.out.println("");
    }
    
}
//Fonal variables cannot have a value initialization assigened to it
//Final methods cannot be overriden
//final classes cannot have subclasses