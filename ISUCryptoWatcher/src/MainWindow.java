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
public class MainWindow extends JFrame{
  public MainWindow() throws IOException {
    super("Window");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(1000,600);
    setLayout(new BorderLayout());
    setVisible(true);
    
    JPanel bottomPanel = new JPanel();
    bottomPanel.setLayout(new BorderLayout());
    bottomPanel.setVisible(true);
    JPanel settingsPanel = new JPanel();
    settingsPanel.setLayout(new BorderLayout());
    settingsPanel.setVisible(true);
    bottomPanel.add(settingsPanel,BorderLayout.EAST);
    
    Image img = ImageIO.read(getClass().getResource("assets/settings.png"));
    JButton settings = new JButton(new ImageIcon(img));
    settings.setSize(32,32);
    settings.setVisible(true);
    settings.addActionListener(new SettingsListener());
    settingsPanel.add(settings);
    
    add(bottomPanel,BorderLayout.PAGE_END);
    revalidate();
    repaint();
  }
  
  private class SettingsListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      System.out.println(e);
    }
  }
}
