// This calculates a letter grade with user input.

// Import the scanner class.
import java.util.Scanner;

public class LetterGrade {
  public static void main(String[] args) {
    // Initialize a scanner object as 'scanner'.
    Scanner scanner = new Scanner(System.in);
    
    // Prompt the user for inputting their grade.
    System.out.print("Please enter your grade for the assignment: ");
    // Collect the user input.
    // Double.parseDouble is used here instead of scanner.nextDouble because it produces more reliable results.
    double grade = Double.parseDouble(scanner.nextLine());
    
    // If the grade is above 80, the user received an A on their assignment.
    if (grade>=80) {
      // Inform them of this.
      System.out.println("You received an A on your assignment.");
    // If the grade is above 70, the user received a B on their assignment.
    } else if (grade>=70) {
      System.out.println("You received a B on your assignment.");
    // If the grade is above 60, the user received a C on their assignment.
    } else if (grade>=60) {
      System.out.println("You received a C on your assignment.");
    // If the grade is above 50, the user received a D on their assignment.
    } else if (grade>=50) {
      System.out.println("You received a D on your assignment.");
    // Otherwise, they failed.
    } else {
      System.out.println("You received an F on your assignment.");
    }
    
    // Discard the scanner once the program is finished.
    scanner.close();
  }
}
