
package vehicle;

public class Truck extends Vehicle{
  private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int price, double getprice, String color) {
        super(price, getprice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getsalseprice() {
       
    }
  
  
  
    
}
