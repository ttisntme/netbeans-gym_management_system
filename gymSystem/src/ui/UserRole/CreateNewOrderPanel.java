/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.UserRole;

import Business.Enterprise.CafeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.MenuItem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CafeOrder;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CreateNewOrderPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise; 
    private ArrayList<CafeEnterprise> cafeList; 
    private UserAccount userAccount;
    private CafeOrder tempOrder; 
    private CafeEnterprise cafeEnterprise;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public CreateNewOrderPanel(JPanel userProcessContainer, Enterprise enterprise, ArrayList<CafeEnterprise> cafeList, UserAccount userAccount) {
        initComponents();   
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise; 
        this.cafeList = cafeList;
        this.userAccount = userAccount;
         populateSelectionCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGo = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        cmbSelection = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderItems = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMenuItems = new javax.swing.JTable();
        btnAddToOrder1 = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        btnCreateOrder1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGo.setBackground(new java.awt.Color(204, 204, 255));
        btnGo.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        btnGo.setForeground(new java.awt.Color(255, 153, 0));
        btnGo.setText("Go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, 30));

        backJButton.setBackground(new java.awt.Color(204, 204, 255));
        backJButton.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 153, 0));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 110, 40));

        valueLabel.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(0, 204, 204));
        valueLabel.setText("Select Cafe");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 150, 30));

        enterpriseLabel.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 204, 204));
        enterpriseLabel.setText("Price Total:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 150, 20));

        cmbSelection.setBackground(new java.awt.Color(204, 204, 255));
        cmbSelection.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        cmbSelection.setForeground(new java.awt.Color(255, 153, 0));
        cmbSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectionActionPerformed(evt);
            }
        });
        add(cmbSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 140, -1));

        tblOrderItems.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        tblOrderItems.setForeground(new java.awt.Color(255, 153, 0));
        tblOrderItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Menu Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrderItems);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 230, 220));

        tblMenuItems.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        tblMenuItems.setForeground(new java.awt.Color(255, 153, 0));
        tblMenuItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Menu Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMenuItems);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 290, 220));

        btnAddToOrder1.setBackground(new java.awt.Color(204, 204, 255));
        btnAddToOrder1.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        btnAddToOrder1.setForeground(new java.awt.Color(255, 153, 0));
        btnAddToOrder1.setText("Add to Order");
        btnAddToOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToOrder1ActionPerformed(evt);
            }
        });
        add(btnAddToOrder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, 50));

        enterpriseLabel1.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(0, 204, 204));
        enterpriseLabel1.setText("Create Order:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 190, 40));

        btnCreateOrder1.setBackground(new java.awt.Color(204, 204, 255));
        btnCreateOrder1.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        btnCreateOrder1.setForeground(new java.awt.Color(255, 153, 0));
        btnCreateOrder1.setText("Create Order");
        btnCreateOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrder1ActionPerformed(evt);
            }
        });
        add(btnCreateOrder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, 50));
    }// </editor-fold>//GEN-END:initComponents
    private void populateSelectionCombo(){
         cmbSelection.removeAllItems();
         for(CafeEnterprise cafe : cafeList){
             cmbSelection.addItem(cafe.getName()); 
         }
    }
    private void populateRestaurantMenu(CafeEnterprise cafeEnterprise){
        DefaultTableModel model = (DefaultTableModel) tblMenuItems.getModel();
        model.setRowCount(0);
        for(MenuItem menuItem : cafeEnterprise.getMenuItems()){
            Object[] row = new Object[2]; 
            row[0] = menuItem; 
            row[1] = menuItem.getPrice(); 
            model.addRow(row);
        }
    }
    private void populateOrderItems(){
        DefaultTableModel model = (DefaultTableModel) tblOrderItems.getModel(); 
        model.setRowCount(0); 
        for(MenuItem menuItem : tempOrder.getOrderItems()){
            Object[] row = new Object[2]; 
            row[0] = menuItem; 
            row[1] = menuItem.getPrice(); 
            model.addRow(row);
        }
    }
    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        String name = String.valueOf(cmbSelection.getSelectedItem());
        CafeEnterprise cafe = null;  
        DefaultTableModel model = (DefaultTableModel) tblOrderItems.getModel(); 
        model.setRowCount(0); 
        for (CafeEnterprise c : cafeList)
        {
            if(c.getName().equals(name)){
                cafe = c;
                break;
            }
        }  
        if(cafe != null){
            populateRestaurantMenu(cafe);
            this.cafeEnterprise = cafe; 
        }
        tempOrder = new CafeOrder(cafe, new ArrayList<MenuItem>());
        
    }//GEN-LAST:event_btnGoActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        UserWorkAreaJPanel dwjp = (UserWorkAreaJPanel) component;
        dwjp.populateOrderHistoryTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void cmbSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectionActionPerformed

    private void btnAddToOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToOrder1ActionPerformed
        // TODO add your handling code here:
         int row = tblMenuItems.getSelectedRow();
       if(row < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        MenuItem menuItem = (MenuItem) tblMenuItems.getValueAt(row, 0);
        tempOrder.getOrderItems().add(menuItem);
        double sum = 0;
        for(MenuItem mi : tempOrder.getOrderItems()){
            sum += mi.getPrice();
        }
        enterpriseLabel.setText("Price Total: " + sum);
        populateOrderItems();
    }//GEN-LAST:event_btnAddToOrder1ActionPerformed

    private void btnCreateOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrder1ActionPerformed
        // TODO add your handling code here:
        tempOrder.setRequestDate(new Date(System.currentTimeMillis()));
        tempOrder.setStatus("CREATED");
        tempOrder.setMessage("PROCESSING");
        userAccount.getWorkQueue().addWorkRequest(tempOrder);
        if(cafeEnterprise.getCafeOrderList() == null){
            cafeEnterprise.setOrderList(new ArrayList<CafeOrder>());
        }
        ArrayList<CafeOrder> orderList = cafeEnterprise.getCafeOrderList(); 
        orderList.add(tempOrder); 
        cafeEnterprise.setOrderList(orderList);
        JOptionPane.showMessageDialog(null, "Order has been created, please wait for the response from Cafe Admin.", "Information", JOptionPane.INFORMATION_MESSAGE);
        DefaultTableModel model = (DefaultTableModel) tblOrderItems.getModel(); 
        model.setRowCount(0);
        model = (DefaultTableModel) tblMenuItems.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnCreateOrder1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAddToOrder1;
    private javax.swing.JButton btnCreateOrder1;
    private javax.swing.JButton btnGo;
    private javax.swing.JComboBox<String> cmbSelection;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMenuItems;
    private javax.swing.JTable tblOrderItems;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
