package chapter9;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

    private GridLayoutExample(){
        super("GridLayout example");

        JPanel mainPanel = new JPanel(new GridLayout());

        JButton firstButton = new JButton("First");
        JButton secondButton = new JButton("Second");
        JButton thirdButton = new JButton("Third");
        JButton fourthButton = new JButton("fourth");
        JButton fifthButton = new JButton("fifth");

        mainPanel.add(firstButton);
        mainPanel.add(secondButton);
        mainPanel.add(thirdButton);
        mainPanel.add(fourthButton);
        mainPanel.add(fifthButton);



        this.add(mainPanel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
