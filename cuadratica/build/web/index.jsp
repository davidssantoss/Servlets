<%-- 
    Document   : index
    Created on : 18-abr-2018, 13:06:54
    Author     : Estudiantes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Raices </title>
    </head>
    <body><form action ="Calculo" method="post">
            <center> <h3 <label id="eti">Digite el numero : <br></label><br><input type="text" name="Num" value="<c:out value="${entr}"/>"></h3></center> 
            <center> <h3 <label id="etq">Digite el numero : <br></label><br><input type="text" name="Num2" value="<c:out value="${entr2}"/>"></h3></center> 
            <center> <h3 <label id="etq3">Digite el numero : <br></label><br><input type="text" name="Num3" value="<c:out value="${entr3}"/>"></h3></center> 
            <center> <input type="submit" value="Calcular"><br> <br> </center>
            <center> <h3 <label> raiz 1:  <br> </label> <input type="text" name="Raiz1" value="<c:out value="${raiz1}"/>"> </h3></center>
            <center> <h3 <label> raiz 2:  <br> </label> <input type="text" name="Raiz2" value="<c:out value="${raiz2}"/>"> </h3></center>
        
        </form>
    </body>
</html>
