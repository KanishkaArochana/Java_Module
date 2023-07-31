/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trafficlight;

/**
 *
 * @author kanis
 */
public class TrafficLight {

    public static void main(String[] args) {
       RedLightThread r1 = new RedLightThread();
       GreenLightThread g1 = new GreenLightThread();
       YellowLightThread y1 = new YellowLightThread();
       
       r1.start();
       g1.start();
       y1.start();
    }
    
}
