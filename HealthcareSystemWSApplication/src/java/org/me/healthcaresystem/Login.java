package org.me.healthcaresystem;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import java.sql.*;


@WebService(serviceName = "Login")
@Stateless()
public class Login {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
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
}