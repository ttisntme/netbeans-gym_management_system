/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SellingStaffRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SellingStaffOrganization extends Organization{

    public SellingStaffOrganization() {
        super(Organization.Type.SellingStaff.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SellingStaffRole());
        return roles;
    }
     
}