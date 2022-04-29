/* FUNCIONES PAGINA PRINCIPAL */
function cargarPagina(id) {
    if (id === "alumno") {
        $(".div_container").load('Registros/RegistroUsuario.jsp .div_formUser');

    }
    if (id === "docente") {
        $(".div_container").load('Registros/RegistroUsuario.jsp .div_formUser2');
    }

}
var estado = false;
function verMenuRegistro(id) {

    if (estado === false) {
        $(".ul_regMenu").show("fast");
        $("#" + id).addClass('selected');
        estado = true;
    } else if (estado === true) {
        $(".ul_regMenu").hide("fast");
        $(".ul_menu li").removeClass('selected');
        estado = false;
    }
}

function cargarPagModulo() {
    $(".div_container").load('Modulos/modulosPrincipal.jsp');
}

function cargarPagPerfil() {
    $(".div_container").load('Perfiles/PerfilUsuario.jsp');
}


/* FUNCIONES REGISTRO USUARIO*/

/* AJAX ENVIO REGISTRO */


function nuevaUsuario() {

    $.ajax({
        type: 'post',
        url: $("#form_persona").attr('action'),
        data: $("#form_persona").serialize(),
        success: function (data) {
            alertSucsses("¡Registro Exitoso!");
            $("#form_persona")[0].reset();

        }
    });

}
/*INICIO SESION*/
function inicioSesion(PERS_USERNAME, PERS_PASSWORD, modulo) {



    $.post("ControladorPrincipal", {PERS_USERNAME: PERS_USERNAME, PERS_PASSWORD: PERS_PASSWORD, modulo: modulo}, function (data) {

        var d = parseInt(data);

        if (d === 1) {
            window.location.replace("Principal.jsp");
        } else {

            alert("Usuario o Contraseña Incorrecta");
        }

    });
}

/*MODULOS TEMATICOS*/
function moduloInfo(id) {

    $(".modal_fondo").fadeIn("fast");
    $(".div_modal").fadeIn("fast");
    if (id === "math") {
        $(".modal_titulo").text("Prueba de Matematicas");
        $(".modal_mmath").fadeIn("slow");
    }

    if (id === "esp") {

        $(".modal_titulo").text("Prueba de Compresion Lectora");
        $(".modal_lect").fadeIn("slow");
    }
    if (id === "ing") {
        $(".modal_titulo").text("Prueba de Ingles");
         $(".modal_ingl").fadeIn("slow");
    }

    if (id === "syc") {
        $(".modal_titulo").text("Prueba de Ciencias Sociales y Ciudadania");
         $(".modal_ciud").fadeIn("slow");
    }

    if (id === "cna") {
        $(".modal_titulo").text("Prueba de Ciencias Naturales");
         $(".modal_cna").fadeIn("slow");
    }





}

function cerrarModalMod() {

    $(".modal_fondo").fadeOut("fast");
    $(".div_modal").fadeOut("fast");
    $(".modal_mmath").hide();
    $(".modal_ingl").hide();
    $(".modal_cna").hide();
    $(".modal_ciud").hide();
    $(".modal_lect").hide();
}

