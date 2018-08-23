<?php
function fib($n){
	$f1 = 0;
	$f2 = 1;
	for($i=2; $i<=$n; $i++){
		$f3 = $f1 + $f2;
		$f1 = $f2;
		$f2 = $f3; 
	}
	return $f2;
}
	
print(fib(1));
print(fib(2));
print(fib(3));
print(fib(4));
print(fib(5));
print(fib(6));
print(fib(7));
print(fib(8));