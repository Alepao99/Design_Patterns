/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton;

/**
 *
 * @author aless
 */
public class SingletonExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingletonEagar instance = SingletonEagar.getInstance();
        System.out.println(instance);

        SingletonEagar instance1 = SingletonEagar.getInstance();
        System.out.println(instance1);

        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2);

        Singleton instance3 = Singleton.getInstance();
        System.out.println(instance3);
    }

}
