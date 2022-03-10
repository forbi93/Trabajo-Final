<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <!-- Option 1: Bootstrap Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    </head>

    <div class="container">
        <form action="ServletUser" method="post">
            <h2 align="center">Registrar Solicitud</h2>
            <p>Solicitud ID: <input type="text" name="SoliID" class="form-control"></p>
            <p>Encargado ID: <input type="text" name="EncarID" class="form-control"></p>
            <p>Adoptante ID: <input type="text" name="AdopID" class="form-control"></p>
            <p>Elija el número de mascotas</p>
            <select name="Perros" class="form-select">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="Mas de 3">Más de 3</option>
            </select>
            <p>Mensaje: <textarea class="form-control" name="Mensaje"></textarea></p>
            <p>Fecha: <input type="date" name="Fecha" class="form-control"></p>
            <input type="submit" name="btn" value="Registrar Solicitud" class="btn btn-primary">
            <input type="hidden" name="op" value="registrar">
            <a href="ServletUser" class="btn btn-danger">Cerrar Sesión</a>
        </form>
    </div>
    <div>
       

    </div>                   
    
</html>