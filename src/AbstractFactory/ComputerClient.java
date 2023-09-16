/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author aless
 */
public class ComputerClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer(new PCFactory("2 GB", "500 GB", "2.4 Ghz"));
        Computer server = ComputerFactory.createComputer(new ServerFactory("2 GB", "500 GB", "2.4 Ghz"));
        System.out.println(pc);
        System.out.println(server);
    }
    
}
