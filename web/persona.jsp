
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        
        <br>
        <div class="container">
            <a class="btn btn-success btn-lg" href="Controlador?accion=listar">Listar Usuario</a>
        </div>
        <br>
         <div class="container">
            <a class="btn btn-success btn-lg" href="ControladorContacto?accion=listar">Listar C ontacto</a>
        </div>
        <br>
        <div class="container">
            <a class="btn btn-success btn-lg" href="ControladorMascota?accion=listar">Listar Mascotas</a>
        </div>
        <br>
         <div class="container">
            <a class="btn btn-success btn-lg" href="ControladorAdoptante?accion=listar">Listar Adoptante</a>
        </div>
         <br>
         <div class="container">
            <a class="btn btn-success btn-lg" href="ControladorSolicitud?accion=listar">Listar Solicitud</a>
        </div>
         <div class="container">
            <a class="btn btn-danger btn-lg" href="ServletAdmi">Cerrar Sesión</a>
        </div>
         
        
        
    </body>
</html>
