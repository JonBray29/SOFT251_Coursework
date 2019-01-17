<%-- 
    Document   : CreatedPatient
    Created on : 17-Jan-2019, 01:44:02
    Author     : Jonbr
--%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Created Patient</title>
    </head>
    <body>
        <% 
            Cookie[] cookies = request.getCookies();
            String userId = cookies[1].getValue();
            out.println("Username of new user is: " + userId);
            %>
            
            <br>
            <br>
            <a href="CreatePatient.jsp" class="btn btn-dark" role="button"> Back</a>
    </body>
</html>
