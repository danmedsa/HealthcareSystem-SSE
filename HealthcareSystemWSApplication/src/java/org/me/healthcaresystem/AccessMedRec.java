/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.healthcaresystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Nikitha Mahesh
 */
@WebService(serviceName = "MedicalRec")
@Stateless()
public class AccessMedRec {
    @WebMethod(operationName = "submit")
    public String submit(@WebParam(name = "doctor_visit_summary") String doctor_visit_summary,@WebParam(name = "lab_result") String lab_result, @WebParam(name = "radiology_report") String radiology_report,  @WebParam(name = "pathology_report") String pathology_report,@WebParam(name = "allergy_information") String allergy_information,@WebParam(name = "prescribed_medicines") String prescribed_medicines,@WebParam(name = "Problem") String Problem,
            @WebParam(name = "Treatment") String Treatment,
            @WebParam(name = "NurseID") String NurseID,
            @WebParam(name = "DoctorID") String DoctorID) {
        //TODO Sign in logic
        try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        System.out.println(doctor_visit_summary+lab_result+radiology_report+pathology_report+allergy_information+prescribed_medicines+Treatment+NurseID+DoctorID);
        try{
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/HealthcareSystemDB");
        System.out.println("Connection Succeeded");
        Statement stmt = con.createStatement();
        String insertStr="INSERT INTO APP.ACCOUNT (NAME,LOGINNAME, PASSWORD,EMAIL,ADDRESS,PHONE,PRIVILIGE) VALUES("
                    +quotate(doctor_visit_summary)+","
                    +quotate(lab_result)+","
                    +quotate(radiology_report)+","
                    +quotate(pathology_report)+","
                    +quotate(allergy_information)+","
                    +quotate(prescribed_medicines)+","
                    +quotate(Treatment)+","
                    +quotate(NurseID)+","
                    +quotate(DoctorID)
                    +")";
        System.out.println(insertStr);
                stmt.executeUpdate(insertStr);
                System.out.println(doctor_visit_summary+lab_result+radiology_report+pathology_report+allergy_information+prescribed_medicines+Treatment+NurseID+DoctorID);
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
    
     @WebMethod(operationName = "validateData")
    public Boolean validateData(@WebParam(name = "doctor_visit_summary") String doctor_visit_summary,@WebParam(name = "lab_result") String lab_result, 
            @WebParam(name = "radiology_report") String radiology_report, @WebParam(name = "pathology_report") String pathology_report,@WebParam(name = "allergy_information") String allergy_information,@WebParam(name = "prescribed_medicines") String prescribed_medicines,
            @WebParam(name = "Problem") String Problem,
            @WebParam(name = "Treatment") String Treatment,
            @WebParam(name = "NurseID") String NurseID,
            @WebParam(name = "DoctorID") String DoctorID
            ) 
    
    
    
    
    {
        //TODO write your implementation code here:
        Security sec = new Security();
        
        String doc_dec = sec.decrypt(doctor_visit_summary);
        String lab_dec = sec.decrypt(lab_result);
        String radiology_dec = sec.decrypt(radiology_report);
        String pathology_dec = sec.decrypt(pathology_report);
        String allergy_info_dec = sec.decrypt(allergy_information);
        String medicines_dec = sec.decrypt(prescribed_medicines);
        String Problem_dec = sec.decrypt(Problem);
        String Treatment_dec = sec.decrypt(Treatment);
        String Nurse_dec = sec.decrypt(NurseID);
        String Doctor_dec = sec.decrypt(DoctorID);
        
        System.out.println(doc_dec+""+lab_dec+""+radiology_dec+""+pathology_dec+""+allergy_info_dec +""+ medicines_dec+"" +Problem_dec+"" +Treatment_dec+"" +Nurse_dec+"" +Doctor_dec);
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMedicalRecord")
    public String getMedicalRecord(@WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        String data = "";
        Security sec = new Security();
        String user = sec.decrypt(username);
        try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        
        try{
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/HealthcareSystemDB");
        Statement stmt = con.createStatement();
        System.out.println("Connection Succeeded " + user);
         //String name = HealthcareSystemGUI.username_txt.getText();
         //System.out.println(name);
            String sql = "SELECT * FROM APP.MEDICALRECORD WHERE USERNAME=?";
            PreparedStatement pst= null;
           
            pst= con.prepareStatement(sql);
            pst.setString(1, user);
            ResultSet rs = pst.executeQuery();
        //System.out.println(rs);


       //ResultSet rs = stmt.executeQuery("select * from medicalrecord where id=1");
        
        while (rs.next()) {
             String dvisit = rs.getString("DOCTORVISIT");
            System.out.println(dvisit);
            data += dvisit+"*";
            data += rs.getString("LABRESULT")+"*";
            data += rs.getString("RADIOLOGYREPORT")+"*";
            data += rs.getString("PATHOLOGYREPORT")+"*";
            data += rs.getString("ALLERGYINFO")+"*";
            data += rs.getString("PRESCRIBEDMED")+"*";
            data += rs.getString("PROBLEM")+"*";
            data += rs.getString("TREATMENT")+"*";
            data += rs.getString("NURSEID")+"*";
            data += rs.getString("DOCTORID")+"*";
            System.out.println(data);

        } 
        }catch(Exception e){
            System.err.println(e);
            e.printStackTrace();
            return "Invalid";
        }               
    
    
        return data;
    }   
    
}
