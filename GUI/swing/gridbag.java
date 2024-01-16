package GUI.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.GridBagConstraints;

class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Set the layout manager to GridBagLayout
        frame.setLayout(new GridBagLayout());

        // Create GridBagConstraints for each button
        GridBagConstraints gbc = new GridBagConstraints();

        // Add Button 1
        gbc.gridx = 0;  // Column 0
        gbc.gridy = 0;  // Row 0
        frame.add(button1, gbc);

        // Add Button 2
        gbc.gridx = 1;  // Column 1
        gbc.gridy = 0;  // Row 0
        frame.add(button2, gbc);

        // Add Button 3
        gbc.gridx = 0;  // Column 0
        gbc.gridy = 1;  // Row 1
        gbc.gridwidth = 3;  // Span 2 columns
        gbc.fill=GridBagConstraints.HORIZONTAL;
        frame.add(button3, gbc);

        frame.setVisible(true);
    }
}
 
