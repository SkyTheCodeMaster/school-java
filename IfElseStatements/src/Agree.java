import java.util.Scanner;

public class Agree {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Play again? (y/n): ");
    String choice = scanner.nextLine().toLowerCase();
    if (choice.equals("y")) {
      System.out.println("Excellent!");
    } else {
      System.out.println("See ya nerd lol");
    }
    scanner.close();
  }
}
