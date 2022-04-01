import java.util.Scanner;
public class PythagoreanTheorem2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the mode you would like to use. The available ones are 'find leg' and 'find hypo'.");
    String mode = scanner.nextLine();
    mode = mode.replace("\n", "").replace("\n", "");
    System.out.println((mode == "find leg") ? "Please enter c" : "Please enter a");
    double ac = Double.parseDouble(scanner.nextLine());
    System.out.println("Please enter b");
    double b = Double.parseDouble(scanner.nextLine());
    switch (mode) {
      case ("find leg"):{
        double a = Math.sqrt(
          Math.pow(ac, 2) - Math.pow(b, 2)
        );
        System.out.printf("The length of a is %.2f units.", a);
      }
      case ("find hypo"): {
        double c = Math.sqrt(
          Math.pow(ac, 2) + Math.pow(b, 2)
        );
        System.out.printf("The length of c is %.2f units.", c);
      }
        
    }
    scanner.close();
  }
}
