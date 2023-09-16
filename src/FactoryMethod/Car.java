/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author aless
 */
public class Car extends Vehicle{
    private int wheel;

    public Car(int wheel) {
        this.wheel = wheel;
    }
    
    @Override
    public int getWheel() {
        return this.wheel;
    }
    
}
