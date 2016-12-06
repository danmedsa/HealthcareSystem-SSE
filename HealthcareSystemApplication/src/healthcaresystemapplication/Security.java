/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystemapplication;

import java.util.Arrays;

/**
 *
 * @author DanielMedina
 */
public class Security {
    
    public String encrypt(String data){
        System.out.println("Decrypted Data: " + data);
        char[] prep = data.toCharArray();
        char[] encrypted = new char[prep.length];
        for(int i = 0; i < prep.length; i++){
            encrypted[i] = (char) (prep[i] + 1);
        }
        System.out.println("Ecrypted data: " + String.valueOf(encrypted));
        return String.valueOf(encrypted);
    }
    
    public String decrypt(String data){
        System.out.println("Encrypted Data: " + data);
        char[] prep = data.toCharArray();
        char[] decrypted = new char[prep.length];
        for(int i = 0; i < prep.length; i++){
            decrypted[i] = (char) (prep[i] - 1);
        }
        System.out.println("Decrypted data: " + String.valueOf(decrypted));
        return String.valueOf(decrypted);
    }

    public static String genUniqueID(java.lang.String username) {
        org.me.healthcaresystem.HealthcareSystemWS_Service service = new org.me.healthcaresystem.HealthcareSystemWS_Service();
        org.me.healthcaresystem.HealthcareSystemWS port = service.getHealthcareSystemWSPort();
        return port.genUniqueID(username);
    }
 
    public static String checkRepudiation(java.lang.String username, java.lang.String cRId) {
    org.me.healthcaresystem.HealthcareSystemWS_Service service = new org.me.healthcaresystem.HealthcareSystemWS_Service();
    org.me.healthcaresystem.HealthcareSystemWS port = service.getHealthcareSystemWSPort();
    return port.checkRepudiation(username, cRId);
    }
}
