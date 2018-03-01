<?php

	$family = array("Rob","kirsten","Tommy","Ralphie");
	
	foreach($family as $key => $value){
		$family[$key] = $value."Percival"; /*Para agregar a cada elemento algo nuevo, pero se ve reflejado hasta la segunda iteración*/
		echo "Array item ".$key." Value ".$value."<br>";
	}

	echo "<br>";

	for($i = 0; $i < sizeof($family); $i++){
		echo $family[$i]."<br>";
	}

	

	

?>

