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
    System.out.print("Would you like to contribute to the United Way Charity? ");
    String tmp1 = scanner.nextLine();
    char agree = tmp1.toLowerCase().charAt(0);
    
    // Calculate gross pay
    double grossPay = hoursWorked*hourlyWage;
    
    // Calculate their tax bracket
    char taxBracket = 'Z';
    double deducted = 0;
    // If their pay is less than 150, their tax bracket is A and they have no deduction.
    if (grossPay <= 150) {
      taxBracket = 'A';
      deducted = 0;
    // If their pay is less than 150, their tax bracket is A and they have no deduction.
    } else if (grossPay <= 500) {
      taxBracket = 'B';
      deducted = (grossPay*0.1);
    // If their pay is less than 150, their tax bracket is A and they have no deduction.
    } else if (grossPay <= 750) {
      taxBracket = 'C';
      deducted = (grossPay*0.2);
    // If their pay is less than 150, their tax bracket is A and they have no deduction.
    } else if (grossPay <= 1500) {
      taxBracket = 'D';
      deducted = (grossPay*0.29);
    // If their pay is less than 150, their tax bracket is A and they have no deduction.
    } else {
      taxBracket = 'E';
      deducted = (grossPay*0.35);
    }
    
    double netPay = grossPay - deducted;
    if (agree == 'y') {
      netPay -= 20;
    }
    
    // Begin printing the pay slip
    System.out.printf("%s, %s\n", nameLast,nameFirst);
    // Print out the hours worked and rate
    System.out.printf("Hours worked: %.2f\tHourly rate: %.2f\n", hoursWorked,hourlyWage);
    // Print the gross pay
    System.out.printf("Gross pay: %.2f\n", grossPay);
    // Print out the tax bracket and deduction
    System.out.printf("Tax bracket: %s\tTax deduction: %.2f\n",taxBracket,deducted);
    // Print out the net pay
    System.out.printf("Net pay: %.2f\n", netPay);
    // If they agreed to give to charity, display a message.
    if (agree == 'y') { System.out.println("Thank you for your contribution to the United Way Charity."); }
    
    // Close the scanner object when finished to clean up resources.
    scanner.close();
  }
}
