
<%@page import="Modelo.Mascota"%>
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
            <div class="col-lg-6">
              <%
              MascotaDAO dao=new MascotaDAO();
              String Codigo=String.valueOf((String)request.getAttribute("idma"));
              Mascota m=(Mascota)dao.list(Codigo);
          %>
            <h1>Modificar Contacto</h1>
            <form action="ControladorMascota">
                Estado:<br>
                <input class="form-control" type="text" name="txtEstado" value="<%= m.getEstado()%>"><br>
                Nombre: <br>
                <input class="form-control" type="text" name="txtNombre" value="<%= m.getNombre()%>"><br>
                Raza: <br>
                <input class="form-control" type="text" name="txtRaza" value="<%= m.getRaza()%>"><br>
                Tamaño: <br>
                <input class="form-control" type="text" name="txtTamaño" value="<%= m.getTamaño()%>"><br>
                Edad: <br>
                <input class="form-control" type="text" name="txtEdad" value="<%= m.getEdad()%>"><br>
                Peso: <br>
                <input class="form-control" type="text" name="txtPeso" value="<%= m.getPeso()%>"><br>
                Color: <br>
                <input class="form-control" type="text" name="txtColor" value="<%= m.getColor()%>"><br>
                Sexo: <br>
                <input class="form-control" type="text" name="txtSexo" value="<%= m.getSexo()%>"><br>
                Disponibilidad: <br>
                <input class="form-control" type="text" name="txtDispo" value="<%= m.getDispo()%>"><br>
                
                <input type="hidden" name="txtCodigo" value="<%= m.getCodigo()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="ControladorMascota?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
