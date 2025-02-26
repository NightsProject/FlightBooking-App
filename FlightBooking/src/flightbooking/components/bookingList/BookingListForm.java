/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package flightbooking.components.bookingList;

/**
 *
 * @author night
 */

import javax.swing.table.DefaultTableModel;
import flightbooking.Main;
import flightbooking.components.ReadWrite.FileWrite;
import javax.swing.ButtonModel;

public class BookingListForm extends javax.swing.JFrame {


    /**
     * Creates new form BookingListForm
     */
    public BookingListForm() {
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

        editDetailsDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        okButtonInDialog = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        destinationTextDialog = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        noButton = new javax.swing.JRadioButton();
        yesButton = new javax.swing.JRadioButton();
        extraBaggagePrice = new javax.swing.JTextField();
        billField = new javax.swing.JTextField();
        contactField = new javax.swing.JFormattedTextField();
        bookNum = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        vipButton = new javax.swing.JRadioButton();
        regularButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        seatReservedText = new javax.swing.JFormattedTextField();
        saveButton = new javax.swing.JButton();
        seatType = new javax.swing.ButtonGroup();
        extraBaggageGroup = new javax.swing.ButtonGroup();
        passDetails = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        passDetailsTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        editButton = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingsTable = new javax.swing.JTable();
        editButton1 = new javax.swing.JToggleButton();

        editDetailsDialog.setMinimumSize(new java.awt.Dimension(500, 620));
        editDetailsDialog.setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        okButtonInDialog.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        okButtonInDialog.setText("OK");
        okButtonInDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonInDialogActionPerformed(evt);
            }
        });
        jPanel1.add(okButtonInDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 80, 30));
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("TOTAL BILL");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("NAME");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 40));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("EMAIL");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setText("EXTRA BAGGAGE");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, 40));
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 200, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("CONTACT  #");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 40));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel16.setText("DESTINATION");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 40));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("PRICE");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        destinationTextDialog.setEditable(false);
        destinationTextDialog.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        destinationTextDialog.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        destinationTextDialog.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        destinationTextDialog.setFocusable(false);
        jPanel1.add(destinationTextDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 120, 40));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setText("SEAT TYPE");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, 40));

        extraBaggageGroup.add(noButton);
        noButton.setText("NO");
        noButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noButtonMouseClicked(evt);
            }
        });
        jPanel1.add(noButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        extraBaggageGroup.add(yesButton);
        yesButton.setText("YES");
        yesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yesButtonMouseClicked(evt);
            }
        });
        jPanel1.add(yesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        extraBaggagePrice.setEditable(false);
        extraBaggagePrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        extraBaggagePrice.setBorder(null);
        extraBaggagePrice.setFocusable(false);
        jPanel1.add(extraBaggagePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 110, 40));

        billField.setEditable(false);
        billField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        billField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        billField.setFocusable(false);
        jPanel1.add(billField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 110, 40));

        contactField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#######0"))));
        jPanel1.add(contactField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, 40));

        bookNum.setEditable(false);
        bookNum.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bookNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookNum.setBorder(null);
        bookNum.setFocusable(false);
        jPanel1.add(bookNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 250, 30));

        priceText.setEditable(false);
        priceText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        priceText.setBorder(null);
        priceText.setFocusable(false);
        jPanel1.add(priceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 110, 40));

        seatType.add(vipButton);
        vipButton.setText("VIP");
        vipButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vipButtonMouseClicked(evt);
            }
        });
        jPanel1.add(vipButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        seatType.add(regularButton);
        regularButton.setText("Regular");
        regularButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regularButtonMouseClicked(evt);
            }
        });
        jPanel1.add(regularButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jLabel1.setText("SEAT RESERVED");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 20));

        seatReservedText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##0"))));
        seatReservedText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(seatReservedText, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 420, 70, 40));

        saveButton.setText("SAVE");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout editDetailsDialogLayout = new javax.swing.GroupLayout(editDetailsDialog.getContentPane());
        editDetailsDialog.getContentPane().setLayout(editDetailsDialogLayout);
        editDetailsDialogLayout.setHorizontalGroup(
            editDetailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editDetailsDialogLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(editDetailsDialogLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(saveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editDetailsDialogLayout.setVerticalGroup(
            editDetailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDetailsDialogLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        passDetails.setMinimumSize(new java.awt.Dimension(1000, 400));
        passDetails.setModal(true);
        passDetails.setResizable(false);
        passDetails.setSize(new java.awt.Dimension(1000, 400));
        passDetails.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "BOOK NUMBER", "NAME", "EMAIL", "SEAT RESERVE", "CONTACT", "EXTRA BAGGAGE", "BILL"
            }
        ));
        passDetailsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(passDetailsTable);

        passDetails.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 880, 350));

        jButton3.setText("OK");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        passDetails.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        delete.setText("delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        passDetails.getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(1700, 723));
        setResizable(false);
        setSize(new java.awt.Dimension(1700, 723));

        jPanel2.setMinimumSize(new java.awt.Dimension(1743, 800));
        jPanel2.setPreferredSize(new java.awt.Dimension(1743, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editButton.setText("Edit");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });
        jPanel2.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, -1));

        jButton1.setText("All Bookings");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        bookingsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK NUMBER", "FLIGHT ID ", "AIRPLANE CODE", "DEPARTURE DATE", "DEPARTURE TIME", "DESTINATION", "SEAT RESERVE", "SEAT TYPE", "NAME", "EMAIL", "EXTRA BAGGAGE", "CONTACT NUMBER", "BILL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookingsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        bookingsTable.setFocusable(false);
        bookingsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(bookingsTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 1570, 780));

        editButton1.setText("MAIN MENU");
        editButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButton1MouseClicked(evt);
            }
        });
        jPanel2.add(editButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        allBookings();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void okButtonInDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonInDialogActionPerformed
        /*
        if(allFieldCheck()){
            yesButton.setSelected(false);
            extraBaggagePrice.setText(null);
            //find a way that this will not close the window but just refresh it
            editDetailsDialog.setVisible(false);
        } else {
            // inform that the field is all required to have value
            System.out.print("please input all field");
        }
        */
    }//GEN-LAST:event_okButtonInDialogActionPerformed

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        
        setEdit();
   
        
    }//GEN-LAST:event_editButtonMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        passDetails.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        saveData();
    }//GEN-LAST:event_saveButtonMouseClicked

    private void yesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesButtonMouseClicked
        if(!extraBaggagePrice.getText().equals(Main.EXTRA_BAGGAGE_PRICE)){
            extraBaggagePrice.setText(Integer.toString(Main.EXTRA_BAGGAGE_PRICE));
            billField.setText(Integer.toString(Integer.parseInt(priceText.getText()) + Main.EXTRA_BAGGAGE_PRICE));
        }      
    }//GEN-LAST:event_yesButtonMouseClicked

    private void noButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noButtonMouseClicked
      
        extraBaggagePrice.setText(null);
        billField.setText(priceText.getText());
             
    }//GEN-LAST:event_noButtonMouseClicked

    private void vipButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vipButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_vipButtonMouseClicked

    private void regularButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regularButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regularButtonMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        
        String currentSelected = (String) passDetailsTable.getValueAt(passDetailsTable.getSelectedRow(), 0);
        boolean isParent = false;
        
       
        for(int i = 0; i < Main.bookings.length; i++){
            
            if(Main.bookings[i].getbookNumber() == null){
                break;
            }
            
            if(currentSelected.equals(Main.bookings[i].getbookNumber())){
                String seatReserve[] = Main.bookings[i].getSeatReserve().split(":");
                if("Total".equals(seatReserve[0])){
                    isParent = true;
                }
            }
            
            
        }
        
        
        
        if(isParent){
            if(passDetailsTable.getRowCount() == 1){
                  FileWrite.cancelBooking(currentSelected , bookNum.getText());
                  passDetails.setVisible(false);
            }
            System.out.print("you cannot delete a parent book number");
            
        } else {
            
            for(int i = 0; i < Main.bookings.length; i++){
            
                if(Main.bookings[i].getbookNumber() == null){
                    break;
                }

           

                if(bookNum.getText().equals(Main.bookings[i].getbookNumber())){

                    String seatReserved[] = Main.bookings[i].getSeatReserve().split(":");

                    if(Integer.parseInt(seatReservedText.getText()) < Integer.parseInt(seatReserved[1])){
                        FileWrite.cancelBooking(currentSelected , bookNum.getText()); 

                        getPassData(bookNum.getText());
                    } else {
                        System.out.print("You can't cancel anymore");

                    }


                }
            }
        }
     
        
    }//GEN-LAST:event_deleteMouseClicked

    private void editButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButton1MouseClicked
        Main.viewBookingForm.setVisible(false);
    }//GEN-LAST:event_editButton1MouseClicked

     public void allBookings(){
        
      
        int count;
        
        count = 0;
        while(count < Main.bookings.length){
            if(Main.bookings[count].getbookNumber() == null){
                break;
            }
            count++;
        }
        
        // [FORMAT]: bookNumber / flightId / airplaneCode / departureDate / departureTime / destination / seatReserve / seatType / name /  email / extraBaggage / contactNumber / bill

        
        String bookingFormat[] = { "BOOK NUMBER", "FLIGHT ID", "AIRPLANE CODE", "DEPARTURE DATE", "DEPARTURE TIME", "DESTINATION", "SEAT RESERVE", "SEAT TYPE", "NAME", "EMAIL", "EXTRA BAGGAGE", "CONTACT NUMBER", "BILL" };
        
        Object[][] bookings = new Object[count][Main.BOOKING_FORMAT_COUNT];
 
        for(int i = 0; i <  Main.bookings.length; i++){
            
            if(Main.bookings[i].getbookNumber() == null){
                break;
            }
            
       
            bookings[i][0] = Main.bookings[i].getbookNumber();
            bookings[i][1] = Main.bookings[i].getFlightId();
            bookings[i][2] = Main.bookings[i].getAirplaneCode();
            bookings[i][3] = Main.bookings[i].getDepartureDate();
            bookings[i][4] = Main.bookings[i].getDepartureTime();
            bookings[i][5] = Main.bookings[i].getDestination();
                 
            String seatReserve[] = Main.bookings[i].getSeatReserve().split(":");
            bookings[i][6] = seatReserve[1];
                 
            bookings[i][7] = Main.bookings[i].getSeatType();
            bookings[i][8] = Main.bookings[i].getName();
            bookings[i][9] = Main.bookings[i].getEmail();   
            bookings[i][10] = Main.bookings[i].getExtraBaggage();
            bookings[i][11] = Main.bookings[i].getContactNumber();
            bookings[i][12] = Main.bookings[i].getBill();   
            
        }
   
        DefaultTableModel model = new DefaultTableModel(bookings, bookingFormat);
       
        bookingsTable.setModel(model);
        
    }

     public void setEdit(){
         
         try{
             
            
            int row = bookingsTable.getSelectedRow();

            //get the book number
            String bookNumber = (String) bookingsTable.getValueAt(row, 0);

            int count = 0;
            while(count < Main.MAX_BOOKINGS){

                if(Main.bookings[count].getbookNumber() == null){
                    break;
                }

                if(Main.bookings[count].getbookNumber().equals(bookNumber)){

                    bookNum.setText(Main.bookings[count].getbookNumber());
                    nameField.setText(Main.bookings[count].getName());
                    emailField.setText(Main.bookings[count].getEmail());
                    contactField.setText(Main.bookings[count].getContactNumber());
                    destinationTextDialog.setText(Main.bookings[count].getDestination());

                    String seatType = Main.bookings[count].getSeatType();

                    if("VIP".equals(seatType)){
                        vipButton.setSelected(true);
                    } else{
                        regularButton.setSelected(true);
                    }

                   String seatReserved[] = Main.bookings[count].getSeatReserve().split(":");


                   if("Total".equals(seatReserved[0])){
                       seatReservedText.setText(seatReserved[1]);
                       seatReservedText.setEditable(true);
                       seatReservedText.setFocusable(true);
                   } else {
                       seatReservedText.setText(seatReserved[1]);
                       seatReservedText.setEditable(false);
                       seatReservedText.setFocusable(false);
                   }

                   String extraBaggage = Main.bookings[count].getExtraBaggage();

                   if("YES".equals(extraBaggage)){
                       yesButton.setSelected(true);
                       extraBaggagePrice.setText(Integer.toString(Main.EXTRA_BAGGAGE_PRICE));
                   } else{
                       noButton.setSelected(true);
                   }

                   //set price
                   for(int i = 0;i < Main.prices.length; i++){     

                       //compare the desitination and seatType to get the price of the flight
                       if((Main.bookings[count].getDestination().equals(Main.prices[i][0])) && (Main.bookings[count].getSeatType().equals(Main.prices[i][1]))){
                           priceText.setText(Main.prices[i][2]);
                           if(Main.bookings[count].getExtraBaggage() == "YES"){
                                billField.setText(Integer.toString( (Integer.parseInt(Main.prices[i][2]) + Main.EXTRA_BAGGAGE_PRICE) ));
                           } else {
                               billField.setText(Main.prices[i][2]);
                           }

                   }     
               }


                }

                count++;
             
             }
              //after setting all needed details setVisible the jdialog
                editDetailsDialog.setVisible(true);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Please select a row to edit");
        }
         
     }
     
     public void saveData(){
         
        String bookNumber = bookNum.getText();
   
        for(int i = 0; i < Main.MAX_BOOKINGS; i++){
            
            if(Main.bookings[i].getbookNumber() == null){
                break;
            }
            
          
            // if not the parent booking
            if(bookNumber.equals(Main.bookings[i].getbookNumber())){
                
                 String seatReserve[] = Main.bookings[i].getSeatReserve().split(":");
                        
                if(seatReservedText.getText().equals(seatReserve[1])){
                
                  Main.bookings[i].setName(nameField.getText());
                  Main.bookings[i].setEmail(emailField.getText());
                  Main.bookings[i].setContactNumber(contactField.getText());

                  ButtonModel selectedModel = seatType.getSelection();
                  if (selectedModel == vipButton.getModel()) {
                      Main.bookings[i].setSeatType(vipButton.getText());
                  } else if (selectedModel == regularButton.getModel()) {
                      Main.bookings[i].setSeatType(regularButton.getText());
                  }

                  ButtonModel baggageModel = extraBaggageGroup.getSelection();
                  if (baggageModel == yesButton.getModel()) {
                      Main.bookings[i].setExtraBaggage(yesButton.getText());
                  } else if (baggageModel == noButton.getModel()) {
                      Main.bookings[i].setExtraBaggage(noButton.getText());
                  }
                  
                  Main.bookings[i].setBill(billField.getText());
                  editDetailsDialog.setVisible(false);
                  allBookings();
                
                } else if(Integer.parseInt(seatReservedText.getText()) < Integer.parseInt(seatReserve[1])){
                    //delete a passenger till the seat reserved and number of passenger is equal
                    getPassData(bookNumber);
                    
                    editDetailsDialog.setVisible(false);
                    passDetails.setVisible(true);
                    //cicking save will update the bookings
                    
                } else if (Integer.parseInt(seatReservedText.getText()) < Integer.parseInt(Main.bookings[i].getSeatReserve())){
                    System.out.print("Please book a new one, thanks");
                }
              
                
                
                
            }
         
     }
}
        
     public void getPassData(String bookNumber){
         
           //BOOK NUMBER / NAME / Email / Contact / Seat Reserve / EXTRA BAGGAGE / BILL / 
         
         String passengerData[][] = new String[Main.MAX_GROUP_BOOKING][Main.PASSENGER_FORMAT_COUNT];
         
         int count = 0;
        for(int j = 0; j < Main.MAX_GROUP_BOOKING; j++){
                        
            if(Main.bookings[j].getbookNumber() == null){
                break;
            }
            
            String seatReserved[] = Main.bookings[j].getSeatReserve().split(":");
            
            if(bookNumber.equals(Main.bookings[j].getbookNumber()) || bookNumber.equals(seatReserved[1])){
                            
                passengerData[count][0] = Main.bookings[j].getbookNumber();
                passengerData[count][1] = Main.bookings[j].getName();
                passengerData[count][2] = Main.bookings[j].getEmail();
                passengerData[count][3] = Main.bookings[j].getSeatReserve();
                passengerData[count][4] = Main.bookings[j].getExtraBaggage();
                passengerData[count][5] = Main.bookings[j].getBill();
                
                count++;
            }
                        
        }                       
                       
         viewPassDetails(passengerData);
    }
     
    public void viewPassDetails(String[][] passengerData){
      
        //BOOK NUMBER / NAME / Email / Contact / EXTRA BAGGAGE / BILL / Seat Reserve
        
           int count;
        
        count = 0;
        while(count < Main.MAX_GROUP_BOOKING){
            if(passengerData[count][0] == null){
                break;
            }
            count++;
        }
        
        String passFormat[] = {"BOOK NUMBER" , "NAME" , "EMAIL" , "CONTACT" , "SEAT RESERVE", "EXTRA BAGGAGE" , "BILL"};
   
        Object passDetails[][] = new Object[count][Main.PASSENGER_FORMAT_COUNT];
 
        for(int i = 0; i < Main.MAX_GROUP_BOOKING; i++){
            
            if(passengerData[i][0] == null){
                break;
            }
            passDetails[i][0] = passengerData[i][0];
            passDetails[i][1] = passengerData[i][1];
            passDetails[i][2] = passengerData[i][2];
            passDetails[i][3] = passengerData[i][3];
            passDetails[i][4] = passengerData[i][4];
            passDetails[i][5] = passengerData[i][5];
            passDetails[i][6] = passengerData[i][6];
        }
        
       
        DefaultTableModel model = new DefaultTableModel(passDetails, passFormat);
       
        passDetailsTable.setModel(model);
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField billField;
    private javax.swing.JTextField bookNum;
    private javax.swing.JTable bookingsTable;
    private javax.swing.JFormattedTextField contactField;
    private javax.swing.JButton delete;
    private javax.swing.JTextField destinationTextDialog;
    private javax.swing.JToggleButton editButton;
    private javax.swing.JToggleButton editButton1;
    private javax.swing.JDialog editDetailsDialog;
    private javax.swing.JTextField emailField;
    private javax.swing.ButtonGroup extraBaggageGroup;
    private javax.swing.JTextField extraBaggagePrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JRadioButton noButton;
    private javax.swing.JButton okButtonInDialog;
    private javax.swing.JDialog passDetails;
    private javax.swing.JTable passDetailsTable;
    private javax.swing.JTextField priceText;
    private javax.swing.JRadioButton regularButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JFormattedTextField seatReservedText;
    private javax.swing.ButtonGroup seatType;
    private javax.swing.JRadioButton vipButton;
    private javax.swing.JRadioButton yesButton;
    // End of variables declaration//GEN-END:variables
}
