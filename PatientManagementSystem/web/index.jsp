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
        <form name="login" method="POST">
            <input type="text" name="userId" placeholder="Username" />
            <input type="password" name="password" placeholder="Password" />
            <input type="submit" value="Login" name="login" />
        </form>
    </body>
</html>
