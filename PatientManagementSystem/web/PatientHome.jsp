<%-- 
    Document   : PatientHome
    Created on : 15-Jan-2019, 21:56:02
    Author     : Jonbr
--%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<%@page import="PatientSystem.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Home</title>
    </head>
    <body>
        
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    	<button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      		<span class="navbar-toggler-icon"></span>
    	</button>
    	<ul class="navbar-nav mr-auto">
	      	<li><a class="nav-item nav-link" href="PatientHome.jsp">Home</a></li>
	      	<li><a class="nav-item nav-link" href="PatientNotifications.jsp">Notifications</a></li>
                <li><a class="nav-item nav-link" href="PatientHistory.jsp">History</a></li>
                <li><a class="nav-item nav-link" href="RateDoctors.jsp">Rate Doctors</a></li>
    	</ul>
    	<ul class="navbar-nav">
      		<li><a href="index.jsp" class="btn btn-dark" role="button"> Logout</a></li>
    	</ul>
  	</nav>
        
        <input type="submit" value="Request Terminate Account" action="TerminateAccount" method="POST"  />
        <br>
        <form name="Create Appointment" action="RequestAppointment" method="POST">
            <input type="text" name="Doctor" placeholder="Doctor Id" />
            <input type="text" name="Patient" placeholder="Patient Id" />
            <input type="date" name="Date"  />
            <input type="time" name="Time" />
            <input type="submit" value="Request" />
        </form>
        <br>
        <%{ /*Doesn't work
            *           
            Cookie[] cookies = request.getCookies();
            String userId = cookies[1].getValue();
        
            for(Patient p : UsersSingleton.getInstance().getListOfPatients()){
                if(p.getUserId() == userId) {
                    for(Appointments a : p.getPatientAppointments()){
                        out.println(a.getDate() + a.getTime() + "<br>");
                    }
                    
                }*/

        %>
        
    </body>
</html>
