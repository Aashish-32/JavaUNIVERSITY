package GUI.swing;

import java.awt.List;

import javax.swing.*;

 class ListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");

        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4"};

        JList list = new JList(new String[]{"as,","aa"});
        frame.add(new JScrollPane(list));

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        int[] a={1,2,3};
    }
}
