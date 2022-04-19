

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="Styles/EstilosInicioSesion.css"/>
        <link rel="stylesheet" href="Styles/BasicStyles.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Sesion</title>
    </head>
    <body>
        
        <div class="login-box">
            <img src="Images/escudo.png" class="avatar" alt="Avatar Image">
            <h1>Inicia Sesion</h1>
            <form>
                <!-- USUARIO -->
                <label for="Username">Usuario</label>
                <input type="text" placeholder="Digite Usuario">
                <!-- CONTRASEÑA -->
                <label for="password">Contraseña</label>
                <input type="password" placeholder="Digite Contraseña">
                <button type="button">Ingresar</button>
                <a href="#">Olvidaste tu contraseña?</a>
            </form> 
        </div>
    </body>
</html>
