/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decoretor;

/**
 *
 * @author aless
 */
public class SportyDress extends DressDecorator{

    public SportyDress(Dress c) {
        super(c);
    }

    @Override
    public void assemble() {
        dress.assemble();
        System.out.println("Adding Sporty Dress Features");
    }
    
}
