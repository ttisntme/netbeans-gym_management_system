

package ui.CafeAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class CafeAdminWorkAreaJPanel extends javax.swing.JPanel {
    UserAccount userAccount;
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem business;
    /** Creates new form AdminWorkAreaJPanel */
    public CafeAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount; 
        this.business = business; 
        valueLabel.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnManageCafeMenu = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        btnOrderFromFoodSupplier = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Cafe Admin Role Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 360, -1));

        btnManageCafeMenu.setBackground(new java.awt.Color(204, 204, 255));
        btnManageCafeMenu.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnManageCafeMenu.setForeground(new java.awt.Color(255, 153, 0));
        btnManageCafeMenu.setText("Manage Cafe Menu");
        btnManageCafeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCafeMenuActionPerformed(evt);
            }
        });
        add(btnManageCafeMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 360, -1));

        manageEmployeeJButton.setBackground(new java.awt.Color(204, 204, 255));
        manageEmployeeJButton.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(255, 153, 0));
        manageEmployeeJButton.setText("Manage Employee & Work Partner");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 360, -1));

        manageOrganizationJButton.setBackground(new java.awt.Color(204, 204, 255));
        manageOrganizationJButton.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 153, 0));
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 360, -1));

        enterpriseLabel.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 204, 255));
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 160, 30));

        valueLabel.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 153, 0));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 130, -1));

        userJButton.setBackground(new java.awt.Color(204, 204, 255));
        userJButton.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        userJButton.setForeground(new java.awt.Color(255, 153, 0));
        userJButton.setText("Manage User");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 360, -1));

        btnOrderFromFoodSupplier.setBackground(new java.awt.Color(204, 204, 255));
        btnOrderFromFoodSupplier.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnOrderFromFoodSupplier.setForeground(new java.awt.Color(255, 153, 0));
        btnOrderFromFoodSupplier.setText("Order From Food Supplier");
        btnOrderFromFoodSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderFromFoodSupplierActionPerformed(evt);
            }
        });
        add(btnOrderFromFoodSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 360, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss/cafe2.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 350, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCafeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCafeMenuActionPerformed
        // TODO add your handling code here:
        ManageMenuItemsPanel mmijp = new ManageMenuItemsPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel",  mmijp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCafeMenuActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void btnOrderFromFoodSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderFromFoodSupplierActionPerformed
        // TODO add your handling code here:
        ViewFoodOrdersJPanel muajp = new ViewFoodOrdersJPanel(userProcessContainer, userAccount, enterprise,business);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrderFromFoodSupplierActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCafeMenu;
    private javax.swing.JButton btnOrderFromFoodSupplier;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
