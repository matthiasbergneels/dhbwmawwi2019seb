package chapter9;

import org.junit.jupiter.engine.descriptor.JupiterTestDescriptor;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class GridLayoutExample extends JFrame {

    private GridLayoutExample(){
        super("GridLayout example");

        JPanel mainPanel = new JPanel(new GridLayout(0,2));

        JLabel salutationLabel = new JLabel("Anrede:");
        JComboBox<String> salutationComboBox = new JComboBox<String>();
        salutationComboBox.addItem("Herr");
        salutationComboBox.addItem("Frau");
        salutationComboBox.addItem("Divers");

        JLabel familyNameLabel = new JLabel("Familienname:");
        JTextField familyNameTextField = new JTextField(15);
        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameTextField = new JTextField(15);
        JButton saveButton = new JButton("Sichern");
        JButton cancelButton = new JButton("Abbrechen");

        mainPanel.add(generateFlowLayoutPanelWithComponent(salutationLabel));
        mainPanel.add(generateFlowLayoutPanelWithComponent(salutationComboBox));
        mainPanel.add(generateFlowLayoutPanelWithComponent(familyNameLabel));
        mainPanel.add(generateFlowLayoutPanelWithComponent(familyNameTextField));
        mainPanel.add(generateFlowLayoutPanelWithComponent(nameLabel));
        mainPanel.add(generateFlowLayoutPanelWithComponent(nameTextField));
        mainPanel.add(generateFlowLayoutPanelWithComponent(saveButton));
        mainPanel.add(generateFlowLayoutPanelWithComponent(cancelButton));

        this.add(mainPanel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    private JPanel generateFlowLayoutPanelWithComponent(JComponent component){
        JPanel cellPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cellPanel.add(component);
        return cellPanel;
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
