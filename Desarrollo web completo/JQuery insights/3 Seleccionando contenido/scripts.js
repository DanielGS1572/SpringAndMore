$(function(){       /*El signo de dolar $ ò jQuery es lo mismo*/
        'use strict';       /*Para seleccionar debe ser al estilo css*/
        document.querySelector('header');   /* Version javascript */
        $('header');   /* Version jQuery */

        $('header .contenedor') /*selecciona el contenedor que esta dentro del header */

        $('.navegacion').find('a');     /*Es lo mismo que $('.navegacion a') */
        $('#contenedor')                /*Para seleccionar una clase */

        $('main article')               /*Para encontrar todos los articles dentro del dom */
        
        $('main article:first')              /*Para seleccionar el primer article (:last) */

        $('main article:last p:last')         /*Para seleccionar el ultimo p del ultimo article */

        $('main article:last p:last').hide();
        /*Traversing es como ir navegando sobre todo el documento */


});