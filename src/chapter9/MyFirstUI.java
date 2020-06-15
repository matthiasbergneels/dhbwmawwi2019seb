package chapter9;

import javax.swing.*;

public class MyFirstUI {

    public static void main(String[] args) {

        JFrame myFirstUI = new JFrame("My first UI");

        myFirstUI.add(new JLabel("Hello World!"));

        myFirstUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFirstUI.setVisible(true);
        myFirstUI.pack();


    }
}
