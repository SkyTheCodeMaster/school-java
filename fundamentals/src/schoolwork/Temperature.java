package schoolwork;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Temperature {
  static Scanner scanner = new Scanner(System.in);
  //Simple renaming of `System.out.println`
  @SafeVarargs
  static <T> void print(T... ts){for (T t : ts){System.out.print(t + " ");}System.out.println("");}
  //Allows rounding the decimal places of a double, round(5.656,2) -> 5.66
  static double round(double value, int places) {if (places < 0) throw new IllegalArgumentException();BigDecimal bd = BigDecimal.valueOf(value);bd = bd.setScale(places, RoundingMode.HALF_UP);return bd.doubleValue();}
  // Scroll the screen 50 lines, because eclipse has no built in way of properly clearing the terminal.
  static void clearScreen() { 
    //Java sucks.
    for (int i = 0; i < 50; ++i) System.out.println();
  }
  public static void main(String[] args) {
    while (true) {
      print("Please enter what you what to convert in the form of 'unit,number', eg: 'C,22' (Type 'exit' to exit)");
      String input = scanner.next();
      if (input.equals("exit")) {
        print("Exiting");
        break;
      }
      // setup array to allow multiple types of conversions
      String[] inputArray = input.split(",");
      // sanity chekcing
      int arrLength = inputArray.length;
      if (!(arrLength == 2)) {
        print("Invalid input!");continue;
      }
      double second = Double.parseDouble(inputArray[1]);
      switch (inputArray[0].toLowerCase()) {
        case "c": double f1=(second * 9/5) + 32;double k1=second+273.15;print(second + "C = " + f1 + "F = " + k1 + "K");continue;
        case "f": double c2=(second-32) * 5/9;double k2=c2+273.15;print(c2 + "C = " + second + "F = " + k2 + "K");continue;
        case "k": double c3=second-273.15;double f3=(second * 9/5) + 32;print(c3 + "C = " + f3 + "F = " + second + "K");continue;
        default: print("Invalid operation! (Valid operations are 'c','f','k'");
      }
    }
  }
}