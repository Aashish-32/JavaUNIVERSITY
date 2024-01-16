package GUI.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

 class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        // Set the layout manager to GridLayout with 2 rows, 3 columns, and 10-pixel gaps
        GridLayout gridLayout = new GridLayout(2, 3);
        frame.setLayout(gridLayout);

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        frame.setVisible(true);
    }
}

