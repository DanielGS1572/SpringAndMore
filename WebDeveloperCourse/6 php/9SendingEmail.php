<?php

	$emailTo = "gonzalisd@gmail.com";
	$subject = "hello";
	$body = "Hi, there";

	$headers = "From: dgonzalis@hotmail.com";

	if(mail($emailTo,$subject,$body,$headers)){	 /*Regresa 1 o 0 */	
		echo "email sent";
	}else{
		echo "not sent";
	}
?>

