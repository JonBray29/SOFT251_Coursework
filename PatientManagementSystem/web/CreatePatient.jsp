<%-- 
    Document   : CreatePatient
    Created on : 15-Jan-2019, 16:08:22
    Author     : Jonbr
--%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<%@page import="PatientSystem.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Patient</title>
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
        
        <form name="RegisterPatient" action="CreatePatient" method="POST">
            <input type="text" name="FirstName" placeholder="First Name" />
            <input type="text" name="LastName" placeholder="Last Name" />
            <input type="text" name="AddressLineOne" placeholder="Address Line One" />
            <input type="text" name="City" placeholder="City" />
            <input type="text" name="Postcode" placeholder="PostCode" />
            <input type="password" name="Password" placeholder="Password" />
            <input type="text" name="Age" placeholder="Age" />
            <select name="Gender" placeholder="Gender">
                <option>Male</option>
                <option>Female</option>
            </select>
            <input type="submit" value="Create" name="createPatient" />
        </form>
        
        
    </body>
</html>
