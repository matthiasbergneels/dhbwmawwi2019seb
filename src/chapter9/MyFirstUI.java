package chapter9;

import javax.swing.*;
import java.awt.*;

public class MyFirstUI {

    public static void main(String[] args) {

        JFrame myFirstUI = new JFrame("My first UI");

        myFirstUI.setLayout(new FlowLayout(FlowLayout.RIGHT));

        myFirstUI.add(new JLabel("Hello World!"));
        myFirstUI.add(new JButton("Ok"));

        myFirstUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFirstUI.setVisible(true);
        myFirstUI.pack();
    }
}
