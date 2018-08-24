class Main {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println(nod(sc.nextLong(),sc.nextLong()));
  }
  
  public static long nod(long a, long b){
      if (0==a) return b;
      if (0==b || a==b) return a;
      if (a>=b) return nod(a%b,b);
      if (b>=a) return nod(a,b%a);
      return 0;
  }
  
}