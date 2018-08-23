def fib(n):
	f1, f2 = 0, 1
	for i in range(1,n):
		f1, f2 = f2, f1 + f2
	return f2
	
def main():
	n = int(input())
	print(fib(n))


if __name__ == "__main__":
	main()