import java.util.Scanner;

public class ifElseLesson {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testValue = 5;
    int yourNum = 0;
    
    System.out.print("Please enter your number: ");
    yourNum = Integer.parseInt(scanner.nextLine());
    if (yourNum == testValue) {
      System.out.println("The entered number is equal to the test value.");
    } else {
      System.out.println("The entered number is NOT equal to the test value.");
    }
  }
}
