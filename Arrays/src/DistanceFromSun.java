
public class DistanceFromSun {
  public static void main(String[] args) {
    String[] planetNames = {
      "Mercury",
      "Venus",
      "Earth",
      "Mars",
      "Jupiter",
      "Saturn",
      "Uranus",
      "Neptune",
    };
    double[] planetDistances = {
      57900000,
      108200000f,
      149600000f,
      227900000f,
      778600000f,
      1433500000f,
      2872500000f,
      4495100000f,
    };
    // Print the stuff out
    double furthestDistance=0;String furthestName="";
    for (int i=0;i<planetNames.length;i++) {
      System.out.printf("%-12s%.2fMm\n",planetNames[i],planetDistances[i]/1000000);
      if (planetDistances[i] > furthestDistance) {
        furthestDistance = planetDistances[i];
        furthestName = planetNames[i];
      }
    }
    // Subtract the distance from earth because we're starting there
    furthestDistance -= planetDistances[2];
    // Calculate distance at 7270kmh
    double time = furthestDistance / 7270;
    System.out.printf("It would take %.1f days to reach %s from the Earth.",time/24,furthestName);
  }
}
