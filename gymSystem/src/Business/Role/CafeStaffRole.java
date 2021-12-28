/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CafeStaffOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.CafeStaffRole.CafeStaffWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class CafeStaffRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CafeStaffWorkAreaJPanel(userProcessContainer, account, (CafeStaffOrganization)organization, enterprise);
    }
    
    
}
