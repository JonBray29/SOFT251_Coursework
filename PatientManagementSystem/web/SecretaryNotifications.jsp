<%-- 
    Document   : SecretaryNotifications
    Created on : 17-Jan-2019, 03:35:51
    Author     : Jonbr
--%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<%@page import="PatientSystem.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notifications</title>
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
        
        
        <%  /*Doesn't work
            *            
            Cookie[] cookies = request.getCookies();
            String userId = cookies[1].getValue();
        
            for(Secretary s : UsersSingleton.getInstance().getListOfSecretarys()){
                if(s.getUserId() == userId) {
                    for(Notifications n : s.getNotifications()){
                        out.println(n.getNotification() + "<br>");
                    }
                    
                }*/

        %>
    </body>
</html>
