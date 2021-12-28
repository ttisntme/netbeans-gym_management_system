/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.CafeEnterprise;
import Business.Organization.MenuItem;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class CafeOrder extends WorkRequest{
    private CafeEnterprise cafeEnterprise; 
    private ArrayList<MenuItem> orderItems;
    public CafeOrder(CafeEnterprise cafeEnterprise, ArrayList<MenuItem> orderItems){
        this.cafeEnterprise = cafeEnterprise; 
        this.orderItems = orderItems; 
    }
    public CafeEnterprise getCafeEnterprise() {
        return cafeEnterprise;
    }

    public void setCafeEnterprise(CafeEnterprise cafeEnterprise) {
        this.cafeEnterprise = cafeEnterprise;
    }

    public ArrayList<MenuItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<MenuItem> orderItems) {
        this.orderItems = orderItems;
    }
    
    @Override
    public String toString(){
        String orders = ""; 
        for(MenuItem menuItem : orderItems){
            orders += ", " + menuItem.getName(); 
        }
        return orders; 
    }
}
