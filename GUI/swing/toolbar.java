package GUI.swing;

import javax.swing.*;

 class ToolbarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Toolbar Example");

        // Create a toolbar
        JToolBar toolBar = new JToolBar();
        
        // Create buttons and add them to the toolbar
        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");
        
        toolBar.add(newButton);
        toolBar.add(openButton);
        toolBar.add(saveButton);

        // Add the toolbar to the frame
        frame.add(toolBar);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
