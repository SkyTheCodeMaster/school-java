import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AverageGUI extends JFrame implements ActionListener {
  JLabel firstLabel,secondLabel,thirdLabel,averageLabel,resultLabel;
  JTextField first,second,third;
  JButton average;
  public AverageGUI() {
    super("Average Calculator");
    setLayout(new FlowLayout());
    firstLabel = new JLabel("First Grade: ");
    first = new JTextField(null,6);
    secondLabel = new JLabel("Second Grade: ");
    second = new JTextField(null,6);
    thirdLabel = new JLabel("Third Grade: ");
    third = new JTextField(null,6);
    
    averageLabel = new JLabel("Average: ");
    resultLabel = new JLabel("   ");
    average = new JButton("Click here");
    average.addActionListener(this);
    
    add(firstLabel);
    add(first);
    add(secondLabel);
    add(second);
    add(thirdLabel);
    add(third);
    add(averageLabel);
    add(resultLabel);
    add(average);
  }
  
  public void actionPerformed(ActionEvent event) {
    int grade1 = Integer.parseInt(first.getText());
    int grade2 = Integer.parseInt(second.getText());
    int grade3 = Integer.parseInt(third.getText());
    
    double totalGrade = (grade1+grade2+grade3)/3;
    resultLabel.setText(String.format("%.2f",totalGrade));
  }
}