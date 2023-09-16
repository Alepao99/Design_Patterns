/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proxy;

/**
 *
 * @author aless
 */
public class ProxyMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        DatabaseExecuter nonAdminExecuter = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
       // nonAdminExecuter.executeDatabase("DELETE");

        DatabaseExecuter adminExecuter = new DatabaseExecuterProxy("Admin", "Admin@123");
        adminExecuter.executeDatabase("DELETE");
    }

}
