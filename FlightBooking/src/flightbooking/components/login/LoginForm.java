/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package flightbooking.components.login;

/**
 *
 * @author night
 */

import flightbooking.Main;
import flightbooking.components.ReadWrite.FileRead;
import java.io.*;
import java.util.*;


public class LoginForm extends javax.swing.JFrame{
   
    private boolean canAddFlight = false;
    private boolean canBookFlight = false;
    private boolean canEditFlight = false;
    private boolean canEditBooking = false;
    
    
    
    public LoginForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerNew = new javax.swing.JDialog();
        loginPanel1 = new javax.swing.JPanel();
        userName1 = new javax.swing.JLabel();
        passWord1 = new javax.swing.JLabel();
        usernameField1 = new javax.swing.JTextField();
        passwordField1 = new javax.swing.JPasswordField();
        registerAccount = new javax.swing.JButton();
        passWord2 = new javax.swing.JLabel();
        addFlight = new javax.swing.JCheckBox();
        bookFlight = new javax.swing.JCheckBox();
        editFlight = new javax.swing.JCheckBox();
        editBooking = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        loginPanel = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        passWord = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        CreateAccount = new javax.swing.JButton();

        registerNew.setLocationByPlatform(true);
        registerNew.setMinimumSize(new java.awt.Dimension(400, 300));
        registerNew.setModal(true);
        registerNew.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        registerNew.setResizable(false);
        registerNew.setSize(new java.awt.Dimension(400, 300));

