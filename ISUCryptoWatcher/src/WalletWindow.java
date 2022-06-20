import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// simple config window for wallets, has new method that will return a Wallet, with an optional Wallet input for presets.
public class WalletWindow extends JFrame {
  JLabel title = new JLabel("Enter your wallet details:");
  JButton confirm = new JButton("Confirm");
  JLabel webLabel = new JLabel("Web Dashboard URL:");
  JTextField webURL = new JTextField("",15);
  JLabel walletLabel = new JLabel("Wallet Address:");
  JTextField walletAddress = new JTextField("",15);
  JLabel coinLabel = new JLabel("Currency:");
  JTextField coin = new JTextField("",15);
  JLabel poolLabel = new JLabel("Pool:");
  JTextField pool = new JTextField("",15);
  JButton delete = new JButton("Delete");
  private Wallet wallet;
  public WalletWindow() {
    delete.addActionListener(new DeleteListener());
    confirm.addActionListener(new ConfirmListener());
    setLayout(new FlowLayout());
    setSize(200,280);
    setVisible(true);
    add(title);
    add(webLabel);
    add(webURL);
    System.out.println("AAAAA");
    add(walletLabel);
    add(walletAddress);
    add(coinLabel);
    add(coin);
    add(poolLabel);
    add(pool);
    add(confirm);
    add(delete);
  }

  public WalletWindow(Wallet wallet) {
    delete.addActionListener(new DeleteListener());
    confirm.addActionListener(new ConfirmListener());
    this.wallet = wallet;
    setLayout(new FlowLayout());
    setSize(200,280);
    setVisible(true);
    webURL.setText(this.wallet.url);
    walletAddress.setText(this.wallet.wallet);
    coin.setText(this.wallet.coin);
    pool.setText(this.wallet.pool);
    add(title);
    add(webLabel);
    add(webURL);
    add(walletLabel);
    add(walletAddress);
    add(coinLabel);
    add(coin);
    add(poolLabel);
    add(pool);
    add(confirm);
    add(delete);
  }
  
  private class DeleteListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this wallet?", "Delete Wallet", JOptionPane.YES_NO_OPTION);
      if (reply == JOptionPane.YES_OPTION) {
        ISUMain.wallets.removeWallet(wallet);
        SettingsWindow.redrawList();
        MainWindow.redrawList();
        setVisible(false);
        dispose();
      }
    }
  }
  
  private class ConfirmListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      Wallet oldWallet = wallet;
      String walletAdd = walletAddress.getText();
      String poolInp = pool.getText().toLowerCase();
      String webAdd = webURL.getText().toLowerCase();
      String coinType = coin.getText().toLowerCase();
      Wallet newWallet = new Wallet(walletAdd,coinType,poolInp,webAdd,"");
      ISUMain.wallets.removeWallet(oldWallet);
      ISUMain.wallets.addWallet(newWallet);
      SettingsWindow.redrawList();
      setVisible(false);
      dispose();
    }
  }
}
