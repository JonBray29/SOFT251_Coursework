<%-- 
    Document   : DoctorHome
    Created on : 15-Jan-2019, 21:51:31
    Author     : Jonbr
--%>
<%@page import="PatientSystem.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doctor Home</title>
    </head>
    <body>
        
        <%{             
            Cookie[] cookies = request.getCookies();
            String userId = cookies[1].getValue();
        
            for(Doctor d : UsersSingleton.getInstance().getListOfDoctors()){
                if(d.getUserId() == userId) {
                    for(Notifications n : d.getNotifications()){
                        out.println(n + "<br>");
                    }
                    
                }

        %>
   
    </body>
</html>
