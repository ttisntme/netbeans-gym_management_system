/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ManufacturerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.ManufacturerRole.ManufacturerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class ManufacturerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ManufacturerWorkAreaJPanel(userProcessContainer, account, (ManufacturerOrganization)organization, enterprise);
    }
    
    
}
