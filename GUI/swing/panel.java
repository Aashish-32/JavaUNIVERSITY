package GUI.swing;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;;

public class panel  {

    panel(){

        JFrame frame = new JFrame();
        frame.setVisible(true);
frame.setSize(500,500);
frame.setTitle("my last gui");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel lbl= new JLabel("hello");
lbl.setBounds(100,100, 100,300);
frame.add(lbl);



JPanel panel = new JPanel(); 
panel.setBackground(Color.PINK);
panel.setLayout(new CardLayout());


frame.add(panel);
JTextField jt= new JTextField(20);
jt.setBounds(222,100, 100, 40);
frame.add(jt);



    }

    public static void main(String[] args) {
        new panel();
    }
}
