package chapter9;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxListener implements ItemListener {

    private JTextField host;

    protected ComboBoxListener(JTextField host) {
        this.host = host;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("Neu ausgewählt: " + e.getItem());
            String currentHostValue = host.getText();

            host.setText(e.getItem() + "://" + currentHostValue);
        }
    }

}
