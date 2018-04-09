
jQuery(document).ready(function(){
    
    'use strict';

    /*Para seleccionar un atributo se usa attr */
    $('.navegacion ul li:first a').attr('href');        /*Selecciona el href de la liga que es google */
    /*Para cambiar el atributo simplemente se le pasa un segundo parametro */
    $('.navegacion ul li:first a').attr('href','http://www.udemy.com');

    /*Tener cuidado con nth-child pues selecciona el hijo del elemento que se le ponen dos puntos, 
    en este caso el 2° hijo de tipo article de main */
     $('main article:nth-child(2) h2').text("cambio de texto");
});