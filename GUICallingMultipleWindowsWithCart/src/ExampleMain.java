import java.awt.FlowLayout;
import javax.swing.JFrame;
public class ExampleMain {
  public static void main(String[] args) {
    Primary bottle = new Primary();
    bottle.setLayout(new FlowLayout());
    bottle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    bottle.setSize(300,180);
    bottle.setVisible(true);
  }
}