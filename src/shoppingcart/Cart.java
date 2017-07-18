/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author ARIT
 */
public class Cart {
    Item[] items;
    double total;
    
    public Cart() {
        items = new Item[5];
    }
    
    public void addItem(Item item){
        //Insert item in to items
        //items[items.length] = item;
        for(int i = 0; i < items.length; i++){
            if (items[i] == null){
                items[i] = item;
                break;
            }
        }
    }
    
    public void removeItem(Item item){
        
    }
    
    public double checkoutItem(){
        double totalPrice = 0.0;
        for (Item i:items){
            if (i != null){
                totalPrice = i.price+totalPrice;
            }
        }
        
        return totalPrice;
    }
}
