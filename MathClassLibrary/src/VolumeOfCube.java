import java.util.Scanner;
public class VolumeOfCube {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the side length of the cube: ");
    double length = Double.parseDouble(scanner.nextLine());
    scanner.close();
    double volume = Math.pow(length, 3);
    System.out.printf("The volume of the cube is: %.2f", volume);
  }
}
