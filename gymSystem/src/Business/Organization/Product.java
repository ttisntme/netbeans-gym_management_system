/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Enterprise.StoreEnterprise;

/**
 *
 * @author bao.sha
 */
public class Product {
    StoreEnterprise enterprise; 
    String name;
    double price;
    public Product(StoreEnterprise storeEnterprise, String name){
        this.enterprise = storeEnterprise; 
        this.name = name; 
    }
    public void setProductPrice(double price){
        this.price = price; 
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price; 
    }
     public StoreEnterprise getStoreEnterprise(){
        return enterprise;
    }
    @Override
    public String toString(){
        return name;
    }
}
