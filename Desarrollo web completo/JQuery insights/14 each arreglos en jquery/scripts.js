
jQuery(document).ready(function(){
    
    'use strict';
    /*Para obtener los valores de un arreglo a la funcion se le debe pasar dos parametros
    [llave, valor] */
    var proximosViajes = ['Londres', 'Valencia', 'Madrid', 'Paris', 'Milan'];

    
    $('aside').append('<h1>Proximos Viajes</h1>');
    $('aside').append('<ul>');
    $.each(proximosViajes, function(i,v){
      
        $('aside').append('<li>' + v + '</li>');  

    });
    $('aside').append('</ul>');


    /*Un objeto igual se recorre como un arreglo */
    var viajesPorFecha = {
        primero: 'Londres',
        segundo: 'Valencia',
        tercero: 'Madrid',
        cuarto: 'Paris',
        quinto: 'Milan'
    }
    $.each(viajesPorFecha, function(i,v){
        $('aside').append('<li>' + i + ' - ' + v + '</li>');
    });
});