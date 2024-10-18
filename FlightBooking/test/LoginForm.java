/**
* @file 						DriverProgram(.java)
* @description 					Provide a description of the program/interface/class
* @course CCC102 				Summer Class
* @lab 							Activity 11.1
* @date 						07/11/2024
* @author 						MAGHUYOP, Bobeth
*/


import java.awt.event.*;
import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener{
	JLabel idLabel;
	JLabel pwLabel;
	JTextField idTextField;
	JTextField pwTextField;
	JButton loginButton;
	JButton cancelButton;
	
	public LoginForm(){
		
		super("Login");
		setLayout(null);
		setSize(300,250);
		idLabel = new JLabel("ID Number");
		pwLabel = new JLabel("Password");
		idTextField = new JTextField();
		pwTextField = new JTextField();
		loginButton = new JButton("Login");
		cancelButton = new JButton("Cancel");
		
		idLabel.setBounds(50, 20, 100, 20);
		idTextField.setBounds(50, 40, 185, 25);
		pwLabel.setBounds(50, 75, 100, 20);
		pwTextField.setBounds(50, 95, 185, 25);
		loginButton.setBounds(50, 140, 75, 25);
		cancelButton.setBounds(160, 140, 75, 25);
		
		add(idLabel);
		add(idTextField);
		add(pwLabel);
		add(pwTextField);
		add(loginButton);
		add(cancelButton);
		loginButton.addActionListener(this);
		cancelButton.addActionListener(this);
		
		this.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					dispose();
					System.exit(1);
				}
			}
		);
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == loginButton){
			
			if ((idTextField.getText().equals("12345")) && (pwTextField).getText().equals("qwerty")){
				MainForm mf = new MainForm();
				mf.setLocationRelativeTo(null);
				this.setVisible(false);
				mf.setVisible(true);
			}
			else{
				JOptionPane msgBox = new JOptionPane();
				msgBox.showMessageDialog(null,"Your ID no. and Password do not match or do not exist! Please try again.", "Information", JOptionPane.INFORMATION_MESSAGE);
				idTextField.setText("");
				pwTextField.setText("");
			}
		
		}
		else if (e.getSource() == cancelButton){
			dispose();
			System.exit(1);
		}
	}
}