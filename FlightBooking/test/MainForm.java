/**
* @file 						DriverProgram(.java)
* @description 					Provide a description of the program/interface/class
* @course CCC102 				Summer Class
* @lab 							Activity 11.1
* @date 						07/11/2024
* @author 						MAGHUYOP, Bobeth
*/

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class MainForm extends JFrame implements ActionListener{

	JLabel lnLabel;
	JLabel fnLabel;
	JLabel mnLabel;
	JLabel cnLabel;
	JLabel genderLabel;
	JLabel addLabel;
	JTextField fnTextField;
	JTextField lnTextField;
	JTextField mnTextField;
	JTextField contactNumTextField;
	JTextArea addTextArea;
	JComboBox genderComboBox;
	JButton saveButton;
	JButton cancelButton;
	
	public MainForm(){
		
		super("Main");
		setLayout(null);
		setSize(610,330);
		lnLabel = new JLabel("Last Name");
		fnLabel = new JLabel("First Name");
		mnLabel = new JLabel("Middle Name");
		addLabel = new JLabel("Address");
		cnLabel = new JLabel("Contact Number");
		genderLabel = new JLabel("Gender");
		lnTextField = new JTextField();
		fnTextField = new JTextField();
		mnTextField = new JTextField();
		contactNumTextField = new JTextField();
		addTextArea = new JTextArea();
		genderComboBox = new JComboBox();
		saveButton = new JButton("Save");
		cancelButton = new JButton("Cancel");
		genderComboBox.addItem("Male");
		genderComboBox.addItem("Female");
		lnLabel.setBounds(30, 20, 100, 20);
		fnLabel.setBounds(220, 20, 100, 20);
		mnLabel.setBounds(410, 20, 100, 20);
		lnTextField.setBounds(30, 40, 160, 25);
		fnTextField.setBounds(220, 40, 160, 25);
		mnTextField.setBounds(410, 40, 160, 25);
		addLabel.setBounds(30, 80, 185, 25);
		addTextArea.setBounds(30, 105, 350, 150);
		cnLabel.setBounds(410, 80, 185, 25);
		contactNumTextField.setBounds(410, 105, 160, 25);
		genderLabel.setBounds(410, 150, 100, 20);
		genderComboBox.setBounds(410, 170, 160, 25);
		saveButton.setBounds(410, 230, 75, 25);
		cancelButton.setBounds(495, 230, 75, 25);
		add(lnLabel);
		add(fnLabel);
		add(mnLabel);
		add(addLabel);
		add(cnLabel);
		add(genderLabel);
		add(lnTextField);
		add(fnTextField);
		add(mnTextField);
		add(contactNumTextField);
		add(addTextArea);
		add(genderComboBox);
		add(saveButton);
		add(cancelButton);
		saveButton.addActionListener(this);
		cancelButton.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
	
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == saveButton){
			Person p = new Person(lnTextField.getText(), fnTextField.getText(), mnTextField.getText(), addTextArea.getText(), contactNumTextField.getText(), genderComboBox.getSelectedItem().toString());
			saveToFile(p, p.getLastName(), p.getFirstName(), p.getMiddleName(), p.getAddress(), p.getContactNumber(), p.getGender());
		}
		else if(e.getSource() == cancelButton){
			
				int ans;
				JOptionPane msgBox = new JOptionPane();
				ans = msgBox.showConfirmDialog(null,"Are you sure you want to cancel?", "Confirmation", JOptionPane.YES_NO_OPTION);
				
			if (ans == JOptionPane.YES_OPTION){
				dispose();
				LoginForm lf = new LoginForm();
				lf.setLocationRelativeTo(null);
				lf.setVisible(true);
			}
		}
	}
	
	public void saveToFile(Person p, String lastName, String firstName, String middleName, String address, String contactNumber, String gender){
		String fileName = "out.txt";
		PrintWriter outputStream = null;
		try{
			outputStream = new PrintWriter(new FileOutputStream(fileName, true));
		}
		catch(FileNotFoundException e)
		{
				
			JOptionPane msgBox = new JOptionPane();
			msgBox.showMessageDialog(null,"Error opening the file!", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		finally{
			int ans;
			JOptionPane msgBox = new JOptionPane();
			JOptionPane msgBoxConf = new JOptionPane();
			ans = msgBox.showConfirmDialog(null,"Are you sure you want to save the person's information in the File?", "Confirmation", JOptionPane.YES_NO_OPTION);
			if (ans == JOptionPane.YES_OPTION){
				outputStream.println(p.getLastName() +"/"+ p.getFirstName() +"/"+ p.getMiddleName() +"/"+ p.getAddress() +"/"+ p.getContactNumber() +"/"+ p.getGender());
				outputStream.close();
				msgBoxConf.showMessageDialog(null,"You have successfully saved the person's record in the File!", "Information", JOptionPane.INFORMATION_MESSAGE);
				resetComponentsValues();
			}
		}
	}
	
	public void resetComponentsValues(){
		fnTextField.setText("");
		lnTextField.setText("");
		mnTextField.setText("");
		contactNumTextField.setText("");
		addTextArea.setText("");
		genderComboBox.setSelectedIndex(0);
	}
}
