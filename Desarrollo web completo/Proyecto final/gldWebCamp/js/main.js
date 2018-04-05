(function(){

	"use strict";
var regalo = document.getElementById('regalo');
	document.addEventListener('DOMContentLoaded',function(){
		
		//Campos datos usuarios
		var nombre = document.getElementById('nombre');
		var apellido = document.getElementById('apellido');
		var email = document.getElementById('email');


		//Campos pases
		var pase_dia = document.getElementById('pase_dia');
		var pase_dos = document.getElementById('pase_dos');
		var pase_completo = document.getElementById('pase_todos');

		//Botones y divs
		var calcular = document.getElementById('calcular');
		var errorDiv = document.getElementById('error');
		var botonRegistro = document.getElementById('btnRegistro');
		var resultado = document.getElementById('lista-productos');

		calcular.addEventListener('click',eventoCalcular);

		function eventoCalcular(event){
			event.preventDefault();		/*al presionar submit, el formulario es enviado y su acción por default es refrescar la ventana, esto evita eso*/
			if(regalo.value === ''){
				alert("Debes elegir un regalo");
				regalo.focus();
			}else{
				
				var boletosDia = pase_dia.value;
				var boletos2Dias = pase_dos.value;
				var	boletoCompleto = pase_completo.value;

				var totalPagar = (boletosDia * 30) + (boletos2Dias * 45) + (boletoCompleto * 50);
				console.log(totalPagar);
			}
		}


	});
})();