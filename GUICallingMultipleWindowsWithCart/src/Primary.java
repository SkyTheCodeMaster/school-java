import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Primary extends JFrame implements ActionListener {
  private JLabel french,english;
  private JButton frenchButton,englishButton,cartButton;
  double total=0;
  public Primary() {
    super("Select a language");
    french = new JLabel("French");
    english = new JLabel("English");
    frenchButton = new JButton("Ici");
    frenchButton.addActionListener(this);
    englishButton = new JButton("Here");
    englishButton.addActionListener(this);
    cartButton = new JButton("Go to card");
    
    add(french);
    add(frenchButton);
    add(english);
    add(englishButton);
    add(cartButton);
  }
  
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == frenchButton) {
      FrenchWindow fWin = new FrenchWindow();
      fWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fWin.setSize(500,300);
      fWin.setLocation(400,300);
      fWin.setVisible(true);
    } else if (e.getSource == englishButton) {
      new EnglishWindow();
    } else if (e.getSource() == cartButton) {
      new CartWindow();
    }
  }
}