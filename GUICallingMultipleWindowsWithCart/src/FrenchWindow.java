import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrenchWindow extends JFrame implements ActionListener {
  JLabel frenchLabel;
  JButton done;
  public static JTextField frenchTextField;
  
  public FrenchWindow() {
    super("Bonjour et Bienvenue!!!");
    frenchLabel = new JLabel("Entrez une numero s'il vous plait: ");
    frenchTextField = new JTextField("0",6);
    done = new JButton("Done");
    done.addActionListener(this);
    
    add(frenchLabel);
    add(frenchTextField);
    add(done);
  }
  
  public void actionPerformed(ActionEvent e) {
    double frenchValue = Double.parseDouble(frenchTextField.getText());
    CartWindow.grandTotal += frenchValue;
    setVisible(false);
  }
}
