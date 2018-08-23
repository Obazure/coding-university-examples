import java.util.Scanner;

class Main {
  public static long fibonacci(int n) {
		int f1 = 0;
		int f2 = 1;
		int f3;
		for (int i = 1; i < n; i++){
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
        return f2;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
		System.out.println(fibonacci(n));
    }
}