
package vehiclemanagement3;


public class Vehicle {
    private String name; 
    private double regularPrice; 
    private double speed; 

    public Vehicle() {
    }

    public Vehicle(String name, double regularPrice, double speed) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

 
    
    public double getsalePrice(){
    return getRegularPrice();
    
    }
    
    
    
}
