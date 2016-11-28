package org.me.healthcaresystem;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import java.sql.*;

/**
 *
 * @author DanielMedina
 */
@WebService(serviceName = "HealthcareSystemWS")
@Stateless()
public class HealthcareSystemWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "signIn")
    public String signIn(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO Sign in logic
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
            String pass = rs.getString("PASSWORD");
            System.out.println(user +" "+ pass);
            
            if(!user.equals(username)){
                return "Invalid";
            }
            if(!pass.equals(password)){
                return "Invalid";
            }

            
        }
        }catch(SQLException e){
            System.err.println(e);
            return "Invalid";
        }                 
    
        
        return "Success";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SignOut")
    public Boolean SignOut() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validateCard")
    public Boolean validateCard(@WebParam(name = "cardNumber") String cardNumber, @WebParam(name = "expDate") String expDate, @WebParam(name = "CVV") String CVV) {
        //TODO write your implementation code here:
        Security sec = new Security();
        
        String cardNumber_dec = sec.decrypt(cardNumber);
        String expDate_dec = sec.decrypt(expDate);
        String CVV_dec = sec.decrypt(CVV);
        
        if(cardNumber.length() != 12){
            System.out.print("Error with Card Number");
            return false;
        }
        
        if(expDate_dec.charAt(2) != '/') {
            System.out.print("Error 1 with Expiration Date: " + expDate_dec.charAt(0) + expDate_dec.charAt(1));
            return false;
        }
        if(expDate_dec.length() != 5){
            System.out.print("Error 2 with Expiration Date: " + expDate_dec.charAt(0) + expDate_dec.charAt(1));
            return false;
        }
        
        
        if(expDate_dec.charAt(0) == '1'){
            if(expDate_dec.charAt(1) > '2' ){
                System.out.print("Error 3 with Expiration Date: " + expDate_dec.charAt(0) + expDate_dec.charAt(1));
            return false;
            }         
        }
        
        if(expDate_dec.charAt(0) == '0'){
                if(expDate_dec.charAt(1) == '0'){
                    System.out.print("Error 4 with Expiration Date: " + expDate_dec.charAt(0) + expDate_dec.charAt(1));
                    return false;
                }
        }
        
        
        
        if(CVV.length() != 3){
            System.out.print("Error with CVV");
            return false;
        }
        
        return true;
    }
}
