/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.healthcaresystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bjung
 */
public class Verification {
    public boolean userVerification(String Logged, String user){
        if (Logged.equals(user))
            return true;
        else
            return false;
    }
    public boolean TimeVerification(String requested_doctor, String requested_date, String requested_time){
         try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        try{
             Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/HealthcareSystemDB");
             System.out.println("Connection Succeeded");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM APP.APPOINTMENT");
             while (rs.next()) {
                 String date = rs.getString("DATE");
                 String time = rs.getString("TIME");
                 String doctor = rs.getString("DOCTOR");
                 if(doctor.equals(requested_doctor)){
                     if(date.equals(requested_date)){
                         if( time.equals(requested_time)){
                             return false;
                         }
                     }
                 }
             }
         }catch(SQLException e){
            System.err.println(e);
         }return true;
    }
    
}
