

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="Styles/EstilosInicioSesion.css"/>
        <link rel="stylesheet" href="Styles/BasicStyles.css"/>
        <script src="Js/jquery-3.6.0.min.js" type="text/javascript"></script>
        <script src="Js/Controlador.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Sesion</title>
    </head>
    <body>
        
        <div class="login-box">
            <img src="Images/escudo.png" class="avatar" alt="Avatar Image">
            <h1>Inicia Sesion</h1>
            <form action="ControladorPrincipal" method="post">
                <!-- USUARIO -->
                <label for="Username">Usuario</label>
                <input type="text" placeholder="Digite Usuario" id="username">
                <!-- CONTRASEÑA -->
                <label for="password">Contraseña</label>
                <input type="password" placeholder="Digite Contraseña" id="pass">
                <button type="button" onclick="inicioSesion($('#username').val(),$('#pass').val(),$('#modulo').val())">Ingresar</button>
                <a href="#">Olvidaste tu contraseña?</a>
                
                 <input type="text" id="modulo" name="modulo" value="iniciosesion" hidden>
                
            </form> 
        </div>
    </body>
</html>
