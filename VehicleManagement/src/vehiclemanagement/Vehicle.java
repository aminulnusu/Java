
package vehiclemanagement;


public class Vehicle {
   private String color;
   private double getRegularPrice;
   private double speed;

    public Vehicle() {
    }

    public Vehicle(String color, double getRegularPrice, double speed) {
        this.color = color;
        this.getRegularPrice = getRegularPrice;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGetRegularPrice() {
        return getRegularPrice;
    }

    public void setGetRegularPrice(double getRegularPrice) {
        this.getRegularPrice = getRegularPrice;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
   public double getSalePrice(){
   return getGetRegularPrice();
   }
   
    
    
}
