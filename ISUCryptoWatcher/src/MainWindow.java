import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class MainWindow extends JFrame{
  JButton settings;
  public MainWindow() throws IOException {
    super("Crypto Watcher");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(400,600);
    setLayout(null);
    setVisible(true);

    Image img = ImageIO.read(getClass().getResource("assets/settings.png"));
    settings = new JButton(new ImageIcon(img));
    settings.setSize(32,32);
    settings.setVisible(true);
    System.out.println(getWidth());
    System.out.println(getHeight());
    settings.setLocation(getWidth()-64,getHeight()-96);
    System.out.println(settings.getLocation());
    settings.addActionListener(new SettingsListener());
    add(settings);

    revalidate();
    repaint();
  }
  
  private class SettingsListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == settings) {
        System.out.println("A");
        new SettingsWindow();
        System.out.println("A");
      }
    }
  }
}
