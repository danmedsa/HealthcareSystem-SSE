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
public class ACCcon {
     public boolean RoleCheck(String username){
        try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        try{
             Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/HealthcareSystemDB");
             System.out.println("Connection Succeeded");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM APP.USERS");
             while (rs.next()) {
                 String user = rs.getString("USERNAME");
                 int userid = rs.getInt("ROLE");
                 if(user.equals(username)){
                     if( Roles(userid)== 1){
                         
                         return true;
                         
                     }
                }
             }
         }catch(SQLException e){
            System.err.println(e);
            
         }return false;
  }
     public int Roles(int i){
         if(i == 1)
         {
             System.out.println("client is patient");
             return 1;
         }
         else if(i == 2)
         {
             System.out.println("client is doctor");
             return 2;
         }
         return 0;
     }
}
