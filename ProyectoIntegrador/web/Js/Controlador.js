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

/* FUNCIONES REGISTRO USUARIO*/

/* AJAX ENVIO REGISTRO */


function nuevaUsuario() {
    alert("Envio 1 ");
    alert($("#form_persona").serialize());
        $.ajax({
            type: 'post',
            url: $("#form_persona").attr('action'),
            data: $("#form_persona").serialize(),
            success: function (data) {
               alert("Envio");
           
            }
        });


  
}

