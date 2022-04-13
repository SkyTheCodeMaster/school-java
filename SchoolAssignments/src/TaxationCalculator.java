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
    
    // Close the scanner object when finished to clean up resources.
    scanner.close();
  }
}
