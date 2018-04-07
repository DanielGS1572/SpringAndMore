/*Ejemplo con JQuery para revisar que haya cargado el document*/
$(document).ready(function(){
    $('#contenido').append("con JQuery es mas facil");
});

/*Ejemplo con javascript para revisar que haya cargado el document*/
document.addEventListener('DOMContentLoaded', function(event){
    var elemento = document.getElementById('contenido2');
    var parrafo = document.createElement('p');

    var texto = document.createTextNode('con javascript es mas dificil');

    parrafo.appendChild(texto);
    elemento.appendChild(parrafo);
});