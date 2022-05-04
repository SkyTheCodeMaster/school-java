
public class CompoundInterest {
  public static void main(String[] args) {
    // User configuration
    double principal = 2000; // This is the starting currency in the account.
    double interest = 0.05; // 5% interest for storing money.
    int years = 40; // How many years to save for.
    double additional = 300; // How much money per month is added.
    // Internal variables
    for (int i=0;i<=years*12;i++) {
      principal += (principal * (interest/12));
      principal += additional;
      System.out.printf("Year %.0f\t| Month %d:\t$%.2f\n", Math.floor(i/12),i%12+1,principal);
    }
    System.out.printf("Final balance: %.2f",principal);
  }
}
