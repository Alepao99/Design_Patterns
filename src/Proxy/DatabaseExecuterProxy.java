/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

/**
 *
 * @author aless
 */
public class DatabaseExecuterProxy implements DatabaseExecuter {
    
    private boolean ifAdmin;
    private DatabaseExecuterImpl dbExecuter;
    
    public DatabaseExecuterProxy(String name, String passwd) {
        if (name == "Admin" && passwd == "Admin@123") {
            this.ifAdmin = true;
            this.dbExecuter = new DatabaseExecuterImpl();
        }
    }
    
    @Override
    public void executeDatabase(String query) throws Exception {
        if (this.ifAdmin) {            
            this.dbExecuter.executeDatabase(query);
        } else {
            if (query.equals("DELETE")) {
                throw new Exception("DELETE not allowed for non-admin user");
            } else {
                this.dbExecuter.executeDatabase(query);
            }
        }
    }
}
