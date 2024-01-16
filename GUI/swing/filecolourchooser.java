package GUI.swing;

import javax.swing.*;
import java.awt.event.*;


public class filecolourchooser implements ActionListener{

    public void actionPerformed(ActionEvent e){
        System.out.println("hello");
    }
 public static void main(String[] args) {
    JFileChooser file=new JFileChooser();
    JFrame frame=new JFrame("title");
    JColorChooser colour =new JColorChooser();
    JInternalFrame jf=new JInternalFrame("int frame", true, true, true, true);
    frame.add(colour);
        frame.setVisible(true);
        frame.setSize(300,300);
        JButton btn= new JButton("action");
        btn.addActionListener(new filecolourchooser());

       
       // frame.add(file);
 }   
}
