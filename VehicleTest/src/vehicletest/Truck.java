
package vehicletest;


public class Truck extends Vehile{
    private double weight;

    public Truck() {
    }

    public Truck(double weight) {
        this.weight = weight;
    }

    public Truck(double weight, String name, double regularPrice, double speed) {
        super(name, regularPrice, speed);
        this.weight = weight;
    }

    @Override
    public double getsalePrice() {
        if(this.weight>2000){
        return super.getRegularPrice()-super.getRegularPrice()*.10;
        }else{
        return super.getRegularPrice();
        
        }
    }
    
    
    
    
    
    
    
}
