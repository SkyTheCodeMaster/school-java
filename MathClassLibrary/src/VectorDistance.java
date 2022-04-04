import java.util.Scanner;
public class VectorDistance {
  static double calculateDistance(double x1, double y1, double x2, double y2) {
    double a = Math.pow(x2-x1,2);
    double b = Math.pow(y2-y1, 2);
    return Math.sqrt(a+b);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the coordinates of the first point in the form of 'x,y': ");
    String[] tmp = scanner.nextLine().split(",");
    double[] coord1 = {0,0};
    for (int i=0;i<tmp.length;i++) {
      coord1[i] = Double.parseDouble(tmp[i]);
    }
    System.out.print("Please enter the coordinates of the second point in the form of 'x,y': ");
    tmp = scanner.nextLine().split(",");
    double[] coord2 = {0,0};
    for (int i=0;i<tmp.length;i++) {
      coord2[i] = Double.parseDouble(tmp[i]);
    }
    double distance = calculateDistance(coord1[0],coord1[1],coord2[0],coord2[1]);
    System.out.printf("The distance between the two points is: %.2f", distance);
    scanner.close();
  }
}
