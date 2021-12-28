/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.SellingStaff.getValue())){
            organization = new SellingStaffOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Manufacturer.getValue())){
            organization = new ManufacturerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.FoodSupplier.getValue())){
            organization = new FoodSupplierOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Transport.getValue())){
            organization = new TransportOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.CafeStaff.getValue())){
            organization = new CafeStaffOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.CoachStaff.getValue())){
            organization = new CoachStaffOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.CoachTrainer.getValue())){
            organization = new CoachTrainerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.User.getValue())){
            organization = new UserOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}