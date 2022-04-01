import java.util.Scanner;

public class PythagoreanTheorem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to like grade 4 math lol nerd enter a number");
    double a = Double.parseDouble(scanner.nextLine());
    System.out.printf("Alright, a = %.2f, that's good enough I guess... enter a number for b\n", a);
    double b = Double.parseDouble(scanner.nextLine());
    double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
    System.out.printf("The length of the hypotenuse is %.2f\n", c);
    System.out.println("That wasnt so hard maybe you should learn to use a calculator... oh wait");
    scanner.close();
  }
}
