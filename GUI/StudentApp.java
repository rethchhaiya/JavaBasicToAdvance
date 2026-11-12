package GUI;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //set title
        frame.setTitle("Student form");
        
        //size of gui
        frame.setSize(300, 250);
        
        //set to center
        frame.setLocationRelativeTo(null);
        
        //terminate the terminal
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //create label
        JLabel labelName = new JLabel("Name");
        //                  x   y   w   h 
        labelName.setBounds(10, 10, 50, 20);
        frame.add(labelName);

        JTextField txtName = new JTextField();
        txtName.setBounds(70, 10, 100, 20);
        frame.add(txtName);

        JLabel labelGender = new JLabel("Gender");
        labelGender.setBounds(10, 30, 50, 20);
        frame.add(labelGender);
        
        JTextField txtGender = new JTextField();
        txtGender.setBounds(70, 30, 100, 20);
        frame.add(txtGender);

        JLabel labelAge = new JLabel("Age");
        labelAge.setBounds(10, 50, 50, 20);
        frame.add(labelAge);

        JTextField txtAge = new JTextField();
        txtAge.setBounds(70, 50, 100, 20);
        frame.add(txtAge);


        JLabel labelGrade = new JLabel("Grade");
        labelGrade.setBounds(10, 70, 100, 20);
        frame.add(labelGrade);

        // JTextField txtGrade = new JTextField();
        // txtGrade.setBounds(70, 70, 100, 20);
        // frame.add(txtGrade);

        //section value 
        Integer[] grade = new Integer[]{1, 2, 3, 4, 5, 6};
        JComboBox<Integer> cbxGrade = new JComboBox<>(grade);

        cbxGrade.setBounds(70, 70, 100, 20);
        frame.add(cbxGrade);

        JButton saveBtn = new JButton("Save");
        saveBtn.setBounds(10, 100, 80, 20);
        frame.add(saveBtn);

        //save button to perform show
        saveBtn.addActionListener(e -> {
            //show in terminal
            System.out.println(txtName.getText());
            System.out.println(txtGender.getText());
            System.out.println(txtAge.getText());
            System.out.println(cbxGrade.getSelectedItem());
        });

        //show gui
        frame.setVisible(true);
    }
}
