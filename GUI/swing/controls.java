package GUI.swing;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;



 class TitledBorderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TitledBorder Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JButton button = new JButton("Click me");
        LineBorder bd= new LineBorder(Color.blue);
            JPanel pane= new JPanel();
            
        
        TitledBorder tb= new TitledBorder( "title");
        MatteBorder mb = new MatteBorder(2,2,2,2,Color.black);
        tb.setTitleColor(Color.red);
        CompoundBorder cb= new CompoundBorder(tb, mb);

CompoundBorder cbs= new CompoundBorder(BorderFactory.createLineBorder(Color.BLUE), 
    BorderFactory.createBevelBorder(1));


        pane.setBorder(tb);
        // frame.add(button);
        frame.setVisible(true);
        frame.add(pane);
    }
}
