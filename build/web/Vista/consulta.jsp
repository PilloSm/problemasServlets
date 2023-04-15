<%-- 
    Document   : Consulta
    Created on : 15 abr. 2023, 10:49:33
    Author     : artem
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Problema4"%>
<%@page import="Modelo.Problema5"%>
<%@page import="Modelo.Problema9"%>
<%@page import="ModeloDAO.Problema4DAO"%>
<%@page import="ModeloDAO.Problema5DAO"%>
<%@page import="ModeloDAO.Problema9DAO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Problema4</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Calificacion parciales</th>
                    <th>Calificacion examen final</th>
                    <th>Calificacion trabajo final</th>
                    <th>Promedio</th>
                </tr>
            </thead>
            <%
                Problema4DAO pdcua=new Problema4DAO();
                List<Problema4>list=pdcua.consultar();
                Iterator<Problema4>iter=list.iterator();
                Problema4 per= null;
                while(iter.hasNext()){
                    per=iter.next();
                %>
            <tbody>
                <tr>
                    <td><%=per.getNombre()%></td>
                    <td><%=per.getCalifpar()%></td>
                    <td><%=per.getCalifexf()%></td>
                    <td><%=per.getPromedio()%></td>
                    <td><%=per.getPromedio()%></td>
                </tr>
                <%}%>
            </tbody>
        </table>
            <H1>Problema 5</H1>
            <table border="1">
                <thead>
                    <tr>
                        <th>Nombre del grupo</th>
                        <th>Numero de hombres</th>
                        <th>Numero de mujeres</th>
                        <th>Porcentaje de hombres</th>
                        <th>Porcentaje de mujeres</th>
                    </tr>
                </thead>
                                <%
                Problema5DAO pdcin=new Problema5DAO();
                List<Problema5>lista=pdcin.consultar();
                Iterator<Problema5>itera=lista.iterator();
                Problema5 pcin;
                while(itera.hasNext()){
                    pcin=itera.next();
                %>
                <tbody>
                    <tr>
                        <td><%=pcin.getGrupo()%></td>
                        <td><%=pcin.getnHombres()%></td>
                        <td><%=pcin.getnMujeres()%></td>
                        <td><%=pcin.getPorcH()%></td>
                        <td><%=pcin.getPorcM()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
            <h1>Problema 9</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>Nombre del trabajador</th>
                        <th>Horas trabajadas</th>
                        <th>Salario</th>
                        <th>Pago ha realizar</th>
                    </tr>
                </thead>
                <%
                Problema9DAO pdnue=new Problema9DAO();
                List<Problema9> listas=pdnue.consultar();
                Iterator<Problema9> iters=listas.iterator();
                Problema9 pnue;
                while(iters.hasNext()){
                    pnue=iters.next();
                %>
                <tbody>
                    <tr>
                        <td><%=pnue.getNombre()%></td>
                        <td><%=pnue.getHorasT()%></td>
                        <td><%=pnue.getSalario()%></td>
                        <td><%=pnue.getCuota()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

    </body>
</html>
