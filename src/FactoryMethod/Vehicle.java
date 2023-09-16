/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author aless
 */
public abstract class Vehicle {
    public abstract int getWheel();
    
    public String toString(){
        return "Wheel: " + this.getWheel();
    }
}
