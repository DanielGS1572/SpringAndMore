<?php
    if(array_key_exists('email',$_POST) OR array_key_exists('password',$_POST)){
      //  print_r($_POST); --> para ver lo que se puso en los campos al dar submit
        if($_POST['email'] == ''){
            echo '<p>email required</p>';
        }
         if($_POST['password'] == ''){
            echo '<p>password required</p>';
        }
    }
  
   $link = mysqli_connect("localhost"/*server*/,"root","","webcourse"/*db name*/); /*Regularmente a la variable que realiza la conexion con la base de datos se llama link*/
   if(mysqli_connect_error())
   {
       die ("error connecting database");   
   }

?>

<form method = "post">

    <input name = "email" placeholder = "Email address">
    <input name = "password" type = "password" placeholder = "Password"> 
    <input type = "submit" value = "sign up">
</form>