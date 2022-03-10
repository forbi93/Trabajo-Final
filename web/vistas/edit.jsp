
<%@page import="Modelo.Usuario"%>
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
            <div class="col-lg-6">
              <%
              UsuarioDAO dao=new UsuarioDAO();
              String Codigo=String.valueOf((String)request.getAttribute("idusu"));
              Usuario u=(Usuario)dao.list(Codigo);
          %>
            <h1>Modificar Persona</h1>
            <form action="Controlador">
                         
                Rol:<br>
                <input class="form-control" type="text" name="txtRol" value="<%= u.getRoll()%>"><br>
                Contraseña:<br>
                <input class="form-control" type="text" name="txtContraseña" value="<%= u.getContraseña()%>"><br>
                
                <input type="hidden" name="txtCodigo" value="<%= u.getCodigo()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
