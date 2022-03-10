
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
                <h1>Agregar Mascota</h1>
                <form action="ControladorMascota">
                
                Estado:<br>
                <input class="form-control" type="text" name="txtEstado" ><br>
                Nombre: <br>
                <input class="form-control" type="text" name="txtNombre" ><br>
                Raza: <br>
                <input class="form-control" type="text" name="txtRaza" ><br>
                Tamaño: <br>
                <input class="form-control" type="text" name="txtTamaño" ><br>
                Edad: <br>
                <input class="form-control" type="text" name="txtEdad" ><br>
                Peso: <br>
                <input class="form-control" type="text" name="txtPeso" ><br>
                Color: <br>
                <input class="form-control" type="text" name="txtColor" "><br>
                Sexo: <br>
                <input class="form-control" type="text" name="txtSexo" ><br>
                Disponibilidad: <br>
                <input class="form-control" type="text" name="txtDispo" ><br>
                
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="ControladorMascota?accion=listar">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
