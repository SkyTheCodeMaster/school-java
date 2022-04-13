/* Simple taxation calculation program.
 * Calculates tax on a salary, and has optional donation to charity.
 * 
 * Steps for using:
 * Input first name: "First"
 * Input last name: "Last"
 * Input hourly pay, "13.40"
 * Input hours worked, "80"
 * Input agreeance to pay for charity, "Y", "N"
 * 
 * Program will then calculate tax, and return:
 * Last, First
 * Hours worked: 80    Hourly Rate: 13.40
 * Gross Pay: 1340
 * Tax Bracket: D      Tax Deducted: $388.60
 * Net Pay: $951.40
 * 
 * Charity was not selected so $20 was not deducted
*/

import java.util.Scanner;
public class TaxationCalculator {
  public static void main(String[] args) {
    // Setup a scanner object to collect user input, via the standard System.in stream.
    Scanner scanner = new Scanner(System.in);
    
    // Ask the user for their first name.
    System.out.print("Please enter your first name: ");
    // Take user input.
    String nameFirst = scanner.nextLine();
    // Ask the user for their last name.
    System.out.print("Please enter your last name: ");
    // Take user input.
    String nameLast = scanner.nextLine();
    // Ask the user for their hourly wage.
    System.out.print("Please enter your hourly wage: ");
    double hourlyWage = Double.parseDouble(scanner.nextLine());
    // Ask the user for their hours worked.
    System.out.print("Please enter the number of hours worked: ");
    double hoursWorked = Double.parseDouble(scanner.nextLine());
    // Ask the user if they want to contribute to charity.
    System.out.print("Would you like to contribute to the Charity of Charityness? ");
    String tmp1 = scanner.nextLine();
    char agree = tmp1.toLowerCase().charAt(0);
    
    
    
    // Close the scanner object when finished to clean up resources.
    scanner.close();
  }
}
