<%-- 
    Document   : CreatedPatient
    Created on : 17-Jan-2019, 01:44:02
    Author     : Jonbr
--%>

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
    </body>
</html>