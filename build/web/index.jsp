<%-- 
    Document   : index
    Created on : 12 abr. 2023, 12:45:09
    Author     : artem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Ejercicio 4</h2>
            <form action="Solucion">
                <label>Ingrese su nombre</label>
                <input type="text" name="nombreA" id="nombreA"/><br>
                <label>Ingrese la calificacion obtenida en el primer parcial</label>
                <input type="number" name="calificacion1" id="calificacion1"/><br>
                <label>Ingrese la calificacion obtenida en el examen final</label>
                <input type="number" name="examenfinal" id="examenfinal"/><br>
                <label>Ingrese la calificacion obtenida en el trabajo final</label>
                <input type="number" name="trabajofinal" id="trabajofinal"/><br>
                <input type="submit" name="accion" value="calis"/> <br>
            </form>
            <br>
            <br>
        <h2>Ejercicio 5</h2>
        <form action="Solucion">
            <label>Ingrese el grupo</label>
            <input type="text" name="grupo" id="grupo" /><br>
            <label>Ingrese la cantidad de alumnos hombres que hay</label>
            <input type="number" name="alumnosh" id="alumnosh"/><br>
            <label>Ingrese la calificacion de alumnos mujeres que hay</label>
            <input type="number" name="alumnosm" id="alumnosm"/><br>
            <input type="submit" name="accion" value="porcentaje"/> <br>
        </form>
        <br>
         <h2>Ejercicio 9</h2>
         <form action="Solucion">
            <label>Ingrese nombre del trabajador</label>
            <input type="text" name="nombreT" id="nombreT"/><br>
            <label>Ingrese la cantidad de horas que trabajo el trabajador</label>
            <input type="number" name="horastotales" id="horastotales" pattern="[0-9]"/><br>
            <label>Ingrese cuanto se le paga por hora al trabajador</label>
            <input type="number" name="salario" id="salario" pattern="[0-9]"/><br>
            <input type="submit" name="accion" value="cuota" /> <br>
        </form>
        <br>
        <label><a href="Vista/consulta.jsp">Consulta</a></label>
    </body> 
</html>
