/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author aless
 */
public class ChromeDriver implements WebDriver{

    @Override
    public void getElement() {
        System.out.println("Get element from ChromeDriver");
    }

    @Override
    public void selectElement() {
        System.out.println("Select element from ChromeDriver");
    }
    
}
