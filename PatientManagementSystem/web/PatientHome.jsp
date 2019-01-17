<%-- 
    Document   : PatientHome
    Created on : 15-Jan-2019, 21:56:02
    Author     : Jonbr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Home</title>
    </head>
    <body>
        <form name="Create Appointment" action="CreateAppointment" method="POST">
            <input type="text" name="Doctor" placeholder="Doctor Id" />
            <input type="text" name="Patient" placeholder="Patient Id" />
            <input type="date" name="Date"  />
            <input type="time" name="Time" />
            <input type="submit" value="Request" />
        </form>
    </body>
</html>
