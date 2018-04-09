
jQuery(document).ready(function(){
    
    'use strict';

    /*Para modificar los estilos; */
    $('.logo img').css({
        'width': '200px',
        'height': '300px'
    })
    /*Cambio ante un listener */
    $('.navegacion ul li a').on('mouseenter', cambiarColor);

    function cambiarColor(e){
        $(this).css('background-color','red')       /*Si no se agregan llaves puede llevar solo una coma, si se agregan llevan : */
    }
});