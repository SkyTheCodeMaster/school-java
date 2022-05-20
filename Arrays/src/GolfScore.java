import java.util.Scanner;
public class GolfScore {
  public static void main(String[] args) {
    // Golf course pars
    int[] pars = {4,5,4,4,3,5,4,3,5};
    // Internal variables no touchie
    Scanner scanner = new Scanner(System.in);
    int playerScore = 0;
    int coursePar = 0;
    String finalOutput = "";
    for (int i=0;i<pars.length;i++) {
      int hole = i+1;
      int par = pars[i];
      finalOutput += "--------------------------\n";
      finalOutput += String.format("Hole: %d\n", hole);
      finalOutput += String.format("Par for hole: %d\n", par);
      
      System.out.printf("Enter your score for hole %d: ", hole);
      int score = Integer.parseInt(scanner.nextLine());
      
      finalOutput += String.format("Your score: %d\n", score);
      int diff = par - score; // If positive then they are `diff above par`. If negative then they are `deff below par`. If 0 then they are `at par`
      if (0<diff) {
        finalOutput += String.format("You are %d above par.\n", diff);
      } else if (0>diff) {
        finalOutput += String.format("You are %d below par.\n", Math.abs(diff));
      } else {
        finalOutput += "You are at par.\n";
      }
      coursePar += par;
      playerScore += score;
    }
    finalOutput += "--------------------------\n";
    finalOutput += String.format("Par for the course: %d\n", coursePar);
    finalOutput += String.format("Your score: %d\n", playerScore);
    int diff = coursePar - playerScore;
    if (0<diff) {
      finalOutput += String.format("You are %d above par.\n", diff);
    } else if (0>diff) {
      finalOutput += String.format("You are %d below par.\n", Math.abs(diff));
    } else {
      finalOutput += "You are at par.\n";
    }
    System.out.print(finalOutput);
  }
}