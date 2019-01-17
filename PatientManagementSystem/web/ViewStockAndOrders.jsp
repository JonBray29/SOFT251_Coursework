<%-- 
    Document   : ViewStockAndOrders
    Created on : 15-Jan-2019, 22:32:44
    Author     : Jonbr
--%>

<%@page import="PatientSystem.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stock and Orders</title>
    </head>
    <body>
        
        <%{ /*Doesn't work
            *             
         
            for(Stock s : Stock.getListOfStock()){
                out.println(s.getMedicine().toString() + s.getQuantityInStock() + "<br>");
            }*/

        %>
        <br>
        <br>
        <form action="OrderStock" name="Order" method="POST">
            <input type="text" name="Medicine" placeholder="Medicine name" />
            <input type="text" name="Quantity" placeholder="Quantity" />
            <input type="submit" value="Order" name="Order Stock" />
        </form>
        
    </body>
</html>
