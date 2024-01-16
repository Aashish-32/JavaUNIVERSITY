package GUI.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class book extends JFrame  {
    
    JTextField field1 =  new JTextField(10);

book(){
    setVisible(true);
    setSize(500,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel= new JPanel();
    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    JButton btn= new JButton("SUM");
    JTextField field2=new JTextField();

    btn.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
        if (e.getSource()==btn){
            int num1=Integer.parseInt( field1.getText() );
        
            
        }
    
        }
    });
    
    add(panel);

panel.add(field1);
panel.add(field2);
panel.add(btn);


}




    public static void main(String[] args) {
        
       new book();
    }

}
