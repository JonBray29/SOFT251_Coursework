<%-- 
    Document   : AdminHome
    Created on : 15-Jan-2019, 21:51:59
    Author     : Jonbr
--%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<%@page import="PatientSystem.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home</title>
    </head>
    <body>
        
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    	<button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      		<span class="navbar-toggler-icon"></span>
    	</button>
    	<ul class="navbar-nav mr-auto">
	      	<li><a class="nav-item nav-link" href="AdminHome.jsp">Home</a></li>
	      	<li><a class="nav-item nav-link" href="CreateDocAndSec.jsp">Create Doctor/Secretary</a></li>
    	</ul>
    	<ul class="navbar-nav">
      		<li><a href="index.jsp" class="btn btn-dark" role="button"> Logout</a></li>
    	</ul>
  	</nav>
        
        <%  /*Doesn't work
            * 
            for(Doctor d : UsersSingleton.getInstance().getListOfDoctors()){
                out.println(d.getFirstName() + d.getLastName() + "<br>");
                for(Ratings r : d.getRatings()){
                    out.println(r.getRatingValue() + r.getComments() + "<br>");
                }
            }*/
        %>
    </body>
</html>
