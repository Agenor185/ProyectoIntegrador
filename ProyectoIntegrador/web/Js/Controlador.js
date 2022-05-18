/* FUNCIONES PAGINA PRINCIPAL */


function cargarForms(id) {
    if (id === "alumno") {

        $(".div_formUser").css("display", "flex");
        $(".div_formUser2").hide();

    }
    if (id === "docente") {

        $(".div_formUser2").css("display", "flex");
        $(".div_formUser").hide();
    }

}

function verMenuRegistro(id) {
    $(".div_container").load('Registros/RegistroUsuario.jsp');
    $(".ul_menu li").removeClass('selected');
    $(".ul_regMenu").show("fast");
    $("#" + id).addClass('selected');

}

function cargarPagModulo(id) {
    $(".ul_menu li").removeClass('selected');
    $(".ul_regMenu").hide("fast");
    $("#" + id).addClass('selected');
    $(".div_container").load('Modulos/modulosPrincipal.jsp');
}

function cargarInicio(id) {
    $(".ul_menu li").removeClass('selected');
    $(".ul_regMenu").hide("fast");
    $("#" + id).addClass('selected');

}

function cargarPagPerfil() {

    $(".div_container").load('Perfiles/PerfilUsuario.jsp');
}

function cargarBusquedUsuarios(id) {
    $(".ul_menu li").removeClass('selected');
    $("#" + id).addClass('selected');
    $(".div_container").load('Registros/BuscarUsuario.jsp');
}

function verResultados(id) {
    $(".ul_menu li").removeClass('selected');
    $(".ul_regMenu").hide("fast");
    $("#" + id).addClass('selected');
    $(".div_container").load('Resultados/BuscarEstudiante.jsp');


}


/* FUNCIONES REGISTRO USUARIO*/

/* AJAX ENVIO REGISTRO */


function nuevaUsuario() {

alert($("#form_persona").serialize());
    $.ajax({
        type: 'post',
        url: $("#form_persona").attr('action'),
        data: $("#form_persona").serialize(),
        success: function (data) {
            alertSucsses("¡Registro Exitoso!");
            $(".modal_fondo").show("fast");
            $(".div_modal").show("fast");
            $(".div_modal").html(data);
            $("#form_persona")[0].reset();

        }
    });

}
/*INICIO SESION*/
function inicioSesion(PERS_USERNAME, PERS_PASSWORD, modulo) {



    if (PERS_USERNAME !== "") {
        if (PERS_PASSWORD !== "") {
            $.post("ControladorPrincipal", {PERS_USERNAME: PERS_USERNAME, PERS_PASSWORD: PERS_PASSWORD, modulo: modulo}, function (data) {

                var d = parseInt(data);

                if (d === 1) {
                    window.location.replace("Principal.jsp");
                } else {

                    alertError("Usuario o Contraseña Incorrectos");
                }

            });

        } else {

            alertError("El campo de la contraseña no puede estar vacio");
        }
    } else {

        alertError("El campo del usuario no puede estar vacio");
    }



}

/*CERRAR SESION*/

function cerrarSesion(modulo) {

    $.post("ControladorPrincipal", {modulo: modulo}, function (data) {
        window.location.replace("InicioSesion.jsp");
        alertSucsses("Sesion cerrada correctamente");

    });
}

