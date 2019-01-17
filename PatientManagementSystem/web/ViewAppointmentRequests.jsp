<%-- 
    Document   : ViewAppointmentRequests
    Created on : 15-Jan-2019, 22:31:07
    Author     : Jonbr
--%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Appointment</title>
    </head>
    <body>
        
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    	<button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      		<span class="navbar-toggler-icon"></span>
    	</button>
    	<ul class="navbar-nav mr-auto">
	      	<li><a class="nav-item nav-link" href="SecretaryHome.jsp">Home</a></li>
	      	<li><a class="nav-item nav-link" href="SecretaryNotifications.jsp">Notifications</a></li>
                <li><a class="nav-item nav-link" href="CreatePatient.jsp">Create Patient</a></li>
                <li><a class="nav-item nav-link" href="ViewAppointmentRequests.jsp">Make Appointments</a></li>
    	</ul>
    	<ul class="navbar-nav">
      		<li><a href="index.jsp" class="btn btn-dark" role="button"> Logout</a></li>
    	</ul>
  	</nav>
        
        <form name="Create Appointment" action="CreateAppointment" method="POST">
            <input type="text" name="Doctor" placeholder="Doctor Id" />
            <input type="text" name="Patient" placeholder="Patient Id" />
            <input type="date" name="Date"  />
            <input type="time" name="Time" />
            <input type="submit" value="Create" />
        </form>
    </body>
</html>
