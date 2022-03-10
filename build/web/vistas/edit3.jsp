
<%@page import="Modelo.Adoptante"%>
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
            <div class="col-lg-6">
              <%
              AdoptanteDAO dao=new AdoptanteDAO();
              int Codigo=Integer.parseInt((String)request.getAttribute("idado"));
              Adoptante a=(Adoptante)dao.list(Codigo);
          %>
            <h1>Modificar Contacto</h1>
            <form action="ControladorAdoptante">
                usuarioid:<br>
                <input class="form-control" type="text" name="txtUsuario" value="<%= a.getIdusuario()%>"><br>
                nombre: <br>
                <input class="form-control" type="text" name="txtNombre" value="<%= a.getNombre()%>"><br>
                apellido: <br>
                <input class="form-control" type="text" name="txtApellido" value="<%= a.getApellido()%>"><br>
                edad: <br>
                <input class="form-control" type="text" name="txtEdad" value="<%= a.getEdad()%>"><br>
                sexo: <br>
                <input class="form-control" type="text" name="txtSexo" value="<%= a.getSexo()%>"><br>
                categoria: <br>
                <input class="form-control" type="text" name="txtCate" value="<%= a.getCategoria()%>"><br>
                sueldo: <br>
                <input class="form-control" type="text" name="txtSueldor" value="<%= a.getSueldo()%>"><br>
                distritoid: <br>
                <input class="form-control" type="text" name="txtDistri" value="<%= a.getIddistrito()%>"><br>
                dni: <br>
                <input class="form-control" type="text" name="txtDni" value="<%= a.getDni()%>"><br>
                
                <input type="hidden" name="txtCodigo" value="<%= a.getCodigo()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="ControladorAdoptante?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
