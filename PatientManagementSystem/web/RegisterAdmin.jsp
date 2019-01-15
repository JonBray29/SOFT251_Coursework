<%-- 
    Document   : RegisterAdmin
    Created on : 15-Jan-2019, 15:50:22
    Author     : Jonbr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Registration</title>
    </head>
    <body>
        <form name="RegisterAdmin" method="POST">
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
            <input type="submit" value="Create" name="createAdmin" />
        </form>
    </body>
</html>