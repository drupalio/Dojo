<?php
if(isset($_POST['submit'])) 
{ 
    $a = $_POST['a'];
    $b = $_POST['b'];
    echo "a+b:".($a+$b)."<br>";
	echo "a-b:".($a-$b)."<br>";
	echo "a*b:".($a*$b)."<br>";
	echo "a/b:".($a/$b)."<br>";
	echo "a%b:".($a%$b)."<br>";
}
?>
<form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
   <input type="text" name="a"><br>
   <input type="text" name="b"><br>
   <input type="submit" name="submit" value="Submit"><br>
</form>
