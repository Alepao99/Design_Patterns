/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iterator;

/**
 *
 * @author aless
 */
public class IteratorMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---> Get animals through Iterator");
        IContainer IContainer = new AnimalContainer();
        IIterator iIterator = IContainer.createIterator();
        while(iIterator.hasNext()){
            Object object = iIterator.next();
            System.out.println(object);
        }
        
        System.out.println("---> Get flowers through Iterator");
        IContainer IContainerF = new FlowerContainer();
        IIterator iIteratorF = IContainerF.createIterator();
        while(iIteratorF.hasNext()){
            Object object = iIteratorF.next();
            System.out.println(object);
        }
    }
    
}
