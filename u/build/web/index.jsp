<%-- 
    Document   : index
    Created on : 18-abr-2018, 12:50:51
    Author     : Estudiantes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DETERMINAR LOS NUMEROS PRIMOS</title>
    </head>
    <body>
        <form action ="Calculo" method="post">
            <center> <h3 <label id="eti">Digite el numero : <br></label><br><input type="text" name="Num" value="<c:out value="${entr}"/>"></h3><br><br></center> 
            <center> <input type="submit" value="Calcular"><br> <br> </center>
            <center> <h3 <label> El numero es <br> <br> </label> <input type="text" name="Resultado" value="<c:out value="${clasf}"/>"> </h3></center>
        
        </form>
    </body>
</html>
