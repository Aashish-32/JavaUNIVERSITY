package GUI.swing;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class trees {
    public static void main(String[] args) {
       

        DefaultMutableTreeNode  a = new DefaultMutableTreeNode("a");
        DefaultMutableTreeNode  b = new DefaultMutableTreeNode("b");
        DefaultMutableTreeNode  c = new DefaultMutableTreeNode("c");
        DefaultMutableTreeNode  d = new DefaultMutableTreeNode("d");
        a.add(b);
        a.add(c);
        c.add(d);
       

        JTree trees=new JTree(a);
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(300,300);
frame.add(trees);
    
    }


    
}
