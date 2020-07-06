package chapter9;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class Logon extends JFrame{

    private final String COMMAND_OK = "COMMAND_OK";
    private final String COMMAND_CLOSE = "COMMAND_CLOSE";

    private JTextField host;

    public Logon() throws ParseException {

        this.setTitle("Logon");

        String[] valueHelp = {"FTP", "Telnet", "SMTP", "HTTP"};
        JComboBox<String> myComboBox = new JComboBox<String>(valueHelp);

        //myComboBox.addItemListener(new ComboBoxListener(host));

        JFormattedTextField portField = new JFormattedTextField(new MaskFormatter("#####"));
        portField.setColumns(3);

        /*
        myComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    System.out.println("Neue Auswahl: " + e.getItem());
                    host.setText(e.getItem() + "://");
                    portField.setText("22");
                }
            }
        });
        */

        // Listener implementation as Lambda Function
        myComboBox.addItemListener(e -> {
            if(e.getStateChange() == ItemEvent.SELECTED){
                System.out.println("Neue Auswahl: " + e.getItem());
                host.setText(e.getItem() + "://");
                portField.setText("22");
            }
        });

        // initialize Panels
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());

        JPanel connectionPanel = new JPanel(new GridLayout(0, 2));
        JPanel filePanel = new JPanel(new GridLayout(0, 2));



        FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);

        //create & assign elements for connection area
        JPanel flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("User:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JTextField(3));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Passwort:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JPasswordField(5));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Art:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(myComboBox);
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Host:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        host = new JTextField(5);
        flowLayoutForCell.add(host);
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Port:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(portField);
        connectionPanel.add(flowLayoutForCell);

        // create & add Fields for File Area
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Quelle:"));
        filePanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JTextField(10));
        filePanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Ziel:"));
        filePanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JTextField(10));
        filePanel.add(flowLayoutForCell);

        // create & assign Buttons
        JButton okButton = new JButton("Okay");
        okButton.setActionCommand(COMMAND_OK);
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setActionCommand(COMMAND_CLOSE);

        /*
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Modifiers: " + e.getModifiers());
                System.out.println("When: " + e.getWhen());

                if(e.getActionCommand().equals(COMMAND_OK)){
                    System.out.println("Host: " + host.getText());
                }else if(e.getActionCommand().equals(COMMAND_CLOSE)){
                    System.exit(0);
                }
            }
        };
        */

        // Exmaple with Lambda Implementation
        ActionListener buttonListener = e -> {
            System.out.println("Modifiers: " + e.getModifiers());
            System.out.println("When: " + e.getWhen());

            if(e.getActionCommand().equals(COMMAND_OK)){
                System.out.println("Host: " + host.getText());
            }else if(e.getActionCommand().equals(COMMAND_CLOSE)){
                System.exit(0);
            }
        };

        okButton.addActionListener(buttonListener);
        cancelButton.addActionListener(buttonListener);

        MouseListener buttonMouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Clicked");
                printInfo(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Pressed");
                printInfo(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Released");
                printInfo(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entered");
                printInfo(e);
                ((JButton)e.getSource()).setEnabled(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Exited");
                printInfo(e);
                ((JButton)e.getSource()).setEnabled(true);
            }

            private void printInfo(MouseEvent e){
                System.out.println("X on Component: " + e.getX());
                System.out.println("Y on Component: " + e.getY());
                System.out.println("Mouse button: " + e.getButton());
            }
        };

        okButton.addMouseListener(buttonMouseListener);
        cancelButton.addMouseListener(buttonMouseListener);

        southPanel.add(okButton);
        southPanel.add(cancelButton);

        // create & assign Borders
        Border etchedBorder = BorderFactory.createEtchedBorder();
        Border connectionBorder = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
        Border fileBorder = BorderFactory.createTitledBorder(etchedBorder, "Datei");
        Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

        connectionPanel.setBorder(connectionBorder);
        filePanel.setBorder(fileBorder);
        centerPanel.setBorder(centerBorder);

        // combine Panels
        centerPanel.add(connectionPanel);
        centerPanel.add(filePanel);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        this.setContentPane(mainPanel);

        // set JFrame behavior
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) throws ParseException {
        new Logon();
    }

}