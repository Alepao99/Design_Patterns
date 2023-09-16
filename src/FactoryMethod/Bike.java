/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author aless
 */
public class Bike extends Vehicle{
    private int bike;

    public Bike(int bike) {
        this.bike = bike;
    }
    @Override
    public int getWheel() {
        return this.bike;
    }
    
}
