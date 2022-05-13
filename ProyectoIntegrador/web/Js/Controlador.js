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

function verResultados() {
    $(".div_container").load('Resultados/BuscarEstudiante.jsp');
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
      
    }

    if (id === "esp") {

        $(".modal_titulo").text("Prueba de Lectura Critica");
        $(".modal_lect").fadeIn("slow");
        $(".modal_img").html(" <img style='height: 350px; width: 350px;' src='Images/lec_img.png' alt='alt'/>");
    }
    if (id === "ing") {
        $(".modal_titulo").text("Prueba de Ingles");
        $(".modal_ingl").fadeIn("slow");
          $(".modal_img").html(" <img style='height: 300px; width: 350px;' src='Images/ing_img.png' alt='alt'/>");
    }

    if (id === "syc") {
        $(".modal_titulo").text("Prueba de Ciencias Sociales y Ciudadania");
        $(".modal_ciud").fadeIn("slow");
              $(".modal_img").html(" <img style='height: 300px; width: 350px;' src='Images/soc_img.png' alt='alt'/>");
    }

    if (id === "cna") {
        $(".modal_titulo").text("Prueba de Ciencias Naturales");
        $(".modal_cna").fadeIn("slow");
         $(".modal_img").html(" <img style='height: 350px; width: 350px;' src='Images/cna_img.png' alt='alt'/>");
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
function  abrirPrueba() {
    $(".div_container").load('Pruebas/PruebaCiudadania.jsp');

}


function obtenerPrueaba() {


    if ($("#prueba").serialize().length >= 169) {
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

    $("input[type='radio']").prop('disabled',true);
        
    
    $("input[type='radio']:checked").each(function () {
        var idVal = $(this).attr("id");
      
        if($(this).attr("value") === '3'){
 
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

function obtenerEstudiantes(GRAD_CODIGO){
  
        $.post("ControladorPrincipal", {GRAD_CODIGO: GRAD_CODIGO, modulo: "cargarEstudiantes"}, function(r) {
            $("#estudiantes").html(r);
        });
    }
    
    
function obtenerInfoEstu(PERS_ID,GRADO_CODIGO){
  
        $.post("ControladorPrincipal", {PERS_ID: PERS_ID, GRADO_CODIGO: GRADO_CODIGO, modulo: "buscarEstudiante"}, function(r) {
            $("#rows_est").html(r);
        });
    }
    
    function cargarResultados(PERS_ID) {
        
        $.post("ControladorPrincipal", {PERS_ID: PERS_ID, modulo: "infoEstudiante"}, function(r) {
      
           $(".div_container").load('Resultados/ProgresoEstudiantes.jsp');
        });
   
}

/* FUNCIONES PROGRESO ESTUDIANTES **/

function abrirModalProg(PERS_ID,PREP_CODIGO, PRIN_CODIGO){    
 
      $.post("ControladorPrincipal", {PERS_ID: PERS_ID, PREP_CODIGO: PREP_CODIGO, PRIN_CODIGO:PRIN_CODIGO, modulo: "obtenerRespuestasEstu"}, function(r) {
            $(".prueba_preg").html(r);
    $(".modal_fondo").fadeIn("fast");
    $(".div_modal").fadeIn("fast");
        }); 
}

function  cargarIntentos(PERS_ID, PRUE_CODIGO){
    alert("ENTRO");
    $.post("ControladorPrincipal", {PERS_ID: PERS_ID, PRUE_CODIGO: PRUE_CODIGO, modulo: "cargarIntentos"}, function(r) {
      $(".cont_Intenttos").html(r);
       
        });
    
    
}

