<%-- 
    Document   : AdminHome
    Created on : 15-Jan-2019, 21:51:59
    Author     : Jonbr
--%>

<%@page import="PatientSystem.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home</title>
    </head>
    <body>
        <%
            for(Doctor d : UsersSingleton.getInstance().getListOfDoctors()){
                out.println(d.getFirstName() + d.getLastName() + "<br>");
                for(Ratings r : d.getRatings()){
                    out.println(r.getRatingValue() + r.getComments() + "<br>");
                }
            }
        %>
    </body>
</html>
