<?php
   $link = mysqli_connect("localhost"/*server*/,"root","","webcourse"/*db name*/); /*Regularmente a la variable que realiza la conexion con la base de datos se llama link*/
   if(mysqli_connect_error())
   {
       die ("error connecting database");  /*Si no hay conexion con base de datos se mata el script*/
   }
   
   $query = "SELECT * FROM users";
   if($result = mysqli_query($link,$query)){
	   echo "query was succesful";
	  $row =  mysqli_fetch_array($result);
	  print_r($row);
	  echo "<br>"; echo "<br>";
	  echo "Your email is ".$row[1]."your password is ".$row["password"];  /*Hay dos formas de obtener los datos de la base, por id ó por nombre de columna*/
   }
?>