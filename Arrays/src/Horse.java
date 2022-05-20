import java.util.Scanner;
public class Horse {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] horseNames = {"Rudolph","Peanut Butter","Thunder","Jelly Sandwich","Jorgan","Reign","Horse","Don Key"};
    int[] horseWeights = {3000,4000,2500,4200,6000,5000,2000,1000};
    int totalWeight = 0;
    for (int weight : horseWeights) {
      totalWeight += weight;
    }
    System.out.printf("Total weight: %dlbs\n",totalWeight);
    System.out.println("Horse               Weight   Stable");
    for (int i=0;i<horseWeights.length;i++) { if (horseWeights[i] != 0) {
      System.out.printf("%-20s%d lbs %d\n", horseNames[i],horseWeights[i],i+1);
    }}
    while (true) {
      System.out.print("Please enter the name of a horse to search for: ");
      String name = scanner.nextLine().toLowerCase();
      boolean found = false;
      for (int i=0;i<horseNames.length;i++) {
        if (horseNames[i].toLowerCase().equals(name)) {
          found = true;
          System.out.printf("Stats of %s:\nWeight: %d lbs\nStable: %d\n",horseNames[i],horseWeights[i],i+1);
          break;
        }
      }
      if (!found) {
        System.out.println("Horse not found.");
      }
    }
  }
}