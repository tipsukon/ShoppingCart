//Test

package day3;

public abstract class Cloth {
    private double price;
    private char size;
    private String type;
    private String MM;
    
//    protected String factoryName;
    
//    public char shape;
//polo
    public char color;
    
    public double sellPrice(){
        return getPrice() * getCost();
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getType(){
        return type;
    }
//    public abstract double getPrice();
    public abstract double getCost();
    
    public Cloth(double price, char size, String type){
        this.price = price;
        this.size = size;
        this.type = type;
        
//        if (type.equals("shirt")) {
//            this.shape = shape;
//        } 
    }
    
    public static void main(String[] args){
        
//        Shirt shirt = new Shirt(10, 'M','0');
//        System.out.println("This Shirt price is"+ shirt.getPrice());

        Cloth c1 = new Shirt(10,'M','0');
        c1.displaySellPrice();
                
        Cloth c2 = new Polo(40,'M','R');
        c2.displaySellPrice();        
    }
    
    public void displaySellPrice() {
        System.out.println("This cloth is a "+ getType() + " sell price = " + sellPrice());
    }
}
