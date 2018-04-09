
jQuery(document).ready(function(){
    
    'use strict';

    /*Se puede hacer refactoring en un solo objeto cuando se dispare un 
    listener, por ejemplo */
    $('main').on({
        click: function(){
            $(this).removeClass('fondorojo activo');    /*Se pueden agregar dos clases sin problemas */
        }, 
        mouseenter: function(){
            $(this).addClass('fondorojo');
        }, 
        mouseleave: function(){
            $(this).addClass('activo');
        }
    })
    /*Ver que en lugar de .on(click), se genera un nuevo objeto con los {} */
});