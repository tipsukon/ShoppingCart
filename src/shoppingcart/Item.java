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
public class Item {
    
    public String name;
    public double price;
    public int quality;
  


    public Item(String name, double price, int quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
        }
    
    public String toString() {
        return "name= " + name;
    }
    
}
