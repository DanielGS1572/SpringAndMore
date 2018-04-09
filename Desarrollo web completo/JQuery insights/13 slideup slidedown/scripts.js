
jQuery(document).ready(function(){
    
    'use strict';

    $('.logo img').on('mouseenter',function(){
        $('main article:first').slideUp(1000);
    });
    $('.logo img').on('mouseleave',function(){
        $('main article:first').slideDown(1000);
    });
});