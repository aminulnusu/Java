
package vehiclemanagemnt;


public class Truck extends Vehicle{
    
   private double weight;

    public Truck() {
    }

    public Truck(double weight) {
        this.weight = weight;
    }

    public Truck(double weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if(this.weight>2000){
        return super.getRegularPrice()-super.getRegularPrice()*.10;
        }
        
        else{
        return super.getRegularPrice();
        }
    }
   
   
  
    
   
        
        
    
    
    
    
    
    
    
}
