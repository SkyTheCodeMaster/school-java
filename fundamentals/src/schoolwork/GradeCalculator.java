package schoolwork;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class GradeCalculator {
  static Scanner scanner = new Scanner(System.in);
  @SafeVarargs
  static <T> void print(T... ts){for (T t : ts){System.out.print(t + " ");}System.out.println("");}
  static double round(double value, int places) {if (places < 0) throw new IllegalArgumentException();BigDecimal bd = BigDecimal.valueOf(value);bd = bd.setScale(places, RoundingMode.HALF_UP);return bd.doubleValue();}
  static void clearScreen() { 
    //Java sucks.
    for (int i = 0; i < 50; ++i) System.out.println();
  }
  static int safePromptInt(String prompt) {
    while (true) {
      try {
        print(prompt);
        int result = scanner.nextInt();
        return result;
      } catch (Exception e) {
        print("Invalid argument!");
      }
    }
  }
  public static void main(String[] args) {
    clearScreen();
    String subject1,subject2,subject3,subject4;
    double subject1_g,subject2_g,subject3_g,subject4_g;
    print("Please enter the name of your first subject:");
    subject1 = scanner.next();
    subject1_g = safePromptInt("Please enter the grade of your first subject:");
    clearScreen();
    print("Please enter the name of your second subject:");
    subject2 = scanner.next();
    subject2_g = safePromptInt("Please enter the grade of your second subject:");
    clearScreen();
    print("Please enter the name of your third subject:");
    subject3 = scanner.next();
    subject3_g = safePromptInt("Please enter the grade of your third subject:");
    clearScreen();
    print("Please enter the name of your fourth subject:");
    subject4 = scanner.next();
    subject4_g = safePromptInt("Please enter the grade of your fourth subject:");
    scanner.close();
    clearScreen();
    double average = (subject1_g+subject2_g+subject3_g+subject4_g)/4;
    print("Yours grades are:");
    print(subject1 +": "+subject1_g);
    print(subject2 +": "+subject2_g);
    print(subject3 +": "+subject3_g);
    print(subject4 +": "+subject4_g);
    print("Your average for this semester is: "+round(average,1));
  }
}