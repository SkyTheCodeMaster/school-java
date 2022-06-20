import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

// Displays wallet info.
public class DisplayWindow extends JFrame {
  Wallet wallet;
  JLabel balanceLabel,priceCADLabel,hashrateLabel,unpaidLabel;
  double balance=0,priceCAD=0,unpaid=0;
  public DisplayWindow(Wallet wallet) {
    this.wallet = wallet;
    setLayout(new FlowLayout());
    setSize(300,400);
    
    balanceLabel = new JLabel("");
    priceCADLabel = new JLabel("");
    hashrateLabel = new JLabel("");
    add(new JLabel(String.format("%s - %s",wallet.wallet,wallet.coin)));
    add(balanceLabel);
    add(priceCADLabel);
    add(hashrateLabel);
    
    update();

    setVisible(true);
    revalidate();
    repaint();
  }
  
  public void update() {
    APIResponse resp = this.wallet.get();
    hashrateLabel.setText(resp.hashrate);
    balanceLabel.setText(String.format("Balance: %.8f%s",resp.paid,wallet.coin));
    priceCADLabel.setText(String.format("C$%.2f (C$%.2f)",resp.price.get("cad")*resp.paid,resp.price.get("cad")));
    
  }
}
