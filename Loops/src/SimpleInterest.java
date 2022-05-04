
public class SimpleInterest {
  public static void main(String[] args) {
    double cash = 2000;
    double interestRate = 0.05;
    int years = 4;
    for (int i=1;i<=years;i++) {
      cash += (cash*interestRate);
    }
    System.out.printf("After %d years, there will be $%.2f in the bank account.", years,cash);
  }
}
