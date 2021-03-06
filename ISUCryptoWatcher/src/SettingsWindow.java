import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class SettingsWindow extends JFrame {
  static JFrame frame = new JFrame("Settings");
  static JScrollPane pane;
  static JPanel buttonPanel;
  public SettingsWindow() {
    frame.setSize(600,400);
    frame.setLayout(new BorderLayout());
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
          new WalletWindow(wallet);
        }
      }
      button.addActionListener(new buttonListener());
      buttonPanel.add(button,constraint);
    }

    pane.setViewportView(buttonPanel);
    frame.add(pane);

    GridBagConstraints addConstraint = new GridBagConstraints();
    addConstraint.anchor = GridBagConstraints.EAST;
    addConstraint.fill = GridBagConstraints.NONE;
    addConstraint.gridx = 0;
    addConstraint.gridy = GridBagConstraints.RELATIVE;
    addConstraint.weightx = 0.5f;
    addConstraint.weighty = 1.0f;
    
    JButton addButton = new JButton("Add Wallet");
    addButton.addActionListener(new AddActionListener());
    addButton.setSize(50,20);
    JPanel addPanel = new JPanel();
    addPanel.add(addButton);
    frame.add(addPanel,BorderLayout.EAST);

    frame.setVisible(true);
    frame.revalidate();
    frame.repaint();
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
          new WalletWindow(wallet);
        }
      }
      button.addActionListener(new buttonListener());
      buttonPanel.add(button,constraint);
    }
    pane.setViewportView(buttonPanel);
  }
    
  private class AddActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      new WalletWindow();
    }
  }
}
