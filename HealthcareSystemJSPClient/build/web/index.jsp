<%-- 
    Document   : index
    Created on : Nov 22, 2016, 12:38:46 AM
    Author     : DanielMedina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Healthcare System</title>
    </head>
    <body>
        <h1>Healthcare System</h1>
        <h2>by Fantastic Four</h2> 
            <%-- start web service invocation --%><hr/>
        <%
        try {
            org.me.healthcaresystem.HealthcareSystemWS_Service service = new org.me.healthcaresystem.HealthcareSystemWS_Service();
            org.me.healthcaresystem.HealthcareSystemWS port = service.getHealthcareSystemWSPort();
             // TODO initialize WS operation arguments here
            java.lang.String username = "";
            java.lang.String password = "";
            // TODO process result here
            java.lang.String result = port.signIn(username, password);
            out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        %>
        <%-- end web service invocation --%><hr/>

    </body>
</html>
