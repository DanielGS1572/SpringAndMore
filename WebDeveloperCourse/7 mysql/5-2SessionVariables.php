<?php
 
    //para desplegar información de cierto usuario se puede hacer de dos formas a traves de la sesión y a traves de las cookies
    //la variable de sesion funciona de la misma manera que get y post

    session_start();
    //Esta asignación permanece viva hasta que el usuario cierre el browser, para eso debe tener session_start() al principio de cada pagina
    if($_SESSION['email']){
        echo "Welcome ".$_SESSION['email'];
    }
    else{
        header('Location: 5-1SessionVariables.php');
    }
?>
