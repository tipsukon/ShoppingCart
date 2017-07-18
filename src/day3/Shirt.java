
package day3;

public class Shirt extends Cloth{
    
    char shape;
    
//    public double getPrice(){
//        return price*10;
//    }
    
    public Shirt(double price, char size, char shape) {
        this(price, size, "shirt", shape);
    }
    
    private Shirt(double price, char size, String type, char shape){
        super(price, size, type);
        this.shape = shape;
        
    }
    @Override
    public double getCost(){
        return 10;
    }
}
