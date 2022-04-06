import java.util.Scanner;

public class LegalDrinkingAge {
  public static void main(String[] args) {
    final int legalAge = 19;
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Welcome to the Kool Kidz Bar, you're only allowed in if you are %d years old, or older.\nPlease enter your age: ",legalAge);
    int age = Integer.parseInt(scanner.nextLine());
    if (!(age >= legalAge)) {
      int diff = legalAge - age;
      System.out.printf("Woah woah woah! You're not old enough to come in.\nPlease wait %d years before coming back!",diff);
      return;
    }
    System.out.print("Please enter your gender (male/female): ");
    String gender = scanner.nextLine();
    if (gender.toLowerCase().equals("male")) {
      System.out.println("Sorry, but you can't come in. It's ladies night.");
      return;
    }
    System.out.println("Welcome in!");
  }
}
