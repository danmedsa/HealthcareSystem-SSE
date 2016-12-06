package org.me.healthcaresystem;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import java.sql.*;
import java.util.Random;

/**
 *
 * @author DanielMedina
 */
@WebService(serviceName = "HealthcareSystemWS")
@Stateless()
public class HealthcareSystemWS {
    int uniqueid = 1;
    int count = 0;
    int c; // counter for insert 
    String Logged_user;
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
        Security sec = new Security();
        ResultSet rs = stmt.executeQuery("SELECT * FROM APP.USERS");
        
        while (rs.next()) {
            String user = rs.getString("USERNAME");
            String pass = rs.getString("PASSWORD");
            System.out.println(user +" "+ pass);
            
            if(!user.equals(sec.decrypt(username))){
                return "User "+sec.decrypt(username)+" Not Found";
            }
            else
                Logged_user = user;
            if(!pass.equals(sec.decrypt(password))){
                return "Invalid Password";
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

    /**
     * Web service operation
     */
    public String quotate(String content){
    
        return "'"+content+"'";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Adding")
    public String Adding(@WebParam(name = "username") String username, @WebParam(name = "doctor") String doctor, @WebParam(name = "date") String date, @WebParam(name = "time") String time) {
        //TODO write your implementation code here:
        Security sec = new Security();
        String username_dec = sec.decrypt(username);
        String doctor_dec = sec.decrypt(doctor);
        String date_dec = sec.decrypt(date);
        String time_dec = sec.decrypt(time);
        ACCcon AC = new ACCcon();
        if(AC.RoleCheck(username_dec) == false)
        {
            return "Not the patient";
        }
        Verification VR = new Verification();
        if(VR.userVerification(Logged_user, username_dec) == false)
        {
            return "Invalid User";
        }
        if(VR.TimeVerification(doctor_dec, date_dec, time_dec) == false)
        {
            return "Invalid Time for the Doctor";
        }
        try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        System.out.println(username_dec+doctor_dec+date_dec+time_dec);
        try{
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/HealthcareSystemDB");
        System.out.println("Connection Succeeded");
        Statement stmt = con.createStatement();
           c = stmt.executeUpdate("INSERT INTO APP.APPOINTMENT (ID, \"USERNAME\", \"DOCTOR\", \"DATE\", \"TIME\") VALUES ("
                   +(++uniqueid)+", "
                   +quotate(username_dec)+", "
                   +quotate(doctor_dec)+", "
                   +quotate(date_dec)+", "
                   +quotate(time_dec)+")");
           stmt.close();
           con.close(); 
           count = count+c;
       }
        catch(SQLException e){
            System.err.println(e);
            return "Invalid";        
        }                         
        return "Success";
    }
     

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CANing")
    public String CANing(@WebParam(name = "username") String username, @WebParam(name = "date") String date) {
        //TODO write your implementation code here:
        Security sec = new Security();
        String username_dec = sec.decrypt(username);
        String date_dec = sec.decrypt(date);
        ACCcon AC = new ACCcon();
        if(AC.RoleCheck(username_dec) == false)
        {
            return "Not the patient";
        }
        Verification VR = new Verification();
        if(VR.userVerification(Logged_user, username_dec) == false)
        {
            return "Invalid User";
        }
         try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        System.out.println(username_dec +date_dec );
        try{
                        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/HealthcareSystemDB");
            System.out.println("Connection Succeeded");
            Statement stmt = con.createStatement();
            //String DELStr="DELETE FROM APP.APPOINTMENT WHERE USERNAME = '"+username_dec +"' AND DATE = '"+date_dec +"'";
            System.out.println("SQL: "+ "DELETE FROM APP.APPOINTMENT WHERE USERNAME = "+quotate(username_dec)+" AND DATE = "+quotate(date_dec));
            c = stmt.executeUpdate("DELETE FROM APP.APPOINTMENT WHERE USERNAME = "+quotate(username_dec)+" AND DATE = "+quotate(date_dec));
                       stmt.close();
           con.close(); 
            count = count-c;
        }
        
        catch(SQLException e){
            System.err.println(e);
            return "Invalid";
        }                 
        return "Success";

   }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "MODing")
    public String MODing(@WebParam(name = "username") String username, @WebParam(name = "doctor") String doctor, @WebParam(name = "datefrom") String datefrom, @WebParam(name = "dateto") String dateto, @WebParam(name = "time") String time) {
        //TODO write your implementation code here:
        Security sec = new Security();
        String username_dec = sec.decrypt(username);
        String doctor_dec = sec.decrypt(doctor);
        String datefrom_dec = sec.decrypt(datefrom);
        String dateto_dec = sec.decrypt(dateto);
        String time_dec = sec.decrypt(time);
        ACCcon AC = new ACCcon();
        if(AC.RoleCheck(username_dec) == false)
        {
            return "Not the patient";
        }
        Verification VR = new Verification();
        if(VR.userVerification(Logged_user, username_dec) == false)
        {
            return "Invalid User";
        }
        if(VR.TimeVerification(doctor_dec, dateto_dec, time_dec) == false)
        {
            return "Invalid Time for the Doctor";
        }
        
        try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        System.out.println(username_dec+datefrom_dec);
        try{
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/HealthcareSystemDB");
        System.out.println("Connection Succeeded");
        Statement stmt = con.createStatement();
            System.out.println("SQL: "+ "DELETE FROM APP.APPOINTMENT WHERE USERNAME = "+quotate(username_dec)+" AND DATE = "+quotate(datefrom_dec));
            c = stmt.executeUpdate("DELETE FROM APP.APPOINTMENT WHERE USERNAME = "+quotate(username_dec)+" AND DATE = "+quotate(datefrom_dec));

            count = count-c;
            c = stmt.executeUpdate("INSERT INTO APP.APPOINTMENT (ID, \"USERNAME\", \"DOCTOR\", \"DATE\", \"TIME\") VALUES ("
                    +(++uniqueid)+", "
                    +quotate(username_dec )+", "
                    +quotate(doctor_dec )+", "
                    +quotate(dateto_dec )+", "
                    +quotate(time_dec )+")");        
                    stmt.close();
                    con.close(); 
                    count = count+c;
        }
        catch(SQLException e){
            System.err.println(e);
            return "Invalid";
        }                 
        return "Success";
    }
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "genUniqueID")
    public String getUniqueID(@WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        Random rand = new Random();
        
        String r_id = String.valueOf(rand.nextInt() % 10000000);
        
        //TODO add to database for confirmation
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/HealthcareSystemDB");
            System.out.println("Connection Succeeded");
            Statement stmt = con.createStatement();
            
            String insert_tmt = "UPDATE APP.USERS set RID='"+ r_id +"' where USERNAME = '"+ username +"'";
            
            stmt.executeUpdate(insert_tmt);
            
            System.out.println(insert_tmt);
        }
        catch(SQLException e){
            System.err.println(e);
            return "Error Updating Database RID";
        }
        
        return r_id;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "checkRepudiation")
    public String checkRepudiation(@WebParam(name = "username") final String username, @WebParam(name = "c_r_id") final String c_r_id) {
        //TODO write your implementation code here:
        Security sec = new Security();
        return sec.repudiate(username, c_r_id);
    }

    
 }
