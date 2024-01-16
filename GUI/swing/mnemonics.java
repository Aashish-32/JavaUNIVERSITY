package GUI.swing;


import javax.swing.*;
import javax.swing.tree.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

 class MnemonicAcceleratorExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Mnemonic and Accelerator Example");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("File");
            
            // Create a JMenuItem with mnemonic and accelerator
            JMenuItem openItem = new JMenuItem("Open");
        //   fileMenu.setMnemonic(KeyEvent.VK_O);
        fileMenu.setMnemonic('O');
             
            openItem.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK));
            
            openItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Open action performed");
                   System.out.println( e.getActionCommand());
                }
            });                                                 

            // Adding the JMenuItem to the File menu
            fileMenu.add(openItem);

            // Adding the File menu to the menu bar
            menuBar.add(fileMenu);

            // Setting the menu bar for the frame
            frame.setJMenuBar(menuBar);
            frame.setVisible(true);
                DefaultMutableTreeNode nodesa= new DefaultMutableTreeNode("root");
                DefaultMutableTreeNode nodesaa= new DefaultMutableTreeNode("rost");

                nodesa.add(nodesaa);

                JTree tree=new JTree(nodesa);
                frame.add(tree);


            
        });
    }  
}     
   