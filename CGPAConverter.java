package Swingprograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CGPAConverter extends JFrame {

    private JTextField cgpaField;
    private JLabel resultLabel;

    public CGPAConverter() {
        
        setTitle("CGPA to Percentage Converter");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        
        JLabel cgpaLabel = new JLabel("Enter CGPA:");
        cgpaField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        resultLabel = new JLabel("Percentage: ");

      
        convertButton.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                convertCGPA();
            }
        });

        
        add(cgpaLabel);
        add(cgpaField);
        add(convertButton);
        add(resultLabel);
    }

    private void convertCGPA() {
        try {
            double cgpa = Double.parseDouble(cgpaField.getText());
            double percentage = (cgpa - 0.75) * 10; 
            resultLabel.setText(String.format("Percentage: %.2f%%", percentage));
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input! Please enter a valid CGPA.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CGPAConverter converter = new CGPAConverter();
            converter.setVisible(true);
        });
    }
}

