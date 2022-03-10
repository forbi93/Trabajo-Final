
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@page import="java.util.ArrayList"%>
<%@page import="beans.*"%>

<%@page session="true" %>
<%
    String usu="";
    HttpSession sesionok=request.getSession();
%>
<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/menu.css">
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
    <link rel="stylesheet" href="css/adopta.css">
    <link rel="stylesheet" href="css/footer.css">    
</head>
<body>
    <div class="loaderBox">
        <div class="loader">
            <img src="imagenes/logo.svg" alt="">
            <h1>Little Pets </h1>
        </div>
    </div>
    <header>
        <nav>
             <button onclick="history.back()">atras</button>
            <div class="logo">
                <img src="imagenes/logo.svg" alt="">
                <h1><a href="login.jsp">Little Pets</a></h1>
            </div>

            <ul class="menuList">
                <li class="menuItem"><a href="inicio.html">Inicio</a></li>
                <li class="menuItem "><a href="adopta.jsp">Adopta</a></li>
                <li class="menuItem"><a href="nosotros.html">Nosotros</a></li>
                <li class="menuItem"><a href="contacto.html">Contactanos</a></li>
                <li class="menuItem"><a href="login.jsp">Login</a></li>
                
                
            </ul>

        </nav>
    </header>

    <section class="secBox1">
        <div class="container">
            <h3 id="title">Un perrito espera por tu llamado <br> Encuentra el que mas te guste en nuestro catalogo</h3>

            <div class="swiper mySwiper">
                <div class="swiper-wrapper">
                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro1.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Romeo
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro2.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Timoteo
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro3.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Titan
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro4.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Duque
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro5.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                tovi
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro6.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Rabito
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro7.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Manchas
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro8.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Scott
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro9.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Mochita
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro10.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Kike
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro11.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Mars
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro12.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Luna
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro13.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Zeuz
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro14.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Fermin
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro15.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                Betto
                            </button>
                        </div>
                    </div>

                    <div class="swiper-slide">
                        <img src="imagenes/perrosAdop/img_perro16.jpg" alt="">
                        <div class="degraBox">
                            <button class="btnActive">
                                MiniMike
                            </button>
                        </div>
                    </div>

                </div>
                <div class="swiper-pagination"></div>
            </div>

            <div class="formBox divActive">
                 <div class="formTxt">
                    <h3>Quieres Adoptar</h3>
                    <img id="img_perro" src="" alt="">
                    <p class="perroTxt"></p>
                </div>
              
                <h3>Registra tu Solicitud Aqui</h3>
                
   <center>
                    <a href="solicitud.jsp"" class="btn btn-success">  </a>
                    
                    <%
                           if(sesionok.getAttribute("nombre")==null){
                               %>
                               <a href="login.jsp" class="btn btn-primary">solicitar</a>
                          <%
                              }else{
                           %>
                    <input  value="solicitar" class="btn btn-primary">
                     <%
                            }
                        %>
                    
                </center>

             

    </section>

    <footer>
        <div class="logoFooter ">
            <img src="imagenes/logo.svg " alt=" ">
            <h1>Little Pets</h1>
        </div>

        <div class="listFoot ">
            <h4>Caracteristicas</h4>
            <ul>
                <li>Ayudamos a perritos en Apuros </li>
                <li>Sin fines de Lucro </li>
                <li>Adopta desde cualquier lugar del Peru  </li>
            </ul>
        </div>

        <div class="listFoot ">
            <h4>Redes</h4>
            <ul>
                <li>Whatsapp</li>
                <li>Facebook</li>
                <li>Instagram</li>
            </ul>
        </div>

        <div class="listFoot ">
            <h4>Contactenos</h4>
            <ul>
                <li>Telefono:123456</li>
                <li>LittlePets@gmail.com</li>
                <li>Lpets.Outlook.com</li>
            </ul>
        </div>
    </footer>
</body>
<script src="js/loader.js">
</script>
<script src="js/clasePerro.js" type="module"></script>
<script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
<!-- Initialize Swiper -->
<script>
    var swiper = new Swiper(".mySwiper", {
        slidesPerView: 1,
        spaceBetween: 10,
        pagination: {
            el: ".swiper-pagination",
            clickable: true,
        },
        breakpoints: {
            640: {
                slidesPerView: 2,
                spaceBetween: 20,
            },
            768: {
                slidesPerView: 3,
                spaceBetween: 40,
            },
            1024: {
                slidesPerView: 4,
                spaceBetween: 50,
            },
        },
    });
</script>

</html>