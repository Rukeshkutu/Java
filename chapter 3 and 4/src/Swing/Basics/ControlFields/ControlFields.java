package Swing.Basics.ControlFields;

import javax.swing.*;

public class ControlFields {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

//        adding label
        JLabel jLabel = new JLabel("Label 1");
        jLabel.setBounds(50, 12, 500, 100);

//        add text field
        JTextField jTextField = new JTextField();
        jTextField.setBounds(100, 50, 100, 40);
        jFrame.add(jTextField);

//        jTextField.setEditable(false); text cannot be edited

//        Password Field
        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(200, 50, 100, 40);
        jFrame.add(jPasswordField);

//        Checkbox Field
        JCheckBox jCheckBox = new JCheckBox("Checkbox1");
        JCheckBox jCheckBox1 = new JCheckBox("Checkbox2");
        jCheckBox.setBounds(300, 50, 100, 40);
        jCheckBox1.setBounds(300, 80, 100, 40);
        jFrame.add(jCheckBox);
        jFrame.add(jCheckBox1);

//        Radio Button
        JRadioButton jRadioButton = new JRadioButton("Radio Button");
        jRadioButton.setBounds(400, 30, 200, 40);
        jFrame.add(jRadioButton);
        JRadioButton jRadioButton1 = new JRadioButton("radio button1");
        jRadioButton1.setBounds(400, 80, 200,40);
        jFrame.add(jRadioButton1);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton1);

        //adding j combo box
        Integer jComboValues [] = {1, 2, 3};
        JComboBox jComboBox = new JComboBox(jComboValues);
        jComboBox.setBounds(20, 40, 100, 100);
        jFrame.add(jComboBox);

        jFrame.add(jLabel);
        jFrame.setSize(800, 800);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
