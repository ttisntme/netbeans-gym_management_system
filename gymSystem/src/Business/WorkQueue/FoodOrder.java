/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Organization.FoodItem;
import Business.Organization.FoodSupplierOrganization;
import java.util.ArrayList;

/**
 *
 * @author bao.sha
 */
public class FoodOrder extends WorkRequest{
    private FoodSupplierOrganization foodSupplierOrganization;  
    private ArrayList<FoodItem> orderItems;
    public FoodOrder(FoodSupplierOrganization foodSupplierOrganization, ArrayList<FoodItem> foodItems){
        this.foodSupplierOrganization = foodSupplierOrganization; 
        this.orderItems = foodItems; 
    }
    public FoodSupplierOrganization getFoodSupplierOrganization() {
        return foodSupplierOrganization;
    }

    public void setFoodSupplierOrganization(FoodSupplierOrganization foodSupplierOrganization) {
        this.foodSupplierOrganization = foodSupplierOrganization; 
    }

    public ArrayList<FoodItem> getFoodItems() {
        return orderItems;
    }

    public void setFoodItems(ArrayList<FoodItem> foodItems) {
        this.orderItems = foodItems;
    }
    
    @Override
    public String toString(){
        String orders = ""; 
        for(FoodItem foodItem : orderItems){
            orders += ", " + foodItem.getName(); 
        }
        return orders; 
    }
}
