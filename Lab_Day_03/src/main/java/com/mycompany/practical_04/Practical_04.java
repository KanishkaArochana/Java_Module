/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical_04;

/**
 *
 * @author kanis
 */
public class Practical_04 {

    public static void main(String[] args) {
        Employee e1= new Employee(empID,empName,empDesignation);
        e1.setempID(123);
        e1.setempName("Kanishka");
        e1.setempDesignation("jidhaugf");
        
        System.out.println("ID Is: " +e1.getempId());
        System.out.println("name Is :" +e1.getempName());
        System.out.println("Designation :" +e1.getempDesignation());
    }
}
