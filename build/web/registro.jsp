<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Registro</title>
        <link href="csslogin/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h2 align="center">Nuevos Usuarios</h2>
        <div class="container">
            <form action="ServletUser" method="post">
                <p align="left">
                    Ingrese su Usuario:
                    <input type="text" name="txtUsu" class="form-control" placeholder="Ingrese su Usuario">
                </p><p align="left">
                    Ingrese su Contraseña:
                    <input type="password" name="txtPas" class="form-control" placeholder="Ingrese Contraseña">
                </p><p align="left">
                    <<p align="left">
                    <input type="submit" name="btn" value="Registrar User"
                           class="btn btn-danger btn-block">
                </p>
                <input type="hidden" name="op" value="nuevo">
            </form>
        </div>
    </body>
   
</html>
