/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_day_10_q2;

/**
 *
 * @author kanis
 */
public class Lab_Day_10_Q2 {

    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        
        try{
            int value=arr[10];
            System.out.println("Value" +value);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index not bounus");
        }
//        catch(Exception e){
//            System.out.println("e.getMassage()");
//        }
        finally{
            for(int i=0;i<5;i++){
                System.out.println(" "+arr[i]);
            }
    }
}
}