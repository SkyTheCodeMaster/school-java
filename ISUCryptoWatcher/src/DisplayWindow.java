import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;

// simple config window for wallets, has new method that will return a Wallet, with an optional Wallet input for presets.
public class DisplayWindow extends JFrame {
  JLabel title = new JLabel("Enter your wallet details:");
  JButton confirm = new JButton("Confirm");
  JLabel webLabel = new JLabel("Web Dashboard URL:");
  JTextField webURL = new JTextField();
  JLabel coinLabel = new JLabel("Currency:");
  JTextField coin = new JTextField();
  JLabel poolLabel = new JLabel("Pool:");
  JTextField pool = new JTextField();
  public WalletWindow() {
    setLayout(new FlowLayout());
    setSize(300,400);
    setVisible(true);
    add(title);
    add(webLabel);
    add(webURL);
    add(confirm);
  }
}
