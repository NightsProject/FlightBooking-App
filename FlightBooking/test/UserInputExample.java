/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author night
 */

    
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInputExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("User Input Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        // Create the input button
        JButton inputButton = new JButton("Enter Data");
        inputButton.setBounds(100, 70, 100, 30);
        frame.add(inputButton);

        // Action listener for the button
        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code runs when the button is pressed
                String inputData = JOptionPane.showInputDialog(frame, "Please enter some data:");
                if (inputData != null) {
                    // The user has entered some data and clicked OK
                    JOptionPane.showMessageDialog(frame, "You entered: " + inputData);
                    // You can put any additional code here to be executed after the input is received
                } else {
                    // The user clicked cancel
                    JOptionPane.showMessageDialog(frame, "Input canceled.");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

