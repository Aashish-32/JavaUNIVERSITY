package GUI.swing;

import javax.swing.*;
import java.awt.*;

class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
            FlowLayout flow= new FlowLayout(FlowLayout.LEFT, 10 , 20);
        panel.setLayout(flow);

        
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
