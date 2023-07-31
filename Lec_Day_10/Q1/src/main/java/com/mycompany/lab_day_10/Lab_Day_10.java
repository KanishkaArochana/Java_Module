/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_day_10;

/**
 *
 * @author kanis
 */

import java.util.Scanner;
public class Lab_Day_10 {

    public static void main(String[] args) {
        Scanner c1=new Scanner(System.in);
        
        int no1,no2;
        System.out.print("Enter the Number 1 :");
        no1=c1.nextInt();
        
        System.out.print("Enter the Number 2 :");
        no2=c1.nextInt();
        
        try{
            int ans=no1/no2;
            System.out.println("Result "+ans);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed!!!");
//            System.out.println("e.getMassage()");
        }
    }
}
