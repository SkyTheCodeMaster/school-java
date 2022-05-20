
public class HockeyPriceList {
  public static void main(String[] args) {
    String[] itemNames = {
      "Skates",
      "Sticks",
      "Pads",
      "Pants",
      "Socks",
      "Jersey",
      "Helmet",
      "Elbow Pads",
    };
    double[] itemPrices = {
      150,
      25,
      79,
      120,
      15,
      25,
      120,
      55,
    };
    System.out.println("2021 Prices:");
    for (int i=0;i<itemNames.length;i++) {
      System.out.printf("%-15s$%1.2f\n", itemNames[i],itemPrices[i]);
    }
    System.out.println("\n2022 Prices:");
    for (int i=0;i<itemNames.length;i++) {
      System.out.printf("%-15s$%1.2f\n", itemNames[i],itemPrices[i]+(itemPrices[i]*0.2));
    }
  }
}
