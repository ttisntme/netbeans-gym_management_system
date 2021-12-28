/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Product;
import Business.Role.Role;
import Business.WorkQueue.CafeOrder;
import Business.WorkQueue.StoreOrder;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class StoreEnterprise extends Enterprise {
    
   private ArrayList<Product> products;
    private ArrayList<StoreOrder> orderList; 
    public StoreEnterprise(String name){
        super(name,EnterpriseType.Store);
         products = new ArrayList<Product>();
         orderList = new ArrayList<StoreOrder>();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<StoreOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<StoreOrder> orderList) {
        this.orderList = orderList;
    }
    
}
