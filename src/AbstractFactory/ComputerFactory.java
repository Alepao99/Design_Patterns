/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author aless
 */
public class ComputerFactory {
    public static Computer createComputer(ComputerAbstractFactory caf){
        return caf.createComputer();
    }
}
