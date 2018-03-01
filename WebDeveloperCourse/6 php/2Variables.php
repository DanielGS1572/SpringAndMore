<?php

	$name = "Daniel";
	echo $name."<br>";	/*Se puede poner codigo html*/
	echo "My name is $name ";
	echo $name."     ".$name;  /*Para concatenar se usa el punto*/
	$myNumber = 45;
	$calculation = $myNumber * 2;
	echo "<br>".$calculation;
	$myBool = false;		/*Para True pone un 1 y para false simplement no pone nada*/
	echo "<p>$myBool</p>";
	/*Hay variables que pueden contener variables, por ejemplo*/
	$variableName = "name";
	echo "<p>".$$variableName."</p>";

?>

