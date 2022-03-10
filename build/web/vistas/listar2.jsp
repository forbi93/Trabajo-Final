
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Mascota"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.MascotaDAO"%>
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
            <h1>Mascotas</h1>
            <a class="btn btn-success" href="ControladorMascota?accion=add">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">PerroID</th>
                        <th class="text-center">Estado</th>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Raza</th>
                        <th class="text-center">Tamaño</th>
                        <th class="text-center">Edad</th>
                        <th class="text-center">Peso</th>
                        <th class="text-center">Color</th>
                        <th class="text-center">Sexo</th>
                        <th class="text-center">Disponibilidad</th>
                    </tr>
                </thead>
                <%
                    MascotaDAO dao = new MascotaDAO();
                    List<Mascota> list = dao.listar();
                    Iterator<Mascota> iter = list.iterator();
                    Mascota mas = null;
                    while (iter.hasNext()) {
                        mas = iter.next();

                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= mas.getCodigo()%></td>
                        <td class="text-center"><%= mas.getEstado()%></td>
                        <td class="text-center"><%= mas.getNombre()%></td>
                        <td class="text-center"><%= mas.getRaza()%></td>
                        <td class="text-center"><%= mas.getTamaño()%></td>
                        <td class="text-center"><%= mas.getEdad()%></td>
                        <td class="text-center"><%= mas.getPeso()%></td>
                        <td class="text-center"><%= mas.getColor()%></td>
                        <td class="text-center"><%= mas.getSexo()%></td>
                        <td class="text-center"><%= mas.getDispo()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="ControladorMascota?accion=editar&Codigo=<%= mas.getCodigo()%>">Editar</a>
                            <a class="btn btn-danger" href="ControladorMascota?accion=eliminar&Codigo=<%= mas.getCodigo()%>">Remove</a>
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
