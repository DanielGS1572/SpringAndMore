<?php
    mysqli_connect("localhost","root","");
   if(mysqli_connect_error())
   {
       echo "error connecting database";
   }
   else{
       echo "database connection succesfull";
   }
?>