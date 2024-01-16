package GUI.swing;

import javax.swing.*;

 class GroupLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayout Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
         JButton button4 = new JButton("Button 4");

             layout.setHorizontalGroup(layout.createSequentialGroup()
      .addComponent(button1).addComponent(button2)
      .addGroup(layout.createParallelGroup()
      .addComponent(button4).addComponent(button3)
      )
      );

      layout.setVerticalGroup(layout.createParallelGroup()

            .addComponent(button1) .addComponent(button2)
             .addGroup(layout.createSequentialGroup()
            .addComponent(button3).addComponent(button4)
              )) ;

        frame.add(panel);
        frame.setVisible(true);
    }
}
