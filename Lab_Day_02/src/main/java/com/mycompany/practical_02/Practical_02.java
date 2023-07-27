/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical_02;

/**
 *
 * @author kanis
 */
public class Practical_02 {

    public static void main(String[] args) {
        Item i1 = new Item();  //becouse paramiterize
//       i1.setData(123, "Kanik");
        i1.setLocation(5);
        System.out.println("Location Is :" +i1.getlocation());
        
        System.out.println("Description Is " +i1.getDescription());
    }
}