/*MODULOS TEMATICOS*/
function moduloInfo(id) {

    $(".modal_fondo").fadeIn("fast");
    $(".div_modal").fadeIn("fast");
    if (id === "math") {
        $(".modal_titulo").text("Prueba de Matematicas");
        $(".modal_mmath").fadeIn("slow");
        $(".modal_img").html(" <img src='Images/math_img.png' alt='alt'/>");
        $(".bttn_prueba").attr('id', 'PR01');

    }

    if (id === "esp") {

        $(".modal_titulo").text("Prueba de Lectura Critica");
        $(".modal_lect").fadeIn("slow");
        $(".modal_img").html(" <img style='height: 350px; width: 350px;' src='Images/lec_img.png' alt='alt'/>");
        $(".bttn_prueba").attr('id', 'PR05');
    }
    if (id === "ing") {
        $(".modal_titulo").text("Prueba de Ingles");
        $(".modal_ingl").fadeIn("slow");
        $(".modal_img").html(" <img style='height: 300px; width: 350px;' src='Images/ing_img.png' alt='alt'/>");
        $(".bttn_prueba").attr('id', 'PR04');
    }

    if (id === "syc") {
        $(".modal_titulo").text("Prueba de Ciencias Sociales y Ciudadania");
        $(".modal_ciud").fadeIn("slow");
        $(".modal_img").html(" <img style='height: 300px; width: 350px;' src='Images/soc_img.png' alt='alt'/>");
        $(".bttn_prueba").attr('id', 'PR02');
    }

    if (id === "cna") {
        $(".modal_titulo").text("Prueba de Ciencias Naturales");
        $(".modal_cna").fadeIn("slow");
        $(".modal_img").html(" <img style='height: 350px; width: 350px;' src='Images/cna_img.png' alt='alt'/>");
        $(".bttn_prueba").attr('id', 'PR03');
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

/* PRUEBAS */
function  abrirPrueba(PRUE_CODIGO) {

    $.post("ControladorPrincipal", {PRUE_CODIGO: PRUE_CODIGO, modulo: "obtenerPreguntas"}, function (r) {
        $(".div_container").load('Pruebas/PruebaCiudadania.jsp');
    });
}






function obtenerPrueaba() {



    if ($("#prueba").serialize().length >= 569) {
        $.ajax({
            type: 'post',
            url: $("#prueba").attr('action'),
            data: $("#prueba").serialize(),
            success: function (data) {
                $(".modal_fondo").fadeIn("fast");
                $(".div_modal").fadeIn("fast");
                $(".mensaje_titulo").html("<br> <span style='color:  #4fcf8b'> Prueba terminada con exito. </span><br>  <br> Puntaje:<br><span style='color:#744FA3'>" + data + "/100<span>");

            }
        });
    } else {
        alertError("Faltan preguntas por responder");
    }

}

function revisarPrueba() {
    $(".modal_fondo").fadeOut("fast");
    $(".div_modal").fadeOut("fast");
    $("#send_prue").hide();

    $("input[type='radio']").prop('disabled', true);


    $("input[type='radio']:checked").each(function () {
        var idVal = $(this).attr("id");

        if ($(this).attr("value") === '3') {

            $("label[for='" + idVal + "']").addClass("resp_corr");
        } else {
            $("label[for='" + idVal + "']").addClass("resp_incor");

        }
    });

    /* for (var i = 0; i < 20; i++) {
     console.log(i);
     if(i<10){
     
     $("label[for='PP0"+(i+1)+"']").css("background-color", "red");
     } else {
     $("label[for='PP"+(i+1)+"']").css("background-color", "yellow");
     }
     
     }*/
}

function salirPrueba() {
    $(".div_container").load('Modulos/modulosPrincipal.jsp');

}

/*FUNCIONES BUSQUEDA ESTUDIANTES*/

function obtenerEstudiantes(GRAD_CODIGO) {

    $.post("ControladorPrincipal", {GRAD_CODIGO: GRAD_CODIGO, modulo: "cargarEstudiantes"}, function (r) {
        $("#estudiantes").html(r);
    });
}

function obtenerUsuarios(GRAD_CODIGO) {
  
    $.post("ControladorPrincipal", {GRAD_CODIGO: GRAD_CODIGO, TIPO_USER: "2", modulo: "cargarUsuarios"}, function (r) {
        $("#usuarios").show();
        $("#usuarios").html(r);
    });
}


function obtenerInfoEstu(PERS_ID, GRADO_CODIGO) {  

    $.post("ControladorPrincipal", {PERS_ID: PERS_ID, GRADO_CODIGO: GRADO_CODIGO, modulo: "buscarEstudiante"}, function (r) {
        $("#rows_est").html(r);
    });
}

function cargarResultados(PERS_ID) {

    $.post("ControladorPrincipal", {PERS_ID: PERS_ID, modulo: "infoEstudiante"}, function (r) {

        $(".div_container").load('Resultados/ProgresoEstudiantes.jsp');
    });

}

/* FUNCIONES PROGRESO ESTUDIANTES **/

function abrirModalProg(PERS_ID, PREP_CODIGO, PRIN_CODIGO) {

    $.post("ControladorPrincipal", {PERS_ID: PERS_ID, PREP_CODIGO: PREP_CODIGO, PRIN_CODIGO: PRIN_CODIGO, modulo: "obtenerRespuestasEstu"}, function (r) {
        $(".modal_fondo").fadeIn("fast");
        $(".div_modal").fadeIn("fast");
        $(".cont_preguntas").load("Resultados/revisionResultados.jsp");

    });
}

function  cargarIntentos(PERS_ID, PRUE_CODIGO) {

    $.post("ControladorPrincipal", {PERS_ID: PERS_ID, PRUE_CODIGO: PRUE_CODIGO, modulo: "cargarIntentos"}, function (r) {
        $(".cont_Intenttos").html(r);

    });
}

function volverBusquedaEst(){
    
     $(".div_container").load('Resultados/BuscarEstudiante.jsp');
}

/*FUNCIONES BUSQUEDA USUARIOS */

function tipoUsuarios(est) {
    
    if (est === '2') {
       $("#usuarios").hide();
        $("#grados").fadeIn("fast");
       
    } else if(est === '1'){
            $("#grados").fadeOut("fast");
             $("#usuarios").hide();
          $.post("ControladorPrincipal", {TIPO_USER:est, modulo: "cargarUsuarios"}, function (r) {
               $("#usuarios").show();
              $("#usuarios").html(r);

    });
        
        
    }
     
}

function obtenerInfoUser(PERS_ID, GRADO_CODIGO,TIPO_USER) {  

    $.post("ControladorPrincipal", {TIPO_USER: TIPO_USER,PERS_ID: PERS_ID, GRADO_CODIGO: GRADO_CODIGO, modulo: "buscarInfoUsuarios"}, function (r) {
        $("#rows_est").html(r);
    });
}

