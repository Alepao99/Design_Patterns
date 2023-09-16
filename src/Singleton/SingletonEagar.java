/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author aless
 */
public class SingletonEagar {
    private static SingletonEagar instance = new SingletonEagar();
    
    private SingletonEagar(){};
   
    public static SingletonEagar getInstance(){
        return instance;
    }
}
