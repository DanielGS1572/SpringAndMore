$(document).ready(function(){
   $('div.logo img').on('mouseenter',function(){
       console.log('Entrado');
   });

   $('div.logo img').on('mouseleave',function(){
       console.log('Salido');
   });

   
   $('div.logo img').on('click',function(){
       $('.navegacion').show();
   })
});

