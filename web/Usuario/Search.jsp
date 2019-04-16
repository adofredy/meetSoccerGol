<%-- 
    Document   : Search
    Created on : 12-abr-2019, 13:57:14
    Author     : QfloresRA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h4><%=(request.getAttribute("mensaje") != null ? request.getAttribute("mensaje") : "")%></h4>
    </body>
</html>
