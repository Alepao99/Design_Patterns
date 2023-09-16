/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author aless
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car", 4);
        Vehicle bike = VehicleFactory.getInstance("bike", 2);
        
        System.out.println(car);
        System.out.println(bike);
        
    }

}
