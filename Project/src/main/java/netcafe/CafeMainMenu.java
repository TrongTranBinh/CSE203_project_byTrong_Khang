package netcafe;

import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CafeMainMenu extends javax.swing.JFrame {
    
    private final CustomerManage cm = new CustomerManage();
    
    public CafeMainMenu() {
        initComponents();
        setTitle("Net Cafe Manager");
        setLocationRelativeTo(null);
        fillInTable();
        jTable1.putClientProperty("JTable.autoStartsEdit", Boolean.TRUE);
        this.pack();
    }
    
    private void fillInTable() {
        cm.loadFile();
        //Delete all row
        this.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        //Add row
        model.setRowCount(0);
        Vector rowS;
        //CD(String id, String title, String collection, String type, double price, int year) 
        for (Customer cd : cm.getList()) {
            rowS = new Vector<>();
            
            rowS.add(cd.getPcNumber());
            rowS.add(cd.getRoom());
            rowS.add(cd.getUsername());
            rowS.add(cd.getRank());
            model.addRow(rowS);
        }
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        orderMenuBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ManagePC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(7, 132, 181));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 36, 40), 3, true));

        orderMenuBtn.setBackground(new java.awt.Color(25, 36, 40));
        orderMenuBtn.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        orderMenuBtn.setForeground(new java.awt.Color(7, 132, 181));
        orderMenuBtn.setText("Order Cafe");
        orderMenuBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(65, 76, 80), 3, true));
        orderMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderMenuBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel1.setText("Admin Manager System");

        ManagePC.setBackground(new java.awt.Color(25, 36, 40));
        ManagePC.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        ManagePC.setForeground(new java.awt.Color(7, 132, 181));
        ManagePC.setText("Manage PC");
        ManagePC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(65, 76, 80), 3, true));
        ManagePC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagePCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 550, Short.MAX_VALUE)
                .addComponent(ManagePC, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(orderMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManagePC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));

        jTable1.setBackground(new java.awt.Color(45, 56, 60));
        jTable1.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(7, 132, 181));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PC No.", "Room", "Username", "Rank"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1200, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderMenuBtnActionPerformed
        this.setEnabled(false);
        String id = String.valueOf(JOptionPane.showInputDialog("Please input a pc number to order: "));
        CafeMenu menu = new CafeMenu(id);
        this.setEnabled(true);
        this.setEnabled(true);
    }//GEN-LAST:event_orderMenuBtnActionPerformed

    private void ManagePCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagePCActionPerformed
        this.setEnabled(false);
        ManagePCDialogue manage = new ManagePCDialogue(new JFrame(), true, cm);
        this.setEnabled(true);
        cm.loadFile();
        fillInTable();
    }//GEN-LAST:event_ManagePCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManagePC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton orderMenuBtn;
    // End of variables declaration//GEN-END:variables
}
