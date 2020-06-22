package chapter9;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    private BorderLayoutExample(){
        super("BorderLayout example");

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton westButton = new JButton("West");
        JButton eastButton = new JButton("East");
        JButton centerButton = new JButton("Center");
        JButton newButton = new JButton("New Button!");

        centerPanel.add(centerButton);
        centerPanel.add(newButton);

        mainPanel.add(northButton, BorderLayout.NORTH);
        mainPanel.add(southButton, BorderLayout.SOUTH);
        mainPanel.add(westButton, BorderLayout.WEST);
        mainPanel.add(eastButton, BorderLayout.EAST);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        this.add(mainPanel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
