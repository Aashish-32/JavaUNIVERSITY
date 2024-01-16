package GUI.swing;

import java.awt.FlowLayout;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        JFrame frame= new JFrame("frame 1");
        frame.setVisible(true);
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JMenuBar menubar = new JMenuBar();
        JMenu  filemenu = new JMenu("file");
        JMenu view= new JMenu("view");


        JMenuItem open= new JMenuItem("open");
        JMenuItem save= new JMenuItem("save");
        JMenuItem pdf= new JMenuItem("pdf");
    JMenuItem png= new JMenuItem("png");

        JMenuItem docs= new JMenuItem("docs");

        JMenu saveas= new JMenu("saveas");

        filemenu.add(open);
        filemenu.add(save);
        filemenu.add(view);

        view.add(docs);
        view.add(pdf);
        saveas.add(png);
        save.setEnabled(false);

        menubar.add(filemenu);
        menubar.add(saveas);
        ImageIcon icon= new ImageIcon("dd");
        JMenuItem picitem= new JMenuItem("pictures", icon);

        

        frame.setLayout(new FlowLayout());
        frame.add(menubar);








    }
    
}
