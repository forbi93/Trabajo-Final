
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Adoptante"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.AdoptanteDAO"%>
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
            <h1>Adoptante</h1>
            <a class="btn btn-success" href="ControladorAdoptante?accion=add">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">AdoptanteID</th>
                        <th class="text-center">UsuarioID</th>
                        <th class="text-center">Nombred</th>
                        <th class="text-center">Apellidos</th>
                        <th class="text-center">Edad</th>
                        <th class="text-center">Sexo</th>
                        <th class="text-center">Categoria</th>
                        <th class="text-center">Sueldo</th>
                        <th class="text-center">DistritoId</th>
                        <th class="text-center">Dni</th>
                    </tr>
                </thead>
                <%
                    AdoptanteDAO dao = new AdoptanteDAO();
                    List<Adoptante> list = dao.listar();
                    Iterator<Adoptante> iter = list.iterator();
                    Adoptante ado = null;
                    while (iter.hasNext()) {
                        ado = iter.next();

                %>
                <tbody>
                    <tr>
                        <th class="text-center"><%= ado.getCodigo()%></th>
                        <th class="text-center"><%= ado.getIdusuario()%></th>
                        <th class="text-center"><%= ado.getNombre()%></th>
                        <th class="text-center"><%= ado.getApellido()%></th>
                        <th class="text-center"><%= ado.getEdad()%></th>
                        <th class="text-center"><%= ado.getSexo()%></th>
                        <th class="text-center"><%= ado.getCategoria()%></th>
                        <th class="text-center"><%= ado.getSueldo()%></th>
                        <th class="text-center"><%= ado.getIddistrito()%></th>
                        <th class="text-center"><%= ado.getDni()%></th>
                        <td class="text-center">
                            <a class="btn btn-warning" href="ControladorAdoptante?accion=editar&Codigo=<%= ado.getCodigo()%>">Editar</a>
                            <a class="btn btn-danger" href="ControladorAdoptante?accion=eliminar&Codigo=<%= ado.getCodigo()%>">Remove</a>
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
