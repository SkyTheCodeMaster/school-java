public class BeerOnTheWall {
  public static void main(String[] args) {
    for (int i=100000000;i>=1;i--) {
      System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n", i,i);
      System.out.printf("If one of those bottles should happen to fall, %d bottles of beer on the wall.\n", i-1);
    }
  }
}