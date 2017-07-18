/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import shoppingcart.Cart;
import shoppingcart.Item;
import bangkok.Customer;
/**
 *
 * @author ARIT
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item[] items = new Item[4];
        
        items[0] =  new Item("shirt",20,10);
        items[1] =  new Item("polo",10,10);
        items[2] =  new Item("plant",10,10);
        items[3] =  new Item("polo2",5,10);

        Customer customer1 = new Customer("A",100);
        
        Cart cart = new Cart();
        cart.addItem(items[0]);
        cart.addItem(items[1]);
        
        customer1.pay(cart);
        
                
        
//        items[0] =  new Item();
//        items[0].name = "Shrit";
//        items[0].price = 20.0;
//        items[0].quality = 10;

//        item.name = "Shrit"
//        item.price = 20.0;
//        item.quality = 20;
        
    }
    
}
