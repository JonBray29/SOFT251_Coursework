<%-- 
    Document   : index
    Created on : 15-Jan-2019, 15:07:19
    Author     : Jonbr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="LoginServlet" name="login" method="POST">
            
            <% 
            Cookie[] cookies = request.getCookies();
            String userId = cookies[1].getValue();
            out.println("Username of session is: " + userId);
            %>
            <br>
            <input type="text" name="username" placeholder="Username" /><br><br>
            <input type="password" name="password" placeholder="Password" /><br><br>
            <input type="submit" value="Login" name="login" />
        </form>
    </body>
</html> 
