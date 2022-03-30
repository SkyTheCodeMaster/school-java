package fundamentals;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PurchaseTax {
  @SafeVarargs
  static <T> void print(T... ts){for (T t : ts){System.out.print(t + " ");}System.out.println("");}
  static double round(double value, int places) {if (places < 0) throw new IllegalArgumentException();BigDecimal bd = BigDecimal.valueOf(value);bd = bd.setScale(places, RoundingMode.HALF_UP);return bd.doubleValue();}

  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
    double tax = 1.13;
    while (true) {
      print("Please input the cost of your purchase: (type 'exit' to exit)");
      String input = scanner.next();
      if (input.toLowerCase().equals("exit")) {
        break;
      }
      double cost = Double.parseDouble(input);
      double total = round(cost*tax,2);
      print("The total cost is "+total);
    }
    scanner.close();
  }
}