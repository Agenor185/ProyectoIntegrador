
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Styles/EstilosPrincipal.css"/>
        <link rel="stylesheet" href="Styles/BasicStyles.css"/>
        <script type="text/javascript" src="Js/jquery-3.6.0.min.js"></script>
        <script type="text/javascript" src="Js/Controlador.js"></script>
        <script type="text/javascript" src="Js/jqueryForms.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="div_container">

        </div>
        <div class="div_topBar">

        </div>

        <div class="div_leftBar">
            <br><br>
            <div class="div_menu">
                <ul class="ul_menu">
                    <li>Inicio</li>
                    <li>Modulos</li>
                    <li>Perfil</li>
                    <li id="li_reg" onclick="verMenuRegistro(this.id)">Registar Usuarios</li>
                    <ul class="ul_regMenu" hidden>
                        <li id="alumno" onclick="cargarPagina(this.id)"> Alumno</li>
                        <li id="docente" onclick="cargarPagina(this.id)">Docente</li>
                    </ul>
                </ul>
            </div>
        </div>


    </body>

</html>

<script>

</script>
