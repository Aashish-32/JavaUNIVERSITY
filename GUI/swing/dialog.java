package GUI.swing;

import javax.swing.*;
 class SimpleOptionDialogExample {
    public static void main(String[] args) {
      
       int result= JOptionPane.showConfirmDialog(
                null,
                "Do you want to proceed?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION);

        
        if (result == JOptionPane.YES_OPTION) {
            System.out.println("User clicked Yes");
        } else if (result == JOptionPane.NO_OPTION) {
            System.out.println("User clicked No");
        } else if (result == JOptionPane.CLOSED_OPTION) {
            System.out.println("User closed the dialog");
        }
    }
}

