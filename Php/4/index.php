<?php
if(isset($_POST['submit'])) 
{ 
    $name = $_POST['nombre'];
    echo "Hola ".$name." eres el papá de los helados"; 
}
?>
<form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
   <input type="text" name="nombre"><br>
   <input type="submit" name="submit" value="Submit"><br>
</form>
