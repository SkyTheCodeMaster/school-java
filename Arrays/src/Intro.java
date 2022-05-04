
public class Intro {
  public static void main(String[] args) {
    int grades[] = new int []{0,0,0,77,0,84,0,0};
    // init var
    for (int i=0;i<=grades.length-1;i++) {
      System.out.printf("%d: %d\n", i,grades[i]);
    }
  }
}
