/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CafeStaffRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class CafeStaffOrganization extends Organization{

    public CafeStaffOrganization() {
        super(Organization.Type.CafeStaff.getValue());    
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CafeStaffRole());
        return roles;
    }
    
}