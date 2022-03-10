
<%@page import="Modelo.Contacto"%>
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
            <div class="col-lg-6">
              <%
              ContactoDAO dao=new ContactoDAO();
              String Codigo=String.valueOf((String)request.getAttribute("idcont"));
              Contacto c=(Contacto)dao.list(Codigo);
          %>
            <h1>Modificar Contacto</h1>
            <form action="ControladorContacto">
                AdoptanteID:<br>
                <input class="form-control" type="text" name="txtAdoptante" value="<%= c.getIdadoptante()%>"><br>
                EncargadoID: <br>
                <input class="form-control" type="text" name="txtEncargado" value="<%= c.getIdencargado()%>"><br>
                Celular: <br>
                <input class="form-control" type="text" name="txtTelefono" value="<%= c.getCelular()%>"><br>
                Email: <br>
                <input class="form-control" type="text" name="txtCorreo" value="<%= c.getCorreo()%>"><br>
                Mensaje: <br>
                <input class="form-control" type="text" name="txtMensaje" value="<%= c.getMensaje()%>"><br>
                
                <input type="hidden" name="txtCodigo" value="<%= c.getCodigo()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="ControladorContacto?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
