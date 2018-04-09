
jQuery(document).ready(function(){
    
    'use strict';

    $('.logo img').on('mouseenter',function(){
        $(this).animate({'width':'200px'},1000);
    });

    $('main article img').on('mouseenter',aumentarImagen);
    $('main article img').on('mouseleave',disminuirImagen);

    function aumentarImagen(){
        $(this).animate({'width':'100%'},1000);
    }
    function disminuirImagen(){
        $(this).animate({'width':'300px'},100);
    }
});