package chapter9;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {

    private FlowLayoutExample(){
        super("FlowLayout Example");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel greetingsLabel = new JLabel("Herzlich willkommen - wie ist ihr Name?");
        JTextField nameTextField = new JTextField(20);
        JButton confirmButton = new JButton("Bestätigen");

        mainPanel.add(greetingsLabel);
        mainPanel.add(nameTextField);
        mainPanel.add(confirmButton);

        this.add(mainPanel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }

}
