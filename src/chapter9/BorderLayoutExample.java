package chapter9;

import javax.swing.*;

public class BorderLayoutExample extends JFrame {

    private BorderLayoutExample(){
        super("BorderLayout example");

        


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
