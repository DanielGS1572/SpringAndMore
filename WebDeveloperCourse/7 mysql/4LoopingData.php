<?php
   $link = mysqli_connect("localhost"/*server*/,"root","","webcourse"/*db name*/); /*Regularmente a la variable que realiza la conexion con la base de datos se llama link*/
   if(mysqli_connect_error())
   {
       die ("error connecting database");   
   }
   
  // se traera mas de un solo elemento de la base de datos
  $name = "Rob O'Grady";
  $query = "SELECT  email FROM users where name = '".msqli_real_escape_string($link,$name)."'"; 
  /*
    Para cuando se tenga comillas simples se usa escape_string, con esta instruccion se evitan hacer inyecciones
    de sql
  */
$query = "SELECT * FROM users";

  if($result = mysqli_query($link,$query)){
      while($row = mysqli_fetch_array($result)){
          print_r($row);
      }
  } 
?>