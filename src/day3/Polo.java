
package day3;


public class Polo extends Cloth{
    
    char color;

    public Polo(double price, char size, char color) {
        this(price, size, "Polo", color);
    }
    
    private Polo(double price, char size, String type, char color){
        super(price, size, type);
        this.color = color;
    }
 @Override
    public double getCost(){
        return 10;
    }
}
