/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.StoreAdminRole;

import Business.Enterprise.StoreEnterprise;

import Business.UserAccount.UserAccount;

import Business.WorkQueue.StoreOrder;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private StoreEnterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public ManageOrderJPanel(JPanel userProcessContainer, UserAccount account, StoreEnterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateOrderHistoryTable();
        valueLabel.setText(enterprise.getName());
          
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnCancelOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblOrderHistory = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();
        btnConfirmOrder = new javax.swing.JButton();
        btnCompleteOrder = new javax.swing.JButton();
        cancelMessage = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseLabel.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 204, 204));
        enterpriseLabel.setText("Manage Orders");

        valueLabel.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 153, 0));
        valueLabel.setText("<value>");

        btnCancelOrder.setBackground(new java.awt.Color(204, 204, 255));
        btnCancelOrder.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        btnCancelOrder.setForeground(new java.awt.Color(255, 153, 0));
        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        TblOrderHistory.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        TblOrderHistory.setForeground(new java.awt.Color(0, 204, 204));
        TblOrderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderItems", "Request Date", "Status", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblOrderHistory);

        refreshTestJButton.setBackground(new java.awt.Color(204, 204, 255));
        refreshTestJButton.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(255, 153, 0));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        btnConfirmOrder.setBackground(new java.awt.Color(204, 204, 255));
        btnConfirmOrder.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        btnConfirmOrder.setForeground(new java.awt.Color(255, 153, 0));
        btnConfirmOrder.setText("Confirm Order");
        btnConfirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmOrderActionPerformed(evt);
            }
        });

        btnCompleteOrder.setBackground(new java.awt.Color(204, 204, 255));
        btnCompleteOrder.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        btnCompleteOrder.setForeground(new java.awt.Color(255, 153, 0));
        btnCompleteOrder.setText("Complete Order");
        btnCompleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteOrderActionPerformed(evt);
            }
        });

        cancelMessage.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        cancelMessage.setForeground(new java.awt.Color(255, 153, 0));
        cancelMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelMessageActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 153, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(218, 218, 218)
                                    .addComponent(refreshTestJButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnCancelOrder)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnConfirmOrder)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCompleteOrder)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBack)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 173, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refreshTestJButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelOrder)
                    .addComponent(btnConfirmOrder)
                    .addComponent(btnCompleteOrder))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        // TODO add your handling code here:
       StoreOrder order = null;
      int row = TblOrderHistory.getSelectedRow();
       if(row < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        order = (StoreOrder)TblOrderHistory.getValueAt(row, 0); 
        order.setStatus("CANCELED");
        order.setMessage(cancelMessage.getText()); 
        JOptionPane.showMessageDialog(null, "Order has been canceled. ", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateOrderHistoryTable();
    }//GEN-LAST:event_btnCancelOrderActionPerformed
    void populateOrderHistoryTable(){
        DefaultTableModel model = (DefaultTableModel) TblOrderHistory.getModel();
        model.setRowCount(0);
        for(StoreOrder order : enterprise.getOrderList()){
                Object[] row = new Object[4];
                row[0] = order;  
                row[1] = order.getRequestDate().toString(); 
                row[2] = order.getStatus();
                row[3] = order.getMessage(); 
                model.addRow(row);
            
        }
    }
    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateOrderHistoryTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnConfirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmOrderActionPerformed
       StoreOrder order = null;
       int row = TblOrderHistory.getSelectedRow();
       if(row < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        order = (StoreOrder)TblOrderHistory.getValueAt(row, 0); 
        order.setStatus("CONFIRMED");
        order.setMessage(cancelMessage.getText()); 
        JOptionPane.showMessageDialog(null, "Order has been confirmed. ", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateOrderHistoryTable();
    }//GEN-LAST:event_btnConfirmOrderActionPerformed

    private void btnCompleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteOrderActionPerformed
        // TODO add your handling code here:
          StoreOrder order = null;
       int row = TblOrderHistory.getSelectedRow();
       if(row < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        order = (StoreOrder)TblOrderHistory.getValueAt(row, 0); 
        order.setStatus("COMPLETED");
        order.setMessage(cancelMessage.getText()); 
        JOptionPane.showMessageDialog(null, "Order has been completed. ", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateOrderHistoryTable();
    }//GEN-LAST:event_btnCompleteOrderActionPerformed

    private void cancelMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelMessageActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblOrderHistory;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnCompleteOrder;
    private javax.swing.JButton btnConfirmOrder;
    private javax.swing.JTextField cancelMessage;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
