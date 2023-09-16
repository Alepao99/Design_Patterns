/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Adapter;

/**
 *
 * @author aless
 */
public class AdapterMethod {

    public static void main(String[] args) {
        ChromeDriver a = new ChromeDriver();
        a.getElement();
        a.selectElement();

        IEDriver b = new IEDriver();
        b.findElement();
        b.clickElement();

        WebDriver c = new WebDriverAdapter(b);
        c.getElement();
        c.selectElement();
    }

}
