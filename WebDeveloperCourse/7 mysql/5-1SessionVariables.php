<?php
 $link = mysqli_connect("localhost"/*server*/,"root","","webcourse"/*db name*/); /*Regularmente a la variable que realiza la conexion con la base de datos se llama link*/
	session_start();
    if(array_key_exists('email',$_POST) OR array_key_exists('password',$_POST)){
      //  print_r($_POST); --> para ver lo que se puso en los campos al dar submit
        if($_POST['email'] == ''){
            echo '<p>email required</p>';
        }
         if($_POST['password'] == ''){
            echo '<p>password required</p>';
        } else {
            $query = "SELECT id FROM users WHERE email = '".mysqli_real_escape_string($link,$_POST['email'])."'";
            $result = mysqli_query($link,$query);
            if(mysqli_num_rows($result) > 0){
                        echo "<p>That email address has already been taken </p>";
            } else {
                //Por cada parametro que se le pase a values puede ir sin el mysqli, pero no se esta protegiendo para la inyección de dependencias 
                //$query = "INSERT INTO users (email,password) values ('".$_POST['email']."','".$_POST['password']."')";
                $query = "INSERT INTO users (email,password) values ('".mysqli_real_escape_string($link,$_POST['email'])."','".mysqli_real_escape_string($link,$_POST['password'])."')";
                if(mysqli_query($link,$query)){
                    echo "<p>You have been signed up";
					$_SESSION['email'] = $_POST['email'];
				header("Location: 5-2SessionVariables.php");
                }else{
                    echo "<p>There was an error</p>";
                }
            }
        }
    }
  
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