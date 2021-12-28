/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Enterprise.StoreEnterprise;
import Business.Organization.Product;
import java.util.ArrayList;

/**
 *
 * @author bao.sha
 */
public class StoreOrder extends WorkRequest{
    private StoreEnterprise storeEnterprise; 
    private ArrayList<Product> orderItems;
    public StoreOrder(StoreEnterprise storeEnterprise, ArrayList<Product> products){
        this.storeEnterprise = storeEnterprise; 
        this.orderItems = products; 
    }
    public StoreEnterprise getStoreEnterprise() {
        return storeEnterprise;
    }

    public void setStoreEnterprise(StoreEnterprise storeEnterprise) {
        this.storeEnterprise = storeEnterprise;
    }
     public ArrayList<Product> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<Product> orderItems) {
        this.orderItems = orderItems;
    }
    
        @Override
    public String toString(){
        String orders = ""; 
        for(Product productItem : orderItems){
            orders += ", " + productItem.getName(); 
        }
        return orders; 
    }
}
