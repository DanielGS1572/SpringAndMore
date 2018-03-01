<?php

	$myArray = array("Rob","Dan","Bob");
	print_r($myArray); 	/*r significa readable, viendo el page source pinta mejor la información en casos de que se tengan arreglos grandes*/
	echo $myArray[0]; /*Manda error si se sale del indice*/
	echo "<br><br>";
	$anotherArray[0] = "Pizza";
	$anotherArray[1] = "Bread";
	$anotherArray["favoriteFodd"] = "yogurth";
	$anotherArray[] = "zzzz";	/*Para agregar nuevos elementos a la lista*/

	print_r($anotherArray);

	echo "<br><br>";
	$thirdArray = array(
			"France" => "French",
			"USA" => "English",
			"x" => "x");
	print_r($thirdArray);
	echo sizeof($thirdArray);

	/*Para eliminar un elemento... */
	unset($thirdArray["USA"]);  /*el unset funciona de igual forma para eliminar variables*/
	echo "<br><br>";
	print_r($thirdArray);
?>

