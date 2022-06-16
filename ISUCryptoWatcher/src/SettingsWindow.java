import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
public class SettingsWindow extends JFrame {
  public SettingsWindow() {
    super("Settings");
    System.out.println("A");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(600,400);
    setLayout(null);
    setVisible(true);
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setLocation(0,0);
    scrollPane.setSize(300,400);
    add(scrollPane);
    revalidate();
    repaint();
  }
  
  public void debug() {
    System.out.println("settings-debug");
    System.out.println("A");
  }
}
