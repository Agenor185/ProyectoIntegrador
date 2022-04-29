function alertError(txt) {
    $(".alerta").remove();
    $("body").append("<div class=alerta hidden>\n\
  <div class=alert-error-icon >  </div><div class=alert-text >"+ txt +"</div>"+
            "<div onclick=closeAlert() class=alert-close-bttn ></div> </div>");

    $(".alerta").fadeToggle(500);
    $(".alerta").css({"background-color": "red"});
    $(".alerta").delay(10000).fadeOut(500);
}

function alertSucsses(txt) {
    $(".alerta").remove();
    $("body").append("<div class=alerta hidden>\n\
    <div  class=alert-check-icon ></div><div class=alert-text >" + txt +"</div>"+
            " <div onclick=closeAlert() class=alert-close-bttn> </div> </div>");

    $(".alerta").fadeToggle(500);
    $(".alerta").css({"background-color": "#3dbd50"});
   $(".alerta").delay(10000).fadeOut(500);
}

function closeAlert() {
    $(".alerta").hide();
}