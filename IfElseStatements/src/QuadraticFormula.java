import java.util.Scanner;

public class QuadraticFormula {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a: ");
    double a = Double.parseDouble(scanner.nextLine());
    System.out.print("Please enter b: ");
    double b = Double.parseDouble(scanner.nextLine());
    System.out.print("Please enter c: ");
    double c = Double.parseDouble(scanner.nextLine());
    double test = Math.pow(b, 2) - 4*a*c;
    if (test > 0) {
      System.out.println("The parabola has two roots.");
      double root1 = -b + Math.sqrt(test) / 2*a;
      double root2 = -b - Math.sqrt(test) / 2*a;
      System.out.printf("The parabola has two roots at %.2f and %.2f.",root1,root2);
    } else if (test == 0) {
      double root = -b / 2*a;
      System.out.printf("The parabola has one root at %.2f",root);
    } else {
      System.out.print("The parabola has no roots.");
    }
    scanner.close();
  }
}
