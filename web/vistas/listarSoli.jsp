<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Solicitud"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.SolicitudDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Listar Solicitud</title>
    </head>
    <body>
        <div class="container">
            <h1>Solicitud</h1>   
            <a class="btn btn-success" href="ControladorSolicitud?accion=add">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">SolicitudID</th>                        
                        <th class="text-center">EncargadoID</th>
                        <th class="text-center">AdoptanteID</th>
                        <th class="text-center">Mensaje</th>
                        <th class="text-center">Fecha</th>
                    </tr>
                </thead>
                <%
                    SolicitudDAO dao=new SolicitudDAO();
                    List<Solicitud>list=dao.listar();
                    Iterator<Solicitud>iter=list.iterator();
                    Solicitud cont=null;
                    while(iter.hasNext()){
                        cont=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= cont.getSolicitudID()%></td>
                        <td class="text-center"><%= cont.getEncargadoID()%></td>
                        <td class="text-center"><%= cont.getAdoptanteID()%></td>
                        <td class="text-center"><%= cont.getMensaje()%></td>
                        <td class="text-center"><%= cont.getFecha()%></td>                        
                        <td class="text-center">
                            <a class="btn btn-warning" href="ControladorSolicitud?accion=editar&Codigo=<%= cont.getSolicitudID()%>">Editar</a>
                            <a class="btn btn-danger" href="ControladorSolicitud?accion=eliminar&Codigo=<%= cont.getSolicitudID()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>      
    </body>
</html>
