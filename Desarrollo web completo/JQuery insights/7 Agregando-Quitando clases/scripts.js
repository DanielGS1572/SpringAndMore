$(document).ready(function(){
   $('div.logo img').addClass('activo');        /*A img se le agrega la clase de activo */
   $('.navegacion').show();

   $('.navegacion nav ul li:first').addClass('activo');
   $('main article:first').addClass('activo');


   $('.navegacion ul li a').on('click', function(e){
       $('.navegacion ul li a').removeClass('activo');
       e.preventDefault();                  //evita que al dar click responda de la forma que debe de ser, en este caso abrir una pagina, (al seleccionar inicio abria google)
       $(this).addClass('activo');
   });
});