        loginPanel1.setMaximumSize(getMaximumSize());
        loginPanel1.setMinimumSize(getMinimumSize());
        loginPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userName1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        userName1.setText("USERNAME");
        loginPanel1.add(userName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, 22));

        passWord1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passWord1.setText("Permission:");
        loginPanel1.add(passWord1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 22));
        loginPanel1.add(usernameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 100, -1));
        loginPanel1.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 100, -1));

        registerAccount.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        registerAccount.setText("REGISTER");
        registerAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerAccountMouseClicked(evt);
            }
        });
        loginPanel1.add(registerAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 110, -1));

        passWord2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passWord2.setText("PASSWORD");
        loginPanel1.add(passWord2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, 22));

        addFlight.setText("Add Flight");
        addFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFlightMouseClicked(evt);
            }
        });
        loginPanel1.add(addFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 100, -1));

        bookFlight.setText("Book FLight");
        bookFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookFlightMouseClicked(evt);
            }
        });
        loginPanel1.add(bookFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        editFlight.setText("Edit Flight");
        editFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editFlightMouseClicked(evt);
            }
        });
        loginPanel1.add(editFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        editBooking.setText("Edit Booking");
        editBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBookingMouseClicked(evt);
            }
        });
        loginPanel1.add(editBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        javax.swing.GroupLayout registerNewLayout = new javax.swing.GroupLayout(registerNew.getContentPane());
        registerNew.getContentPane().setLayout(registerNewLayout);
        registerNewLayout.setHorizontalGroup(
            registerNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registerNewLayout.setVerticalGroup(
            registerNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        loginPanel.setMaximumSize(getMaximumSize());
        loginPanel.setMinimumSize(getMinimumSize());
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        userName.setText("USERNAME");
        loginPanel.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 85, -1, 22));

        passWord.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passWord.setText("PASSWORD");
        loginPanel.add(passWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 116, -1, 22));
        loginPanel.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 83, 100, -1));
        loginPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 114, 100, -1));

        login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        loginPanel.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 151, -1, -1));

        CreateAccount.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CreateAccount.setText("REGISTER");
        CreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateAccountMouseClicked(evt);
            }
        });
        loginPanel.add(CreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 151, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("loginFrame");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        String username;
        String password;

        username = usernameField.getText();
        char[] passwordArray = passwordField.getPassword();
        password = new String(passwordArray);   
            
        validateLogin(username, password);
    }//GEN-LAST:event_loginActionPerformed

    private void CreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountMouseClicked
        registerNew.setVisible(true);
    }//GEN-LAST:event_CreateAccountMouseClicked

    private void addFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFlightMouseClicked
        
        if(addFlight.getSelectedObjects() != null){
            canAddFlight = true;
        } else {
            canAddFlight = false;
        }

    }//GEN-LAST:event_addFlightMouseClicked

    private void registerAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerAccountMouseClicked
        String username;
        String password;

        username = usernameField.getText();
        char[] passwordArray = passwordField.getPassword();
        password = new String(passwordArray);  
        newAccount(username, password);
    }//GEN-LAST:event_registerAccountMouseClicked

    private void bookFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookFlightMouseClicked
        if(bookFlight.getSelectedObjects() != null){
            canBookFlight = true;
        } else {
            canBookFlight = false;
        }
 
    }//GEN-LAST:event_bookFlightMouseClicked

    private void editFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editFlightMouseClicked
        if(editFlight.getSelectedObjects() != null){
            canEditFlight = true;
        } else {
            canEditFlight = false;
        }
    }//GEN-LAST:event_editFlightMouseClicked

    private void editBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBookingMouseClicked
        if(editBooking.getSelectedObjects() != null){
            canEditBooking= true;
        } else {
            canEditBooking = false;
        }
    }//GEN-LAST:event_editBookingMouseClicked

    public void validateLogin(String username, String password){
       
        try{
            int indicatorEmptyFile = 0; // check if the account.txt is empty; only the "END/this is the end of the file" exist.
            String account;
            boolean accountExist = false;
            boolean usernameExist = false;
            boolean fileEnd = false;   
            
            File inputFile = new File(FileRead.accountsPath);
           
            Scanner scan = new Scanner(inputFile); 

            while(scan.hasNextLine()){
                String accounts[];
                String userN;
                String passW;
                String role;

                account = scan.nextLine();
                if(account.equals(Main.FILE_END)){
                    fileEnd = true;
                    break;
                }
                accounts = account.split("/");

                userN = accounts[0];
                passW = accounts[1];
                role = accounts[2];
                
                //check first username then password
                if (userN.equals(username)){
                    usernameExist = true;
                    if(passW.equals(password)){
                        accountExist = true;
                        break;
                    } else {
                        // notify that the password is wrong
                        System.out.print("password is wrong");
                        break;
                    }
                }
               
                indicatorEmptyFile++;
            }
            //end of while loop
            scan.close();     
            
            if(accountExist){
                
                //validate role here for user permission
                Main.showMenuForm();
                Main.showLoginForm();
            } else if(!accountExist){ // no account exist
                
                if((!usernameExist) && (indicatorEmptyFile > 0)){
                    System.out.print("the account do not exist");
                      //notify that the account do not exist
                }
                if((fileEnd) && (indicatorEmptyFile == 0)){
                    System.out.print("account database is empty");
                    Main.createNewAdmin(username, password);
                }
            }
            
            
        }
        catch(IOException e){
        
        }
    }
    
    
    public void newAccount(String username, String password){
        
     
        try{
            int indicatorEmptyFile = 0; // check if the account.txt is empty; only the "END/this is the end of the file" exist.
            String account;
            boolean usernameExist = false;
            boolean fileEnd = false;   
            
            String userNAdmin;
            String passWAdmin;
            
            File inputFile = new File(FileRead.accountsPath);
           
            Scanner scan = new Scanner(inputFile); 

            
            
            while(scan.hasNextLine()){
                String accounts[];
                String userN;
                String passW;
                String role;

                account = scan.nextLine();
                if(account.equals(Main.FILE_END)){
                    fileEnd = true;
                    break;
                }
                accounts = account.split("/");

                userN = accounts[0];
                passW = accounts[1];
                role = accounts[2];
                
                //check first username then password
                if("admin".equals(role)){
                    userNAdmin = userN;
                    passWAdmin = passW; 
                }
                if (userN.equals(username)){
                   usernameExist = true;
                 
                }
               
                indicatorEmptyFile++;
            }
            //end of while loop
            scan.close();     
            
            if(usernameExist){
                  System.out.print("username already exist");
               
            } else{ 
                
                if(canEditFlight || canEditBooking || canAddFlight || canBookFlight){
                    
                    FileWrite.newAccount(username, password, canAddFlight, canBookFlight, canEditFlight, canEditBooking);
                    
                } else {
                    System.out.print("No selected permission");
                }
                
                
                
     
            }
            
            
        }
        catch(IOException e){
        
        }
        
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccount;
    private javax.swing.JCheckBox addFlight;
    private javax.swing.JCheckBox bookFlight;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox editBooking;
    private javax.swing.JCheckBox editFlight;
    private javax.swing.JButton login;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel loginPanel1;
    private javax.swing.JLabel passWord;
    private javax.swing.JLabel passWord1;
    private javax.swing.JLabel passWord2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JButton registerAccount;
    private javax.swing.JDialog registerNew;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userName1;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField usernameField1;
    // End of variables declaration//GEN-END:variables

   
}
