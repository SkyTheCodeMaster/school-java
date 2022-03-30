import java.util.Scanner;

public class ButcherShop {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    // Initialize prices, empty name, and empty quantities.
    double priceHamburger = 5.99;
    double priceSteak = 10.99;
    String name = "";
    double qtyHamburger,qtySteak = 0;
    
    Scanner scanner = new Scanner(System.in);
    // Print a nice welcome.
    System.out.println("Welcome to the ButcherShop™!");
    
    // Ask for their name, date of birth, social security number, phone number, email address, physical address
    System.out.print("Please enter your name: ");
    name = scanner.nextLine();
    
    // Begin prompting the user for hamburger quantity.
    System.out.println("How many pounds of hamburger would you like to enjoy at this moment in time.");
    qtyHamburger = scanner.nextDouble();
    // Ask them for their steak quantity.
    System.out.println("How many pounds of steak would you like to enjoy at this moment in time.");
    qtySteak = scanner.nextDouble();
    
    double subTotal = (qtyHamburger*priceHamburger) + (qtySteak*priceSteak);
    double tax = subTotal*0.13;
    double total = subTotal + tax;
    System.out.printf("Your receipt:\nHamburger: %.2f lbs\nSteak: %.2f lbs\n\nSubtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f\n",
      qtyHamburger,
      qtySteak,
      subTotal,
      tax,
      total
    );
    System.out.printf("Thank you for shopping at ButcherShop™!\nPlease come again soon, %s!",
      name
    );
  }
}
