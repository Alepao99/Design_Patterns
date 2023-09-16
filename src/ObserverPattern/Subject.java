/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ObserverPattern;

/**
 *
 * @author aless
 */
public interface Subject {

    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers();
}

