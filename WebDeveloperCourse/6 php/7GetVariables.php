<?php
	/*Las variables get pasan información del browser al server*/
	
	/*Hay dos formas en las que el usaurio puede interactuar
		- Variables post
		- Variables get	
	Las variables get Estan codificadas en la URL en la forma de ?name = Rob y si se tiene mas de una variable se separa con &
	por ejemplo
			 ?name = Rob&password=1234
	Se le puede pasar directamente y de todas formas si cargará la información

			http://localhost/7GetVariables.php/?name=test


	*/

	/*Para acceder a las variables get siempre se guardan en una variable $_GET*/
	//print_r($_GET);
	//echo "<br>";
	//echo $_GET["name"];

	/*if($_GET){
	
	}	 --> sí $_GET contiene algún valor, ejecutara el bloque de codigo*/
	echo "Hi there ".$_GET["name"]."!";
?>


<!-- Pero en lugar de poner las variables en la liga se ponen en una forma-->

<p>What's your name?</p>
<form>
	<input name="name" type="text">  <!-- cuando se haga el submit el name del input será la variable get que ponra en la URL-->
	<input type="submit" value="Go">
</form>
