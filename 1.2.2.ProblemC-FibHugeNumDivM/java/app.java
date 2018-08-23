import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scaner = new Scanner(System.in);
        long n = scaner.nextLong();
        // max int == 2147483647 > 100000.0
        int m = scaner.nextInt();
        System.out.println(modfib(n, m));
    }

    private static int modfib(long n, int m) {
        if (n >= 1 && m >= 2 && m <= Math.pow(10, 5) && n <= Math.pow(10, 18)) {
            int[] mas = new int[m * 6];
            mas[0] = 0;
            mas[1] = 1;
            for (int i = 2; i <= mas.length; i++) {
                if ((mas[i] = ((mas[i - 1] + mas[i - 2]) % m)) == 1 && mas[i - 1] == 0) {
                    return mas[(int) (n % (i - 1))];
                }
            }
        }
        return 0;
    }
}