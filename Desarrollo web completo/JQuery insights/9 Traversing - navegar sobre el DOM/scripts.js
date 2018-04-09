
jQuery(document).ready(function(){
    
    'use strict';

    /* Traversing es navegar sobre el dom juango con .parent() y .children()*/
    /*por ejemplo para seleccionar el main un truco sería encontrar el primer article y despues navegar 
    al parent */

    $('article:first').parent().children(); 
    /*next brinca al siguiente elemento del mismo tipo (de tipo article por ejemplo) */
    $('article:first').next().next();
});