
package day3.excersice2;


class Item {

    String name;
    int id;
    double price;
    double amount;
    int qty;
    
    public Item(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public int getQty(int qty) {
        return qty;
    }
    
}
