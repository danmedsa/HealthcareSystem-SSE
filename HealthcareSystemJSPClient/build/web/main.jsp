<%-- 
    Document   : main
    Created on : Nov 22, 2016, 3:08:27 PM
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
        <h1>Logged in Successfully</h1>
        <FORM NAME="Payment" METHOD="POST" ACTION="payment.jsp">
            <INPUT TYPE="SUBMIT" value="Payments">
        </FORM>
         <FORM NAME="MakeAppt" METHOD="POST" ACTION=".jsp">
            <INPUT TYPE="SUBMIT" value="Make Appointment">
        </FORM>
         <FORM NAME="CancelAppt" METHOD="POST" ACTION="payment.jsp">
            <INPUT TYPE="SUBMIT" value="Cancel Appointment">
        </FORM>
    </body>
</html>
