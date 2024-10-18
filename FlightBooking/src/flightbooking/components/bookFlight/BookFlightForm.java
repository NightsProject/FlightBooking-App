/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package flightbooking.components.bookFlight;

/**
 *
 * @author night
 */


import flightbooking.Main;
import flightbooking.components.Flight;
import static flightbooking.components.bookFlight.BookFlightComponents.newBook;
import javax.swing.ButtonModel;
import javax.swing.table.DefaultTableModel;
        
public class BookFlightForm extends javax.swing.JFrame {
    
    //temporary arrays
    public static Flight flight[] = new Flight[Main.SEAT_TYPE_COUNT];
    public static String passengerData[][] = new String[Main.MAX_GROUP_BOOKING][Main.PASSENGER_FORMAT_COUNT];
    
    public static String bookNum;

    public BookFlightForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seatTypeGroup = new javax.swing.ButtonGroup();
        passengerDetailsDialog = new javax.swing.JDialog();
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
        seatTypeDialog = new javax.swing.JTextField();
        contactField = new javax.swing.JFormattedTextField();
        passText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        extraBaggageGroup = new javax.swing.ButtonGroup();
        viewCurrentFlights = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        destinationComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightsTable = new javax.swing.JTable();
        okButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        passDetails = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        passDetailsTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        bookingPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        flightIdField = new javax.swing.JFormattedTextField();
        viewFlights = new javax.swing.JButton();
        departureTimeText = new javax.swing.JTextField();
        departureDateText = new javax.swing.JTextField();
        destinationText = new javax.swing.JTextField();
        airplaneCodeText = new javax.swing.JTextField();
        vipButton = new javax.swing.JRadioButton();
        regularButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        seatReserveCount = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        statusText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        vacantSeatText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        input = new javax.swing.JButton();
        viewList = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        passengerDetailsDialog.setMinimumSize(new java.awt.Dimension(500, 620));
        passengerDetailsDialog.setModal(true);
        passengerDetailsDialog.setResizable(false);

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
        jPanel1.add(okButtonInDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 80, 30));
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("TOTAL BILL");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("NAME");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 40));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("EMAIL");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setText("EXTRA BAGGAGE");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, 40));
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 200, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("CONTACT  #");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 40));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel16.setText("DESTINATION");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 40));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("PRICE");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        destinationTextDialog.setEditable(false);
        destinationTextDialog.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        destinationTextDialog.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        destinationTextDialog.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        destinationTextDialog.setFocusable(false);
        jPanel1.add(destinationTextDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 120, 40));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setText("SEAT TYPE");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, 40));

        extraBaggageGroup.add(noButton);
        noButton.setSelected(true);
        noButton.setText("NO");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });
        jPanel1.add(noButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        extraBaggageGroup.add(yesButton);
        yesButton.setText("YES");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(yesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        extraBaggagePrice.setEditable(false);
        extraBaggagePrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        extraBaggagePrice.setBorder(null);
        extraBaggagePrice.setFocusable(false);
        jPanel1.add(extraBaggagePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 110, 40));

        billField.setEditable(false);
        billField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        billField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        billField.setFocusable(false);
        jPanel1.add(billField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 110, 40));

        seatTypeDialog.setEditable(false);
        seatTypeDialog.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        seatTypeDialog.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seatTypeDialog.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        seatTypeDialog.setRequestFocusEnabled(false);
        jPanel1.add(seatTypeDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 120, 40));

        contactField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#######0"))));
        jPanel1.add(contactField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, 40));

        passText.setEditable(false);
        passText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        passText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passText.setBorder(null);
        passText.setFocusable(false);
        jPanel1.add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 250, 30));

        priceText.setEditable(false);
        priceText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        priceText.setBorder(null);
        priceText.setFocusable(false);
        jPanel1.add(priceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 110, 40));

        jLabel1.setText("*Please make sure to check the data's you provided before clicking ok");

        javax.swing.GroupLayout passengerDetailsDialogLayout = new javax.swing.GroupLayout(passengerDetailsDialog.getContentPane());
        passengerDetailsDialog.getContentPane().setLayout(passengerDetailsDialogLayout);
        passengerDetailsDialogLayout.setHorizontalGroup(
            passengerDetailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passengerDetailsDialogLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(passengerDetailsDialogLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        passengerDetailsDialogLayout.setVerticalGroup(
            passengerDetailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passengerDetailsDialogLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        viewCurrentFlights.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        viewCurrentFlights.setMinimumSize(new java.awt.Dimension(1743, 812));
        viewCurrentFlights.setResizable(false);
        viewCurrentFlights.setSize(new java.awt.Dimension(1743, 812));

        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setMinimumSize(new java.awt.Dimension(1743, 800));
        jPanel2.setPreferredSize(new java.awt.Dimension(1743, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        destinationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DAVAO", "CEBU", "MANILA", "CDO" }));
        destinationComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                destinationComboBoxMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                destinationComboBoxMouseReleased(evt);
            }
        });
        jPanel2.add(destinationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 40));

        jButton1.setText("All Flights");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, 30));

        flightsTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        flightsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FLIGHT ID ", "AIRPLANE CODE", "DEPARTURE DATE", "DEPARTURE TIME", "DESTINATION", "VACANT SEAT", "SEAT TYPE", "STATUS", "REMARKS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        flightsTable.setFocusable(false);
        flightsTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                flightsTableFocusGained(evt);
            }
        });
        flightsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(flightsTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 1530, 730));

        okButton.setText("OK");
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonMouseClicked(evt);
            }
        });
        jPanel2.add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 30));

        jButton2.setText("Search");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 90, -1));

        javax.swing.GroupLayout viewCurrentFlightsLayout = new javax.swing.GroupLayout(viewCurrentFlights.getContentPane());
        viewCurrentFlights.getContentPane().setLayout(viewCurrentFlightsLayout);
        viewCurrentFlightsLayout.setHorizontalGroup(
            viewCurrentFlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewCurrentFlightsLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        viewCurrentFlightsLayout.setVerticalGroup(
            viewCurrentFlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewCurrentFlightsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        passDetails.setMinimumSize(new java.awt.Dimension(1000, 400));
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
        passDetails.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(958, 548));
        setResizable(false);
        setSize(new java.awt.Dimension(958, 548));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        bookingPanel.setMinimumSize(new java.awt.Dimension(850, 660));
        bookingPanel.setPreferredSize(new java.awt.Dimension(850, 660));
        bookingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("SEAT TYPE");
        bookingPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 110, 50));

        flightIdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        flightIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                flightIdFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                flightIdFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                flightIdFieldKeyTyped(evt);
            }
        });
        bookingPanel.add(flightIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 190, 50));

        viewFlights.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        viewFlights.setText("View Flights");
        viewFlights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewFlightsMouseClicked(evt);
            }
        });
        viewFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFlightsActionPerformed(evt);
            }
        });
        bookingPanel.add(viewFlights, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 130, 30));

        departureTimeText.setEditable(false);
        departureTimeText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        departureTimeText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        departureTimeText.setFocusable(false);
        bookingPanel.add(departureTimeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 190, 50));

        departureDateText.setEditable(false);
        departureDateText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        departureDateText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        departureDateText.setFocusable(false);
        bookingPanel.add(departureDateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 190, 50));

        destinationText.setEditable(false);
        destinationText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        destinationText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        destinationText.setFocusable(false);
        bookingPanel.add(destinationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 190, 50));

        airplaneCodeText.setEditable(false);
        airplaneCodeText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        airplaneCodeText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        airplaneCodeText.setFocusable(false);
        bookingPanel.add(airplaneCodeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 190, 50));

        seatTypeGroup.add(vipButton);
        vipButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        vipButton.setText("VIP");
        vipButton.setEnabled(false);
        vipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vipButtonActionPerformed(evt);
            }
        });
        bookingPanel.add(vipButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        seatTypeGroup.add(regularButton);
        regularButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        regularButton.setText("Regular");
        regularButton.setEnabled(false);
        regularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularButtonActionPerformed(evt);
            }
        });
        bookingPanel.add(regularButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("FLIGHT ID");
        bookingPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("DESTINATION");
        bookingPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 150, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("DEPARTURE DATE");
        bookingPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 180, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("NO. SEAT TO RESERVE");
        bookingPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 210, 60));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("AIRPLANE CODE");
        bookingPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 170, 50));

        seatReserveCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookingPanel.add(seatReserveCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 70, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("DEPARTURE TIME");
        bookingPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 180, 50));

        statusText.setEditable(false);
        statusText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        statusText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        statusText.setFocusable(false);
        bookingPanel.add(statusText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 190, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("PASSENGER DETAILS");
        bookingPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 190, 50));

        vacantSeatText.setEditable(false);
        vacantSeatText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        vacantSeatText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vacantSeatText.setFocusable(false);
        bookingPanel.add(vacantSeatText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 190, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("VACANT SEAT");
        bookingPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 150, 50));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("STATUS");
        bookingPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 100, 50));

        input.setText("Input");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        bookingPanel.add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, 30));

        viewList.setText("View List");
        viewList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewListMouseClicked(evt);
            }
        });
        bookingPanel.add(viewList, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, 30));

        confirmButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        confirmButton.setText("CONFIRM");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        bookingPanel.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        jButton4.setText("MAIN MENU");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        bookingPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(bookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void flightIdFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flightIdFieldKeyPressed
        setFlight();
    }//GEN-LAST:event_flightIdFieldKeyPressed

    private void flightIdFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flightIdFieldKeyReleased
        setFlight();
    }//GEN-LAST:event_flightIdFieldKeyReleased

    private void flightIdFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flightIdFieldKeyTyped
        setFlight();
    }//GEN-LAST:event_flightIdFieldKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
    }//GEN-LAST:event_formWindowActivated

    private void okButtonInDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonInDialogActionPerformed
        
        if(allFieldCheck()){
            yesButton.setSelected(false);
            extraBaggagePrice.setText(null);
            //find a way that this will not close the window but just refresh it
            passengerDetailsDialog.setVisible(false); 
        } else {
            // inform that the field is all required to have value
            System.out.print("please input all field");
        }
        
        
    }//GEN-LAST:event_okButtonInDialogActionPerformed

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        extraBaggagePrice.setText("+ " + Integer.toString(Main.EXTRA_BAGGAGE_PRICE));
        //add the extra baggage price to the bill
        billField.setText(Integer.toString(Integer.parseInt(BookFlightComponents.newBook.getBill()) + Main.EXTRA_BAGGAGE_PRICE));
        
    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        extraBaggagePrice.setText(null);
        billField.setText(BookFlightComponents.newBook.getBill());
    }//GEN-LAST:event_noButtonActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
        try{
        String status = flight[0].getStatus();
        
        if(seatReserveCount.getText().length() > 0){
        
            
            // the vacant seat should be updated if the button is pressed
            int vacantSeat = Integer.parseInt(newBook.getVacantSeat());
          
            
            int seatReserve = Integer.parseInt(seatReserveCount.getText());

            if("OK".equals(status)){

                if((seatReserve <= vacantSeat) && (seatReserve < Main.MAX_GROUP_BOOKING)){
                    getPassengerData(seatReserve);
                } else{
                      System.out.print("you have reserve more that the vacant seat");
                } 
            } else if(seatReserve < 0){
                System.out.print("seat reserve cannot be empty");
            }
            else{
                System.out.print("this flight is cancelled");

            }
        } else{
            System.out.print("seat to reserve should not be empty");
        }
        }
        catch(NullPointerException e){
            System.out.print("Please provide a flight ID");
        }
    }                                     

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        BookFlightComponents.setPassengerData();
        refresh();
        
        
        
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void vipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vipButtonActionPerformed
        
        for(int i = 0; i < flight.length;i++){
            if("VIP".equals(flight[i].getSeatType())){
                newBook.setVacantSeat(flight[i].getVacantSeat());
                vacantSeatText.setText(flight[i].getVacantSeat());
            }
            
        }
    }//GEN-LAST:event_vipButtonActionPerformed

    private void regularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularButtonActionPerformed
         for(int i = 0; i < flight.length;i++){
            if("Regular".equals(flight[i].getSeatType())){
                newBook.setVacantSeat(flight[i].getVacantSeat());
                vacantSeatText.setText(flight[i].getVacantSeat());
            }
            
        }
    }//GEN-LAST:event_regularButtonActionPerformed

    private void viewFlightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewFlightsMouseClicked
        viewCurrentFlights.setVisible(true);
        
    }//GEN-LAST:event_viewFlightsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        allFlights();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void flightsTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_flightsTableFocusGained

    }//GEN-LAST:event_flightsTableFocusGained

    private void flightsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightsTableMouseClicked

    }//GEN-LAST:event_flightsTableMouseClicked

    private void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked

        viewCurrentFlights.setVisible(false);
       

    }//GEN-LAST:event_okButtonMouseClicked

    private void viewFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFlightsActionPerformed
         viewCurrentFlights.setVisible(true);
    }//GEN-LAST:event_viewFlightsActionPerformed

    private void destinationComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinationComboBoxMousePressed
        destinationFilter( (String) destinationComboBox.getSelectedItem());
    }//GEN-LAST:event_destinationComboBoxMousePressed

    private void destinationComboBoxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinationComboBoxMouseReleased
       
    }//GEN-LAST:event_destinationComboBoxMouseReleased

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         destinationFilter( (String) destinationComboBox.getSelectedItem());
    }//GEN-LAST:event_jButton2MouseClicked

    private void viewListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewListMouseClicked
        viewPassDetails();
        passDetails.setVisible(true);
    }//GEN-LAST:event_viewListMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

          passDetails.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Main.bookFlightForm.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

    
    
    public void setFlight(){
        
        try{
        if(flightIdField.getText().length() == 4){
            String seatTypeAvail;
            //check the flightID is available
            seatTypeAvail = BookFlightComponents.flightIdCheck(flightIdField.getText());
            
            
            if("!FlightExist".equals(seatTypeAvail)){
                //notify that the flight do not exist
   
            }
            
            if("vip".equals(seatTypeAvail)){
                showFlightData();
                regularButton.setEnabled(false);
                vipButton.setSelected(true);
                
                   //willl set the vacant seat
                for(int i = 0; i < flight.length;i++){
                    if("VIP".equals(flight[i].getSeatType())){
                        newBook.setVacantSeat(flight[i].getVacantSeat());
                        vacantSeatText.setText(flight[i].getVacantSeat());
                    }
            
                }

                vipButton.setEnabled(true);
                            
                
            }
            
            if("regular".equals(seatTypeAvail)){ 
                showFlightData();
                vipButton.setEnabled(false);
                regularButton.setSelected(true);
                
                //will set the vacant seat
                for(int i = 0; i < flight.length;i++){
                    if("Regular".equals(flight[i].getSeatType())){
                        newBook.setVacantSeat(flight[i].getVacantSeat());
                        vacantSeatText.setText(flight[i].getVacantSeat());
                    }

                }
                
                regularButton.setEnabled(true);
       
            }
            
            if("both".equals(seatTypeAvail)){
                showFlightData();
                vipButton.setEnabled(true);
                regularButton.setEnabled(true);
                
            }
        } else{
            vipButton.setEnabled(false);
            regularButton.setEnabled(false);
           
            //find a way todeselect the button
            seatTypeGroup.clearSelection();
            
            hideFlightData();
        }
        }catch(NumberFormatException e){
            ///inform that the input should only be a number
              hideFlightData();
        }
         
}
    
    public void showFlightData(){

        airplaneCodeText.setText(flight[0].getAirplaneCode());
        destinationText.setText(flight[0].getDestination());
        departureDateText.setText(flight[0].getDepartureDate());
        departureTimeText.setText(flight[0].getDepartureTime());
        statusText.setText(flight[0].getStatus());
        
        
       
}
    public void hideFlightData(){
        airplaneCodeText.setText(null);
        destinationText.setText(null);
        departureDateText.setText(null);
        departureTimeText.setText(null);
        statusText.setText(null);
        vacantSeatText.setText(null);
    }
    
    public void refresh(){
        
        flightIdField.setText(null);
        airplaneCodeText.setText(null);
        destinationText.setText(null);
        departureDateText.setText(null);
        departureTimeText.setText(null);
        statusText.setText(null);
        vacantSeatText.setText(null);
        seatTypeGroup.clearSelection();
        seatReserveCount.setText(null);
        
    }
    
   
    public void getPassengerData(int passengerCount){
        
        //collect every passenger data
        int count;
        
        count = 0;
        while(count != passengerCount){
           
        // [FORMAT]: bookNumber / flightId / airplaneCode / departureDate / departureTime / destination / seatReserve / seatType / name / + email / extraBaggage / contactNumber / bill
        // [FORMAT]: FLIGHT ID / AIRPLANE CODE / DEPARTURE DATE / DEPARTURE TIME/ DESTINATION/ VACANT SEATS / SEAT TYPE / STATUS / REMARKS
        // [FORMAT]: BOOK NUMBER / NAME / Email / Contact / EXTRA BAGGAGE / BILL / Seat Reserve---passengerData
            
         
        //generate a unique book number to each 
            if(count >= 1){
                String num = BookFlightComponents.genBookNumPass();
                passengerData[count][0] = num;   
            } else {
                String num = BookFlightComponents.genBookNum();
                passengerData[count][0] = num;   
                //store the parent book number
                bookNum = num;
            }
           
            //set flight data
            BookFlightComponents.newBook.setFlightId(flight[0].getFlightId());
            BookFlightComponents.newBook.setAirplaneCode(flight[0].getAirplaneCode());
            BookFlightComponents.newBook.setDepartureDate(flight[0].getDepartureDate());
            BookFlightComponents.newBook.setDepartureTime(flight[0].getDepartureTime());
            BookFlightComponents.newBook.setDestination(flight[0].getDestination());
            
            
            if (count >= 1){
                 passengerData[count][6] = "Parent Book Number:" + bookNum;
            } else {
                 passengerData[count][6] = "Total:" + passengerCount;
                
            }
           
            
            ButtonModel seatTypeModel = seatTypeGroup.getSelection();
            if (seatTypeModel == vipButton.getModel()) {
                BookFlightComponents.newBook.setSeatType("VIP");
                seatTypeDialog.setText(vipButton.getText());
            } else if (seatTypeModel == regularButton.getModel()) {
                BookFlightComponents.newBook.setSeatType("Regular");
                seatTypeDialog.setText(regularButton.getText());
            }
            
            passText.setText("Passenger " + (count + 1) + "| Book Number: " + passengerData[count][0]);
            destinationTextDialog.setText(flight[0].getDestination());
            
           
            // show the prices
            for(int i = 0;i < Main.prices.length; i++){     
             
                //compare the desitination and seatType to get the price of the flight
                if((BookFlightComponents.newBook.getDestination().equals(Main.prices[i][0])) && (BookFlightComponents.newBook.getSeatType().equals(Main.prices[i][1]))){
                    BookFlightComponents.newBook.setBill(Main.prices[i][2]);
                    priceText.setText(Main.prices[i][2]);
                    billField.setText(Main.prices[i][2]);
                }     
            }
            
            

            // this  dialog[modal(true)] will wait for the user input
            passengerDetailsDialog.setVisible(true);
            
        
            passengerData[count][1] = nameField.getText();
            passengerData[count][2] = emailField.getText();
            passengerData[count][3] = contactField.getText();
            
            
            ButtonModel selectedModel = extraBaggageGroup.getSelection();
            if (selectedModel == yesButton.getModel()) {
                passengerData[count][4] = yesButton.getText();
            } else if (selectedModel == noButton.getModel()) {
                passengerData[count][4] = noButton.getText();
            }
            
            passengerData[count][5] = billField.getText();
            

            
            //add to inform that it added succesfully
            
            nameField.setText(null);
            emailField.setText(null);
            contactField.setText(null);
            
            // default button selected
            yesButton.setSelected(false);
            
            noButton.setSelected(true);
            billField.setText(null);
            count++;
        }
        

    }
    
     public boolean allFieldCheck(){
         
         if(nameField.getText().length() > 0 && emailField.getText().length() > 0 && contactField.getText().length() > 0){
             return true;
         }
         return false;
     }   
     
     
     public void allFlights(){
 
        int count;
        
        count = 0;
        while(count < Main.flights.length){
            if(Main.flights[count].getFlightId() == null){
                break;
            }
            count++;
        }
        
        String flightFormat[] = {"FLIGHT ID", "AIRPLANE CODE", "DEPARTURE DATE", "DEPARTURE TIME", "DESTINATION", "VACANT SEATS", "SEAT TYPE", "STATUS", "REMARKS" };
   
        Object flights[][] = new Object[count][Main.FLIGHT_FORMAT_COUNT];
 
        for(int i = 0; i < Main.flights.length; i++){
            
            if(Main.flights[i].getFlightId() == null){
                break;
            }
            flights[i][0] = Main.flights[i].getFlightId();
            flights[i][1] = Main.flights[i].getAirplaneCode();
            flights[i][2] = Main.flights[i].getDepartureDate();
            flights[i][3] = Main.flights[i].getDepartureTime();
            flights[i][4] = Main.flights[i].getDestination();
            flights[i][5] = Main.flights[i].getVacantSeat();
            flights[i][6] = Main.flights[i].getSeatType();
            flights[i][7] = Main.flights[i].getStatus();
            flights[i][8] = Main.flights[i].getRemarks();           
        }
        
       
        DefaultTableModel model = new DefaultTableModel(flights, flightFormat);
       
        flightsTable.setModel(model);
        
    }
     
    public void destinationFilter(String destination){
        
        int count;
        int indicator;
        
        count = 0;
        indicator = 0;
        while(count < Main.flights.length){
            if(Main.flights[count].getFlightId() == null){
                break;
            }
            if(destination.equals(Main.flights[count].getDestination())){
                indicator++;
            }
            count++;
        }
        
        System.out.print(count + "hhhhhh");
        
        String flightFormat[] = {"FLIGHT ID", "AIRPLANE CODE", "DEPARTURE DATE", "DEPARTURE TIME", "DESTINATION", "VACANT SEATS", "SEAT TYPE", "STATUS", "REMARKS" };
   
        Object flights[][] = new Object[indicator][Main.FLIGHT_FORMAT_COUNT];
 
        int j = 0;
        for(int i = 0; i < Main.flights.length; i++){
            
            if(Main.flights[i].getFlightId() == null){
                break;
            }
            
            if(destination.equals(Main.flights[i].getDestination())){
                
                flights[j][0] = Main.flights[i].getFlightId();
                flights[j][1] = Main.flights[i].getAirplaneCode();
                flights[j][2] = Main.flights[i].getDepartureDate();
                flights[j][3] = Main.flights[i].getDepartureTime();
                flights[j][4] = Main.flights[i].getDestination();
                flights[j][5] = Main.flights[i].getVacantSeat();
                flights[j][6] = Main.flights[i].getSeatType();
                flights[j][7] = Main.flights[i].getStatus();
                flights[j][8] = Main.flights[i].getRemarks();         
                j++;
            }
             
        }
        
       
        DefaultTableModel model = new DefaultTableModel(flights, flightFormat);
       
        flightsTable.setModel(model);
        
        
        
    }
    
    public void viewPassDetails(){
        
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
            passDetails[i][4] = passengerData[i][6];
            passDetails[i][5] = passengerData[i][4];
            passDetails[i][6] = passengerData[i][5];
        }
        
       
        DefaultTableModel model = new DefaultTableModel(passDetails, passFormat);
       
        passDetailsTable.setModel(model);
        
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airplaneCodeText;
    private javax.swing.JTextField billField;
    private javax.swing.JPanel bookingPanel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JFormattedTextField contactField;
    private javax.swing.JTextField departureDateText;
    private javax.swing.JTextField departureTimeText;
    private javax.swing.JComboBox<String> destinationComboBox;
    private javax.swing.JTextField destinationText;
    private javax.swing.JTextField destinationTextDialog;
    private javax.swing.JTextField emailField;
    private javax.swing.ButtonGroup extraBaggageGroup;
    private javax.swing.JTextField extraBaggagePrice;
    private javax.swing.JFormattedTextField flightIdField;
    private javax.swing.JTable flightsTable;
    private javax.swing.JButton input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JRadioButton noButton;
    private javax.swing.JButton okButton;
    private javax.swing.JButton okButtonInDialog;
    private javax.swing.JDialog passDetails;
    private javax.swing.JTable passDetailsTable;
    private javax.swing.JTextField passText;
    private javax.swing.JDialog passengerDetailsDialog;
    private javax.swing.JTextField priceText;
    private javax.swing.JRadioButton regularButton;
    private javax.swing.JFormattedTextField seatReserveCount;
    private javax.swing.JTextField seatTypeDialog;
    private javax.swing.ButtonGroup seatTypeGroup;
    private javax.swing.JTextField statusText;
    private javax.swing.JTextField vacantSeatText;
    private javax.swing.JDialog viewCurrentFlights;
    private javax.swing.JButton viewFlights;
    private javax.swing.JButton viewList;
    private javax.swing.JRadioButton vipButton;
    private javax.swing.JRadioButton yesButton;
    // End of variables declaration//GEN-END:variables
}
