
package day3.excersice2;

import java.util.ArrayList;
import java.util.Scanner;

class OnlineShoppingStore {
    ArrayList<Item> items;
    ArrayList<Item> shoppingCart;
    
    public OnlineShoppingStore(){
        items = new ArrayList<>();
        shoppingCart = new ArrayList<>();
     
//        Item clock = new Item();
//        clock.id = 1;
//        clock.name = "Clock";
//        clock.price = 40;
    
//        public Item(double price, char size, String type){
        
        items.add(new ClockItem(1,10));
        items.add(new ChairItem(2,40));
        items.add(new CalculatorItem(3,20));
//        items.add(id);
//        items.add(price);
    }
    
    public void getInputFromCustomer() {
    String input;
        do{
            askCustomerToBuy();
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            for (Item item : items) {
                if (Integer.valueOf(input) == item.id) {
                    System.out.println("What amount of " + item.name + " ?");
                    input = sc.nextLine();
                    int amount = Integer.valueOf(input);
                    item.setQty(amount);
                    shoppingCart.add(item);
                    break;
                }
            }
         System.out.println("Do you want to continue shopping (y/n) ?");
         input = sc.nextLine();
        }while (input.equalsIgnoreCase("y"));
        
        double getTotal = 0;
        
        if (shoppingCart.size() > 0) {
            System.out.println("Thank you for shopping, you have " + shoppingCart.size() + " item in shopping cart, pls checkout");
            for (Item item : shoppingCart){
                System.out.println(item.id + ":" + item.name + " amount = " + item.qty);
                getTotal = getTotal + (item.qty * item.price);
                
            }
            System.out.println("Total Amount : " + getTotal );
            
        }
    }

    void showItems() {
//        System.out.println("What would you like to buy? : ");
        for (Item item: items) {
            System.out.println(item.id + ":" + item.name + "(" + item.price + ")");
        }
        
    }

    private void askCustomerToBuy() {
        System.out.println("What would you like to buy? : ");
    }

    
}
