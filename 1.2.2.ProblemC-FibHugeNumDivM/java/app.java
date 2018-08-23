import java.util.Scanner;

class Main {
  public static int fibonacci(int n, int m) {
		int f1 = 0;
		int f2 = 1, f3 = 1;
		for (int i = 1; i < n; i++){
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3 % m;
		}
        return f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(fibonacci(n,m));
    }
}