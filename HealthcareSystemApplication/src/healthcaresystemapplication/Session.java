/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystemapplication;

/**
 *
 * @author DanielMedina
 */
public class Session {
    private String username = "";
    private static Session session = null;
    
    public Session(){
        
    }
    
    public static Session getInstance(){
        if(session == null){
            session = new Session();
        }
        return session;
    }
    
    public void setUsername(String username){
        Security sec = new Security();
        this.username = sec.encrypt(username);
    }
   
    public String getUsername(){
        Security sec = new Security();
        return sec.decrypt(username);
    }
}
