<?php
   $link = mysqli_connect("localhost"/*server*/,"root","","webcourse"/*db name*/); /*Regularmente a la variable que realiza la conexion con la base de datos se llama link*/
   if(mysqli_connect_error())
   {
       die ("error connecting database");   
   }
   
  // $query = "INSERT INTO users (email,password) VALUES ('test@test.com','abcd')";
$query = "UPDATE users SET email = 'test2@xx.com' where id = 1 LIMIT 1";

   mysqli_query($link,$query);
?>