/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CoachTrainerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class CoachTrainerOrganization extends Organization{

    public CoachTrainerOrganization() {
        super(Organization.Type.CoachTrainer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CoachTrainerRole());
        return roles;
    }
     
}