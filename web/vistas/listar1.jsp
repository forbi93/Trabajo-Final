<%@page import="Modelo.Contacto"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.ContactoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Contacto</h1>
            <a class="btn btn-success" href="ControladorContacto?accion=add">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ContactoID</th>
                        <th class="text-center">AdoptanteID</th>
                        <th class="text-center">EncargadoID</th>
                        <th class="text-center">Celular</th>
                        <th class="text-center">Email</th>
                        <th class="text-center">Mensaje</th>
                    </tr>
                </thead>
                <%
                    ContactoDAO dao = new ContactoDAO();
                    List<Contacto> list = dao.listar();
                    Iterator<Contacto> iter = list.iterator();
                    Contacto cont = null;
                    while (iter.hasNext()) {
                        cont = iter.next();

                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= cont.getCodigo()%></td>
                        <td class="text-center"><%= cont.getIdadoptante()%></td>
                        <td class="text-center"><%= cont.getIdencargado()%></td>
                        <td class="text-center"><%= cont.getCelular()%></td>
                        <td class="text-center"><%= cont.getCorreo()%></td>
                        <td class="text-center"><%= cont.getMensaje()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="ControladorContacto?accion=editar&Codigo=<%= cont.getCodigo()%>">Editar</a>
                            <a class="btn btn-danger" href="ControladorContacto?accion=eliminar&Codigo=<%= cont.getCodigo()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
        <div class="container">
            <a class="btn btn-success btn-lg" href="persona.jsp">Volver</a>
        </div>
    </body>
</html>
