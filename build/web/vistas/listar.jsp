
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
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
            <h1>usuario</h1>
            <a class="btn btn-success" href="Controlador?accion=add">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">UsuarioID</th>
                        <th class="text-center">RolID</th>
                        <th class="text-center">Contraseña</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <%
                    UsuarioDAO dao = new UsuarioDAO();
                    List<Usuario> list = dao.listar();
                    Iterator<Usuario> iter = list.iterator();
                    Usuario usu = null;
                    while (iter.hasNext()) {
                        usu = iter.next();

                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= usu.getCodigo()%></td>
                        <td class="text-center"><%= usu.getRoll()%></td>
                        <td class="text-center"><%= usu.getContraseña()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accion=editar&Codigo=<%=usu.getCodigo()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&Codigo=<%=usu.getCodigo()%>">Remove</a>
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
