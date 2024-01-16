package GUI.swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

 class JTableExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Data for the table
        Object[][] data = {
                {"John", 25, "New York"},
                {"Alice", 30, "London"},
                {"Bob", 22, "Paris"}
        };

        
        Object[] columnNames = {"Name", "Age", "City"};

        // Create a default table model
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create a JTable using the model
        JTable table = new JTable(data,columnNames);

        // Add the table to a JScrollPane for scrollability
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the scroll pane to the frame
        frame.getContentPane().add(scrollPane);

        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null); // Center on screen
        frame.setVisible(true);
    }
}
