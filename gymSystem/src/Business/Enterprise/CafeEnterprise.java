/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.MenuItem;
import Business.Role.Role;
import Business.WorkQueue.CafeOrder;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class CafeEnterprise extends Enterprise {
    private ArrayList<MenuItem> menuItems;
    private ArrayList<CafeOrder> orderList; 
    public CafeEnterprise(String name){
        super(name,EnterpriseType.Cafe);
          menuItems = new ArrayList<MenuItem>();
          orderList = new ArrayList<CafeOrder>();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    public void setOrderList(ArrayList<CafeOrder> orderList){
        this.orderList = orderList;
    }
    public ArrayList<CafeOrder> getCafeOrderList(){
        return orderList;
    }
}
