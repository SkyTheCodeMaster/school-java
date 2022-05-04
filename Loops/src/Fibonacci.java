public class Fibonacci {
  public static void main(String[] args) {
    int a = 0;
    int b = 1;
    System.out.printf("0\n1\n");
    int limit = 20;
    for (int i=1;i<=limit;i++) {
      int old = b;
      b = b+a;
      a=old;
      System.out.println(b);
    }
  }
}