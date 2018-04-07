$(function(){      

        /*$('main article:first').remove() -->  Remueve por completo, en lugar de hide*/
        var copia = $('main article:last').clone();
        $('main').append(copia);                       /*prepend lo agrega al principio, append al final */


        /*HAY OTR FORMA DE HACER LO ANTERIOR QUE RESULTARÁ IGUAL */
        var copia = $('main article:last').clone();
        $(copia).prependTo('main');
});