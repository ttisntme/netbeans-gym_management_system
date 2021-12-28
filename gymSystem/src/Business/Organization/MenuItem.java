/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Enterprise.CafeEnterprise;

/**
 *
 * @author bao.sha
 */
public class MenuItem {
    CafeEnterprise cafeEnterprise;
    String name;
    double price;
    public MenuItem(CafeEnterprise cafeEnterprise, String name){
        this.cafeEnterprise = cafeEnterprise; 
        this.name = name; 
    }
    public void setMenuItemPrice(double price){
        this.price = price; 
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price; 
    }
    public CafeEnterprise getCafeEnterprise(){
        return cafeEnterprise;
    }
    @Override
    public String toString(){
        return name;
    }
}
