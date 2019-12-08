var idModal = "a.close_reveal_modal";
$(idModal).click();
var idBoton = "#free_play_form_button";
var botons = $(idBoton);
if (botons.length > 0 && botons.is(":visible")) {
	botons.click();
}