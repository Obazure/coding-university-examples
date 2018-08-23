<?php
function fib($n){
	$f1 = 0;
	$f2 = 1;
	for($i=2; $i<=$n; $i++){
		$f3 = ($f1 + $f2) % 10;
		$f1 = $f2;
		$f2 = $f3; 
	}
	return $f2;
}
	
print(fib(1));
echo "<br/>";
print(fib(2));
echo "<br/>";
print(fib(3));
echo "<br/>";
print(fib(4));
echo "<br/>";
print(fib(5));
echo "<br/>";
print(fib(6));
echo "<br/>";
print(fib(7));
echo "<br/>";
print(fib(8));