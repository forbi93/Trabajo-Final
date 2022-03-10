<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="beans.*"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title> JSP Page</title>
        <link href="csslogin/estilo.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <div class="container col-col-3">
            <div class="form-group text-center">
                <img src="./img/imagen1.jpg" width="300"/>
                <p><strong>Bienvenidos al Sistema de Administrador</strong></p>  
                <div class="container">
                    <form action="ServletAdmi" method="post">
                        <p align="left">
                            Ingrese Usuario:
                            <input type="text" name="txtUsuario" placeholder="Ingrese su Usuario"
                                   class="form-control">
                        </p>
                        <p align="left">
                            Ingrese Password:
                            <input type="password" name="txtPas" placeholder="***********"
                                   class="form-control">
                        </p>
                        <p>
                            <input type="submit" name="btn" value="Iniciar Sesión"
                                   class="btn btn-success btn-block">
                        </p>
                        <a class="btn btn-danger" href="primerapag.html"> Regresar al inicio</a>
                        <%
                            if (request.getAttribute("msg") != null) {
                                String msg = request.getAttribute("msg").toString();
                        %>
                        <div class="alert alert-danger" role="alert">
                            <%=msg%>
                        </div>
                        <%
                            }
                        %>
                        <input type="hidden" name="op" value="admi">

                    </form>  
                </div>
            </div>
        </div>
    </body>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
