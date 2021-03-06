var api = 'AIzaSyBJJ8ZJtpVvz_pXGRi87_Sa2P1SmPaAPtA';

function initMap() {
		var latLng = {
			lat: 20.6772885,
			lng: -103.3856328
		};
		var map = new google.maps.Map(document.getElementById('mapa'), {
          'center': latLng,
          'zoom': 14,
          'mapTypeId': google.maps.MapTypeId.ROADMAP,
          'draggable': false,
          'scrollwheel': false
        });

        var marker = new google.maps.Marker({
	      	position: latLng,
	      	map: map,
	      	title: 'GDLWEBCAMP'
      	});

        var contenido =   '<h2>GDLWEBCAMP</h2>' +
                        '<p>Del 10 al 12 de Diciembre</p>' +
                        '<p>Visitanos</p>';

        var informacion = new google.maps.InfoWindow({
            content: contenido
        });
      
      marker.addListener('click', function(){
            informacion.open(map,marker);
      });
}

     

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
		var lista_productos = document.getElementById('lista-productos');
		var suma = document.getElementById('suma-total');
		//Extras
		var camisas = document.getElementById('camisa_evento');
		var etiquetas = document.getElementById('etiquetas');
		if(calcular !== null){
		calcular.addEventListener('click',eventoCalcular);
		}
		if(pase_dia !== null){
			pase_dia.addEventListener('blur',mostrarDias);
		}
		if(pase_dos!==null){
			pase_dos.addEventListener('blur',mostrarDias);
		}
		if(pase_completo !== null){
			pase_completo.addEventListener('blur',mostrarDias);
		}
		if(nombre !== null && apellido  !== null && email  !== null){
			nombre.addEventListener('blur',validarCampos);
			apellido.addEventListener('blur',validarCampos);
			email.addEventListener('blur',validarCampos);
			email.addEventListener('blur',validarMail);
		}


		function validarMail(){
			if(this.value.indexOf("@") > -1){  		/*En caso de que no encuentre el caracter enviara un -1, por eso se pone mayor que -1*/
				errorDiv.style.display = 'none';
				this.style.border = '1px solid #ccc';
			} else{
				errorDiv.style.display = 'block';
				errorDiv.innerHTML = "Debe tener al menos un @";
				this.style.border = '1px solid red';
				errorDiv.style.border = '1px solid red';
			}
		}
		function validarCampos(){
			if(this.value == ''){
				errorDiv.style.display = 'block';
				errorDiv.innerHTML = "este campo es obligatorio";
				this.style.border = '1px solid red';
				errorDiv.style.border = '1px solid red';
			}else{
				errorDiv.style.display = 'none';
				this.style.border = '1px solid #ccc';
			} 

		}
		function eventoCalcular(event){
			event.preventDefault();		/*al presionar submit, el formulario es enviado y su acción por default es refrescar la ventana, esto evita eso*/
			if(regalo.value === ''){
				alert("Debes elegir un regalo");
				regalo.focus();
			}else{
				
				var boletosDia = parseInt(pase_dia.value,10)||0,			/*En caso de que capturen algo diferente a entero se proteje con parseInt*/
				boletos2Dias = parseInt(pase_dos.value)||0,
				boletoCompleto = parseInt(pase_completo.value)||0,
				cantCamisas = parseInt(camisas.value)||0,
				cantEtiquetas = parseInt(etiquetas.value)||0;


				var totalPagar = (boletosDia * 30) + (boletos2Dias * 45) + (boletoCompleto * 50)
				+ ((cantCamisas * 10) * .93) + (cantEtiquetas * 2);

				var listadoProductos = [];

				if(boletosDia >= 1){
					listadoProductos.push(boletosDia + ' Pases por día');
				}
				if(boletos2Dias >= 1){
					listadoProductos.push(boletos2Dias + ' Pases por 2 días');	
				}
				if(boletoCompleto >= 1){
					listadoProductos.push(boletoCompleto + ' Pases completos');
				}
				if(cantCamisas >= 1){
					listadoProductos.push(cantCamisas + ' Camisas');
				}
				if(cantEtiquetas >= 1){
					listadoProductos.push(cantEtiquetas + ' Etiquetas');
				}

				console.log(listadoProductos);

				lista_productos.innerHTML = '';
				for(var i = 0; i < listadoProductos.length; i++){
					lista_productos.innerHTML += listadoProductos[i] + '<br/>'
				}	
				lista_productos.style.display = 'block';
				suma.innerHTML =	"$ " + totalPagar.toFixed(2);		 
			}
			

		}

			function mostrarDias(){
				var boletosDia = parseInt(pase_dia.value,10)||0,			/*En caso de que capturen algo diferente a entero se proteje con parseInt*/
				boletos2Dias = parseInt(pase_dos.value)||0,
				boletoCompleto = parseInt(pase_completo.value)||0;
				
				var diasElegidos = [];

				if(boletosDia > 0){
					diasElegidos.push('viernes');
				}
				if(boletos2Dias > 0){
					diasElegidos.push('viernes','sabado');
				}
				if(boletoCompleto > 0){
					diasElegidos.push('viernes','sabado','domingo');
				}
				for(var i = 0; i < diasElegidos.length; i++){
					document.getElementById(diasElegidos[i]).style.display = 'block';
				}
			}

	});
})();


$(function(){

	/***********************************************
			LETTERING (INICIO)
	 ***********************************************/
		$('.nombre-sitio').lettering();			/*Cuando se agrega esto, si se inspecciona el html se verá que agrega unos spans, en el css se le estaran dando estilos (en la sección de LETTERING) */
	/***********************************************
			LETTERING  (FIN)
	 ***********************************************/

	/***********************************************
			PROGRAMA DE CONFERENCIAS (INICIO)
	 ***********************************************/
		$('.programa-evento .info-curso:first').show();
		$('.menu-programa a:first').addClass('activo');

		$('.menu-programa a').on('click',function(){
			$('.menu-programa a').removeClass('activo');
			$(this).addClass('activo');
			$('.ocultar').hide();
			var enlace = $(this).attr('href');
			console.log(enlace);
			$(enlace).fadeIn(1000);
			return false;				/*Si no se pone este return false hace un brinco en la pagina */
		});

	/***********************************************
			PROGRAMA DE CONFERENCIAS (FIN)
	 ***********************************************/

	/***********************************************
			ANIMACION DE LOS NUMEROS
	 ***********************************************/
		$('.resumen-evento li:nth-child(1) p').animateNumber({number : 6},1200);
		$('.resumen-evento li:nth-child(2) p').animateNumber({number : 15},1200);
		$('.resumen-evento li:nth-child(3) p').animateNumber({number : 3},1600);
		$('.resumen-evento li:nth-child(4) p').animateNumber({number : 9},1500);
	/***********************************************
			ANIMACION DE LOS NUMEROS (FIN)
	 ***********************************************/

	/***********************************************
			CUENTA REGRESIVA
	 ***********************************************/

		$('.cuenta-regresiva').countdown('2018/12/12', function(event){
			$('#dias').html(event.strftime('%D'));
			$('#horas').html(event.strftime('%H'));
			$('#minutos').html(event.strftime('%M'));
			$('#segundos').html(event.strftime('%S'));
		});
	/***********************************************
			CUENTA REGRESIVA (FIN)
	 ***********************************************/
});