/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.StoreAdminRole;


import ui.CafeAdminRole.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.CafeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.StoreEnterprise;
import Business.Organization.MenuItem;
import Business.Organization.Product;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageProductsPanel extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private StoreEnterprise enterprise; 

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageProductsPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = (StoreEnterprise) enterprise; 
        if(this.enterprise.getProducts() == null){
            this.enterprise.setProducts(new ArrayList<Product>());
        }
        populateTable();
    }
    
      private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblMenuItems.getModel();
        model.setRowCount(0);    
          for(Product product : enterprise.getProducts()){
               Object[] row = new Object[2]; 
            row[0] = product; 
            row[1] = product.getPrice(); 
            model.addRow(row);
          }
      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenuItems = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtItemPrice = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        lblCreateUser = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 153, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblMenuItems.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        tblMenuItems.setForeground(new java.awt.Color(0, 204, 204));
        tblMenuItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Product Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblMenuItems);

        lblTitle.setFont(new java.awt.Font("Monaco", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 204, 204));
        lblTitle.setText("Manage Product");

        btnDelete.setBackground(new java.awt.Color(204, 204, 255));
        btnDelete.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 153, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 204, 204));
        lblUserName.setText("Product Name:");

        lblPassword.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 204, 204));
        lblPassword.setText("Price:");

        btnAddItem.setBackground(new java.awt.Color(204, 204, 255));
        btnAddItem.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        btnAddItem.setForeground(new java.awt.Color(255, 153, 0));
        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        lblCreateUser.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        lblCreateUser.setForeground(new java.awt.Color(255, 153, 0));
        lblCreateUser.setText("Add Product:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCreateUser)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserName)
                                    .addComponent(lblPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddItem))))))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblTitle)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnDelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCreateUser)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName)
                            .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddItem)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
       int row = tblMenuItems.getSelectedRow();
       if(row < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
       Product product = (Product) tblMenuItems.getValueAt(row, 0);
       for (Product p : enterprise.getProducts()){
           if(product.equals(p)){
               enterprise.getProducts().remove(p);
               break;
           }
       }
       JOptionPane.showMessageDialog(this, "Selected product has been deleted.", "Information", JOptionPane.INFORMATION_MESSAGE);
       populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed
    private boolean isValidDouble(String s){
            boolean isValidDouble = false;
          try
          {
             Double.parseDouble(s);
             isValidDouble = true;
          }
          catch (NumberFormatException ex)
          {
             // s is not an integer
          }
          return isValidDouble;
        }
    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
       String itemName = txtItemName.getText(); 
       String price = txtItemPrice.getText(); 
       ArrayList<Product> products = enterprise.getProducts(); 
        if (itemName.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the missing product information.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!isValidDouble(price)){
             JOptionPane.showMessageDialog(this, "Please provide a valid number for the product price.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product product = new Product(enterprise , itemName); 
        product.setProductPrice(Double.valueOf(price));
        products.add(product); 
        populateTable();
    }//GEN-LAST:event_btnAddItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateUser;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblMenuItems;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemPrice;
    // End of variables declaration//GEN-END:variables
}