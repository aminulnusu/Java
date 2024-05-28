
package testvehicle;


public class Truck extends Vehicle{
    
    private double weight;

    public Truck() {
    }

    public Truck(double weight) {
        this.weight = weight;
    }

    public Truck(double weight, String color, double getRegularPrice, double speed) {
        super(color, getRegularPrice, speed);
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
      return super.getGetRegularPrice()-super.getGetRegularPrice()*.10;
      
      }else{
      
      return  super.getGetRegularPrice();
      }
    }
    
    
    
    
    
}
