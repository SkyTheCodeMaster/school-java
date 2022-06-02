import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class EnglishWindow {
  JFrame frame;
  JLabel englishLabel;
  JButton done;
  public static JTextField englishTextField;
  public EnglishWindow() {
    frame = new JFrame("Hello");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(500,300);
    frame.setLocation(1000,300);
    frame.setLayout(new FlowLayout());
    
    englishLabel = new JLabel("Please enter a number");
    englishTextField = new JTextField(null,6);
    done = new JButton("Done");
    done.addActionListener(new DoneListener());
    frame.add(englishLabel);
    frame.add(englishTextField);
    frame.add(done);
    frame.setVisible(true);
  }
  
  private class DoneListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double value = Double.parseDouble(englishTextField.getText());
      CartWindow.grandTotal += value;
      frame.setVisible(false);
    }
  }
}
