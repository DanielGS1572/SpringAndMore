<?php

	/*Las variables POST estan codificadas dentro de la URL, si se usa get variable y el valor de esa variable tiene un signo de interrogacion puede ser problematico cuando se forme la URL*/
	
	print_r($_POST);
?>


<!-- Pero en lugar de poner las variables en la liga se ponen en una forma-->

<p>What's your name?</p>
<form method="post"> <!--El valor por defecto es get -->
	<input name="number" type="text">  
	<input type="submit" value="Go">
</form>
