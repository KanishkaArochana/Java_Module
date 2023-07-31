/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trafficlight;

/**
 *
 * @author kanis
 */
public class RedLightThread extends Thread {
    
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Red");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        
    }
}
