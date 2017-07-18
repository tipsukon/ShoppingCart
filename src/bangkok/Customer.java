/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangkok;

import shoppingcart.Cart;
/**
 *
 * @author ARIT
 */
public class Customer {
    String name;
    public int money;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
        }
    
    public void pay(Cart cart){
System.out.println("Total price :" + cart.checkoutItem());
System.out.println("เงินเหลือ : " + (money-cart.checkoutItem()));
    }
    
}
