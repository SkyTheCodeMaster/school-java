package fundamentals;

import java.util.Scanner;

public class Calculator {
  @SafeVarargs
  static <T> void print(T... ts){for (T t : ts){System.out.print(t + " ");}System.out.println("");}
  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
    print("Input a number");
    float x = scanner.nextInt();
    print("Input a number");
    float y = scanner.nextInt();
    print(x + "+" + y + "=" + (x+y));
    print(x + "-" + y + "=" + (x-y));
    print(x + "x" + y + "=" + (x*y));
    print(x + "÷" + y + "=" + (x/y));
    scanner.close();
  }
}