package GUI.swing;

import javax.swing.JOptionPane;

public class confirmdialog {
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Thisisamessagebox");
       JOptionPane.showOptionDialog(null, "Confrimordeny", 
       "confirmtionbox",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,null,null);
        JOptionPane.showConfirmDialog(null, "Confrimordeny", "confirmtionbox",JOptionPane.YES_NO_OPTION);
    }
}
