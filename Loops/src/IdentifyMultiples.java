public class IdentifyMultiples {
  public static void main(String[] args) {
    int multiple = 4; // This is the number that we are trying to find multiples for
    int limit = 50; // This is the number we are identifying up to.
    for (int i=1;i<=limit;i++) {
      if (i%multiple == 0) {
        System.out.printf("%d is a multiple of %d\n",i,multiple);
      }
    }
  }
}