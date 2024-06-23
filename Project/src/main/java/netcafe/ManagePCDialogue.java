package netcafe;

import javax.swing.JOptionPane;

public class ManagePCDialogue extends javax.swing.JDialog {

    private CustomerManage cm;

    public ManagePCDialogue(java.awt.Frame parent, boolean modal, CustomerManage cm) {
        super(parent, modal);
        initComponents();
        this.cm = cm;
        getPCComboBoxModel();
        this.pack();
        this.setVisible(true);
    }

    private void getPCComboBoxModel() {
        cm.loadFile();
        String[] pcNumber = new String[cm.getList().size()];
        for (int i = 0; i < cm.getList().size(); i++) {
            pcNumber[i] = cm.getList().get(i).getPcNumber();
        }
        PcNumberBox.setModel(new javax.swing.DefaultComboBoxModel(pcNumber));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PcNumberBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RankBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        PCRoomBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JButton();
        NewSlot = new javax.swing.JButton();
        ConfirmBtn = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 76, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 132, 181));
        jLabel1.setText("Manage PC Slots");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        PcNumberBox.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        PcNumberBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PcNumberBoxActionPerformed(evt);
            }
        });
        jPanel1.add(PcNumberBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 290, 30));

        jLabel2.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 132, 181));
        jLabel2.setText("Rank:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, -1));

        jLabel3.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 132, 181));
        jLabel3.setText("PC Number: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        RankBox.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        RankBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Silver", "Gold" }));
        jPanel1.add(RankBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 290, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 90, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, 10));

        jLabel4.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 132, 181));
        jLabel4.setText("PC Room:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        usernameField.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 172, 290, 30));

        PCRoomBox.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        PCRoomBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gamer Room", "Couple Room", "Private Room" }));
        jPanel1.add(PCRoomBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 290, 30));

        jLabel5.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 132, 181));
        jLabel5.setText("Username:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        ExitBtn.setBackground(new java.awt.Color(7, 132, 181));
        ExitBtn.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        NewSlot.setBackground(new java.awt.Color(7, 132, 181));
        NewSlot.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        NewSlot.setText("New slot");
        NewSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSlotActionPerformed(evt);
            }
        });
        jPanel1.add(NewSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        ConfirmBtn.setBackground(new java.awt.Color(7, 132, 181));
        ConfirmBtn.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        ConfirmBtn.setText("Confirm");
        ConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ConfirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PcNumberBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PcNumberBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PcNumberBoxActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void NewSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSlotActionPerformed
        cm.loadFile();
        Customer cus = new Customer("PC " + (cm.getList().size() + 1));
        cm.getList().add(cus);
        cm.saveFile();
        getPCComboBoxModel();
    }//GEN-LAST:event_NewSlotActionPerformed

    private void ConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBtnActionPerformed
        String pcNumber = String.valueOf(PcNumberBox.getSelectedItem());
        String pcRoom = String.valueOf(PCRoomBox.getSelectedItem());
        String username = usernameField.getText();
        String userRank = String.valueOf(RankBox.getSelectedItem());
        if (pcNumber != null && username == null) {
            JOptionPane.showMessageDialog(this, "Please input a username");
        }
        for (int index = 0; index < cm.getList().size(); index++) {
            if (pcNumber.equals(cm.getList().get(index).pcNumber)) {
                cm.getList().get(index).setUsername(username);
                cm.getList().get(index).setRoom(pcRoom);
                cm.getList().get(index).setRank(userRank);
                break;
            }
        }
        cm.saveFile();
    }//GEN-LAST:event_ConfirmBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton NewSlot;
    private javax.swing.JComboBox<String> PCRoomBox;
    private javax.swing.JComboBox<String> PcNumberBox;
    private javax.swing.JComboBox<String> RankBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
