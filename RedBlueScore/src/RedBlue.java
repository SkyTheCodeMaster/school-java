import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

public class RedBlue extends JFrame {
  int redScoreAmount = 0;
  int blueScoreAmount = 0;
  
  JPanel titlePanel,scorePanel,buttonPanel;
  JLabel redLabel,blueLabel,redScore,blueScore;
  JButton redButton,blueButton,resetButton;
  
  public RedBlue() {
    super("Score Keeper");
    Container totalGUI = getContentPane();
    totalGUI.setLayout(null);
    
    titlePanel = new JPanel();
    titlePanel.setLayout(null);
    titlePanel.setLocation(10,0);
    titlePanel.setSize(250,30);
    totalGUI.add(titlePanel);
    
    redLabel = new JLabel("Red Team");
    redLabel.setLocation(0,0);
    redLabel.setSize(100,30);
    redLabel.setHorizontalAlignment(0);
    redLabel.setForeground(Color.red);
    titlePanel.add(redLabel);
    
    blueLabel = new JLabel("Blue Team");
    blueLabel.setLocation(120,0);
    blueLabel.setSize(100,30);
    blueLabel.setHorizontalAlignment(0);
    blueLabel.setForeground(Color.blue);
    titlePanel.add(blueLabel);
    
    scorePanel = new JPanel();
    scorePanel.setLayout(null);
    scorePanel.setLocation(10,40);
    scorePanel.setSize(250,30);
    totalGUI.add(scorePanel);

    redScore = new JLabel(String.valueOf(redScoreAmount));
    redScore.setLocation(0,0);
    redScore.setSize(100,30);
    redScore.setHorizontalAlignment(0);
    scorePanel.add(redScore);
    
    blueScore = new JLabel(String.valueOf(blueScoreAmount));
    blueScore.setLocation(120,0);
    blueScore.setSize(100,30);
    blueScore.setHorizontalAlignment(0);
    scorePanel.add(blueScore);
    
    buttonPanel = new JPanel();
    buttonPanel.setLayout(null);
    buttonPanel.setLocation(10,80);
    buttonPanel.setSize(250,70);
    totalGUI.add(buttonPanel);
    
    redButton = new JButton("Red Score!");
    redButton.setLocation(0,0);
    redButton.setSize(100,30);
    redButton.addActionListener(new ScoreListener());
    buttonPanel.add(redButton);
    
    blueButton = new JButton("Blue Score!");
    blueButton.setLocation(120,0);
    blueButton.setSize(100,30);
    blueButton.addActionListener(new ScoreListener());
    buttonPanel.add(blueButton);
    
    resetButton = new JButton("Reset Score");
    resetButton.setLocation(0,40);
    resetButton.setSize(220,30);
    resetButton.addActionListener(new ScoreListener());
    buttonPanel.add(resetButton);
  }
  
  private class ScoreListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == redButton) {
        redScoreAmount++;
        redScore.setText(String.valueOf(redScoreAmount));
      } else if (e.getSource() == blueButton) {
        blueScoreAmount++;
        blueScore.setText(String.valueOf(blueScoreAmount));
      } else if (e.getSource() == resetButton) {
        redScoreAmount=0;
        redScore.setText(String.valueOf(redScoreAmount));
        blueScoreAmount=0;
        blueScore.setText(String.valueOf(blueScoreAmount));
      }
    }
  }
}
