/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.healthcaresystem;

import java.sql.*;
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
        System.out.println("Prep data: " + Arrays.toString(prep));
        char[] decrypted = new char[prep.length];
        for(int i = 0; i < prep.length; i++){
            decrypted[i] = (char) (prep[i] - 1);
        }
        System.out.println("Decrypted data: " + String.valueOf(decrypted));
        return String.valueOf(decrypted);
    }
    public String repudiate(String username, String repudiationUID){
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/HealthcareSystemDB");
            Statement stmt = con.createStatement();
            System.out.println("Connection Succeeded");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM APP.USERS");
            
            while (rs.next()) {
                String user = rs.getString("USERNAME");
                String r_id = rs.getString("RID");
                System.out.println(user +" "+ r_id+" : "+ username+ " " + repudiationUID);
                //username = "daniel";
                if(!user.equals(username)){
                    return "Payment Repudiated: Inconsistency Detected with Username";
                }
                if(!r_id.equals(repudiationUID)){
                    return "Payment Repudiated: Inconsistency Detected with RepudiationID";
                }
            }
        }catch(SQLException e){
            System.err.println(e);
            return "Error Accessing Database: ";
        }
        
        return "Payment Succeeded";
        
        
    }

}
