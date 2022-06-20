import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class MainWindow extends JFrame{
  JButton settings;
  static JScrollPane pane;
  static JPanel buttonPanel;
  public MainWindow() throws IOException {
    super("Crypto Watcher");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(400,600);
    setLayout(new BorderLayout());
    setVisible(true);
    
    JPanel southFrame = new JPanel();
    southFrame.setLayout(new BorderLayout());
    add(southFrame,BorderLayout.SOUTH);
    
    buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridBagLayout());
    buttonPanel.setSize(300,400); // whatever

    // the scrollpane
    pane = new JScrollPane();
    pane.setSize(300,400);

    GridBagConstraints constraint = new GridBagConstraints();
    constraint.anchor = GridBagConstraints.WEST;
    constraint.fill = GridBagConstraints.NONE;
    constraint.gridx = 0;
    constraint.gridy = GridBagConstraints.RELATIVE;
    constraint.weightx = 1.0f;
    constraint.weighty = 1.0f;
    
    for (Wallet wallet : ISUMain.wallets.wallets) {
      JButton button = new JButton();
      button.setText(String.format("%s | %s",wallet.coin,wallet.pool));

      class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          new DisplayWindow(wallet);
        }
      }
      button.addActionListener(new buttonListener());
      buttonPanel.add(button,constraint);
    }

    pane.setViewportView(buttonPanel);
    add(pane,BorderLayout.WEST);

    Image img = ImageIO.read(getClass().getResource("assets/settings.png"));
    settings = new JButton(new ImageIcon(img));
    settings.setSize(32,32);
    settings.setVisible(true);
    System.out.println(getWidth());
    System.out.println(getHeight());
    settings.setLocation(getWidth()-64,getHeight()-96);
    System.out.println(settings.getLocation());
    settings.addActionListener(new SettingsListener());
    southFrame.add(settings,BorderLayout.EAST);

    revalidate();
    repaint();
  }
  
  public static void redrawList() {
    buttonPanel.removeAll();
    GridBagConstraints constraint = new GridBagConstraints();
    constraint.anchor = GridBagConstraints.WEST;
    constraint.fill = GridBagConstraints.NONE;
    constraint.gridx = 0;
    constraint.gridy = GridBagConstraints.RELATIVE;
    constraint.weightx = 1.0f;
    constraint.weighty = 1.0f;
    
    for (Wallet wallet : ISUMain.wallets.wallets) {
      JButton button = new JButton();
      button.setText(String.format("%s | %s",wallet.coin,wallet.pool));

      class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          new DisplayWindow(wallet)
        }
      }
      button.addActionListener(new buttonListener());
      buttonPanel.add(button,constraint);
    }
    pane.setViewportView(buttonPanel);
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
