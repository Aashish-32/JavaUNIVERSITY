package GUI.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SUMOFNUM extends JFrame implements ActionListener {
    static JButton btn;
    static JTextField field1 =  new JTextField(10);
static JTextField field2= new JTextField(10);
static JTextField result= new JTextField("Result",19);
    public static void main(String[] args) {
        
        JFrame frame=new JFrame("sum of two numbers");
    frame.setVisible(true);
    frame.setSize(500,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel= new JPanel();
    panel.setLayout(new FlowLayout(FlowLayout.CENTER));

    JLabel firstnum= new JLabel("Enter first number");

    btn= new JButton("SUM");

JLabel second= new JLabel("ENTER SECOND");




btn.addActionListener(new SUMOFNUM());

frame.add(panel);
panel.add(firstnum);
panel.add(field1);
panel.add(second);
panel.add(field2);
panel.add(btn);
panel.add(result);
    }
    @Override
public void actionPerformed(ActionEvent e){
    if (e.getSource()==btn){
        int num1=Integer.parseInt( field1.getText() );
        int num2=Integer.parseInt( field2.getText() );
        int sum=num1+num2;
        // result.setText(String.valueOf(sum) );
        result.setText("The result is: "+sum);


       
        
    }


}
}
