import javax.swing.JOptionPane;

public class SumAndDifference {
  public static void main(String[] args) {
    int first = Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
    int second = Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));
    
    int sum = first+second;
    int diff = Math.abs(first-second);
    
    JOptionPane.showMessageDialog(null, String.format("The sum of the two numbers is %d.",sum),"The Sum",JOptionPane.CANCEL_OPTION);
    JOptionPane.showMessageDialog(null, String.format("The difference of the two numbers is %d.",diff),"The Difference",JOptionPane.PLAIN_MESSAGE);
  }
}
