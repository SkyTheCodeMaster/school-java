import java.util.Scanner;

public class SalaryCalculator {
  public static void main(String[] args) {
    // Create our System.in reader
    Scanner scanner = new Scanner(System.in);
    // Ask user for their first name and last name
    System.out.println("Please enter your first and last name, delimited by a space.");
    String tmp = scanner.nextLine();
    // Now split it into first name and last name by spaces (name[0] is first name, name[1] is surname)
    String[] name = tmp.split(" ");
    // Now ask the user for the number of hours they have worked.
    System.out.println("Please enter the number of hours you have worked.");
    double hoursWorked = scanner.nextDouble();
    // Now ask them for their hourly wage.
    System.out.println("Please enter your hourly wage.");
    double hourlyWage = scanner.nextDouble();
    // Now calculate their weekly salary.
    double weeklySalary = hoursWorked*hourlyWage;
    System.out.printf("%s %s, your weekly salary for %.2f hours worked at $%.2f/hr is: $%.2f",name[0],name[1],hoursWorked,hourlyWage,weeklySalary);
  }
}
