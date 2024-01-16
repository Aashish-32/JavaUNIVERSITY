package chapter1;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;


public class cardlayout {
    public static void main(String[] args) {
        JFrame frame= new JFrame("card eg");
       
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel= new JPanel();

        frame.add(panel);

        JPanel panel1= new JPanel();
        JPanel panel2= new JPanel();
        panel.add(panel1);
        panel.add(panel2);
        
        panel1.add(new JLabel("this is panel 1"));
        panel2.add(new JLabel("this is panel 2"));

        CardLayout layout= new CardLayout();
        panel.setLayout(layout);

        JButton nextbutton = new JButton("click to change Panels");

        nextbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
{
                layout.next(panel);

}        });
frame.add(nextbutton,  BorderLayout.WEST);
frame.setVisible(true);






    }
    
}
