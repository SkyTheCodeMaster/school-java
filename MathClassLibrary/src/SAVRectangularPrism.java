import java.util.Scanner;

public class SAVRectangularPrism {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input the width of the rectangular prism: ");
    double width = Double.parseDouble(scanner.nextLine());
    System.out.print("Please input the length of the rectangular prism: ");
    double length = Double.parseDouble(scanner.nextLine());
    System.out.print("Please input the height of the rectangular prism:" );
    double height = Double.parseDouble(scanner.nextLine());
    double volume = width*length*height;
    double sa = (width*length*2) + (width*height*2) + (length*height*2);
    System.out.printf("The surface area is: %.2f\nThe volume is: %.2f", sa,volume);
    scanner.close();
  }
}
