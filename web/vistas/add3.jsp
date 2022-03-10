
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
                <h1>Agregar Adoptante</h1>
                <form action="ControladorAdoptante">
                
                usuarioid:<br>
                <input class="form-control" type="text" name="txtUsuario" ><br>
                nombre: <br>
                <input class="form-control" type="text" name="txtNombre" ><br>
                apellido: <br>
                <input class="form-control" type="text" name="txtApellido" "><br>
                edad: <br>
                <input class="form-control" type="text" name="txtEdad" ><br>
                sexo: <br>
                <input class="form-control" type="text" name="txtSexo" ><br>
                categoria: <br>
                <input class="form-control" type="text" name="txtCate" ><br>
                sueldo: <br>
                <input class="form-control" type="text" name="txtSueldor" ><br>
                distritoid: <br>
                <input class="form-control" type="text" name="txtDistri" ><br>
                dni: <br>
                <input class="form-control" type="text" name="txtDni"><br>
                
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="ControladorAdoptante?accion=listar">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
