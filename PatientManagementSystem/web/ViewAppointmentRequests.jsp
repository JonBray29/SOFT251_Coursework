<%-- 
    Document   : ViewAppointmentRequests
    Created on : 15-Jan-2019, 22:31:07
    Author     : Jonbr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Appointment</title>
    </head>
    <body>
        <form name="Create Appointment" action="CreateAppointment" method="POST">
            <input type="text" name="Doctor" placeholder="Doctor Id" />
            <input type="text" name="Patient" placeholder="Patient Id" />
            <input type="date" name="Date"  />
            <input type="time" name="Time" />
            <input type="submit" value="Create" />
        </form>
    </body>
</html>
