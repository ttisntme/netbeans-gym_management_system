/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FoodSupplierRole;
import Business.Role.Role;
import Business.WorkQueue.FoodOrder;
import java.util.ArrayList;

/**
 *
 * @author Shaojun Bao
 */
public class FoodSupplierOrganization extends Organization{
    private ArrayList<FoodItem> foodItems; 
    private ArrayList<FoodOrder> foodOrders;
    public FoodSupplierOrganization() {
        super(Organization.Type.FoodSupplier.getValue());
         foodItems = new ArrayList<FoodItem>();
         foodOrders = new ArrayList<FoodOrder>(); 
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodSupplierRole());
        return roles;
    }

    public ArrayList<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    public ArrayList<FoodOrder> getFoodOrders() {
        return foodOrders;
    }

    public void setFoodOrders(ArrayList<FoodOrder> foodOrders) {
        this.foodOrders = foodOrders;
    }
    
}

// This code is for the foodsupplier work request