package GUI.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class CardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.add(new JLabel("This is Panel 1"));
        panel2.add(new JLabel("This is Panel 2"));

        cardPanel.add(panel1, "Panel 1");
        cardPanel.add(panel2, "Panel 2");

        JButton nextButton = new JButton("Next Panel");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        frame.getContentPane().add(BorderLayout.CENTER, cardPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, nextButton);

        frame.setVisible(true);
    }
}
// 
