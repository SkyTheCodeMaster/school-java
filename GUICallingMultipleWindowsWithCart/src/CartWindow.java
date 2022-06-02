import javax.swing.JOptionPane;
public class CartWindow {
  public static double grandTotal = 0;
  public CartWindow() {
    JOptionPane.showMessageDialog(null,String.format("The grand total is %.2f",grandTotal));
    int again = JOptionPane.showConfirmDialog(null, "Continue shopping?","Calling Windows Example",JOptionPane.YES_NO_OPTION);
    
    if (again != JOptionPane.YES_OPTION) {
      JOptionPane.showMessageDialog(null, "Thank you for shopping with us","Calling Windows Example",JOptionPane.PLAIN_MESSAGE);
      System.exit(69);
    }
  }
}
