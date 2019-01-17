<%-- 
    Document   : CreateMedicine
    Created on : 15-Jan-2019, 22:29:17
    Author     : Jonbr
--%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Medicine</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    	<button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      		<span class="navbar-toggler-icon"></span>
    	</button>
    	<ul class="navbar-nav mr-auto">
	      	<li><a class="nav-item nav-link" href="DoctorHome.jsp">Home</a></li>
	      	<li><a class="nav-item nav-link" href="DoctorNotifications.jsp">Notifications</a></li>
                <li><a class="nav-item nav-link" href="DoctorCreateAppointment.jsp">Create Appointment</a></li>
                <li><a class="nav-item nav-link" href="CreateMedicine.jsp">Create Medicine</a></li>
                <li><a class="nav-item nav-link" href="DoctorViewPatientHistory.jsp">View Patients History</a></li>
    	</ul>
    	<ul class="navbar-nav">
      		<li><a href="index.jsp" class="btn btn-dark" role="button"> Logout</a></li>
    	</ul>
  	</nav>
        
        <form name="CreateMedicine" action="CreateMedicine" method="POST">
            <input type="text" name="Medicinename" Placeholder="Medicine Name" />
            <input type="submit" value="Create" />
        </form>
    </body>
</html>
