package schoolwork;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MilesToKilometres {
  static Scanner scanner = new Scanner(System.in);
  //Allows rounding the decimal places of a double, round(5.656,2) -> 5.66
  static double round(double value, int places) {if (places < 0) throw new IllegalArgumentException();BigDecimal bd = BigDecimal.valueOf(value);bd = bd.setScale(places, RoundingMode.HALF_UP);return bd.doubleValue();}
  // Scroll the screen 50 lines, because eclipse has no built in way of properly clearing the terminal.
  static void clearScreen() { 
    //Java sucks.
    for (int i = 0; i < 50; ++i) System.out.println();
  }
  public static void main(String[] args) {
    while (true) {
      System.out.println("Please enter what you what to convert in the form of 'unit,number', eg: 'mi,km' (Type 'exit' to exit)");
      String input = scanner.next();
      if (input.equals("exit")) {
        System.out.println("Exiting");
        break;
      }
      // setup array to allow multiple types of conversions
      String[] inputArray = input.split(",");
      // sanity chekcing
      int arrLength = inputArray.length;
      if (!(arrLength == 2)) {
        System.out.println("Invalid input!");continue;
      }
      double second = Double.parseDouble(inputArray[1]);
      switch (inputArray[0].toLowerCase()) {
        case "km": double mi = second/1.6093;System.out.printf("%.2f km = %.2f mi\n",second,mi);continue;
        case "mi": double km = second*1.6093;System.out.printf("%.2f mi = %.2f km\n",second,km);continue;
        default: System.out.println("Invalid operation! (Valid operations are 'mi','km'");
      }
    }
  }
}