/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.healthcaresystem;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;



/**
 *
 * @author senso
 */
@WebService(serviceName = "CreateAcc")
@Stateless()
public class CreateAcc {
    
    int uniqueid = 1;

    @WebMethod(operationName = "submitNewAcc") 
    public String submitNewAcc(@WebParam(name = "fname") String fname,@WebParam(name = "lname") String lname,@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "email1") String email1, @WebParam(name = "add1") String add1,@WebParam(name = "phone1") String phone1,@WebParam(name = "privilige1") String privilige1) {
        //TODO Sign in logic
        try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        System.out.println(fname +lname +username+password+email1+add1+phone1);
        
        try{
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/HealthcareSystemDB");
        System.out.println("Connection Succeeded");
        Statement stmt = con.createStatement();
        String insertStr="INSERT INTO APP.USERS (ID,FIRSTNAME,LASTNAME,USERNAME,PASSWORD,EMAIL,ROLE,RID,ADDRESS,PHONE) VALUES("
                +(++uniqueid)+", "    
                +quotate(fname)+","
                +quotate(lname)+","
                +quotate(username)+","
                +quotate(password)+","
                +quotate(email1)+","
                +privilige1+","
                +quotate("nil")+","
                +quotate(add1)+","
                +quotate(phone1)
                +")";
        System.out.println(insertStr);
                stmt.executeUpdate(insertStr);
                //System.out.println(submitNewAcc(fname,lname,username,password,email1,add1,phone1,privilige1));
        }
        catch(SQLException e){
            System.err.println(e);
            return "Invalid";
        }                 
        return "Success";
    }
    
    
   @WebMethod(operationName = "Adding")
    public String Adding(@WebParam(name = "username") String username, @WebParam(name = "doctor") String doctor, @WebParam(name = "date") String date, @WebParam(name = "time") String time) {
        //TODO write your implementation code here:
        try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        System.out.println(username+doctor+date+time);
        try{
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/HealthcareSystemDB");
        System.out.println("Connection Succeeded");
        Statement stmt = con.createStatement();
        String insertStr="INSERT INTO APP.ACCOUNT (USERNAME, DOCTOR, DATE, TIME) VALUES("
                    +quotate(username)+","
                    +quotate(doctor)+","
                    +quotate(date)+","
                    +quotate(time)
                    +")";
        System.out.println(insertStr);
                stmt.executeUpdate(insertStr);
                System.out.println(Adding(username,doctor,date,time));
        }
        catch(SQLException e){
            System.err.println(e);
            return "Invalid";
        }                 
        return "Success";
    }
    public String quotate(String content){
    
        return "'"+content+"'";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "privilige1")
    public String privilige1(@WebParam(name = "privilige") String privilige) {
        //TODO write your implementation code here:
        return null;
    }
    
     @WebMethod(operationName = "validateNewAcc")
    public Boolean validateNewAcc(@WebParam(name = "fname") String fname,@WebParam(name = "lname") String lname,@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "email1") String email1,@WebParam(name = "add1") String add1,@WebParam(name = "phone1") String phone1,@WebParam(name = "privilige1") String privilige1) {
        //TODO write your implementation code here:
        Security sec = new Security();
        
        String fname_dec = sec.decrypt(fname);
        String lname_dec = sec.decrypt(lname);
        String username_dec = sec.decrypt(username);
        String password_dec = sec.decrypt(password);
        String email1_dec = sec.decrypt(email1);
        String add1_dec = sec.decrypt(add1);
        String phone1_dec = sec.decrypt(phone1);
        String privilige1_dec = sec.decrypt(privilige1);
        
        System.out.println(fname_dec+""+lname_dec+""+username_dec+""+password_dec+""+email1_dec+""+add1_dec +""+ phone1_dec+"" +privilige1_dec);
        return true;
    }
}
