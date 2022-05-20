import javax.swing.JOptionPane;

public class OddEven {
  public static void main(String[] args) {
    int repeat = 0;
    while (repeat == JOptionPane.YES_OPTION) {
      int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
      if (num%2==0) {
        JOptionPane.showMessageDialog(null, "The number is even.");
      } else {
        JOptionPane.showMessageDialog(null, "The number is odd.");
      }
      repeat = JOptionPane.showConfirmDialog(null,"Do another?");
    }
  }
}
