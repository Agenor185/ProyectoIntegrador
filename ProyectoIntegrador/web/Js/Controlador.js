/* FUNCIONES PAGINA PRINCIPAL */
function cargarPagina(id) {
    if (id === "alumno") {
   alert("entro");
        $(".div_container").load('Registros/RegistroUsuario.jsp .div_formUser');

    }
    if (id === "docente") {
        alert("entro");
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

function cerrarMenu() {

}

