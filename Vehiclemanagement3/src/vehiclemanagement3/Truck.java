package vehiclemanagement3;

public class Truck extends Vehicle {

    private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, String name, double regularPrice, double speed) {
        super(name, regularPrice, speed);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getsalePrice() {
        if (this.weight > 2000) {
            return super.getRegularPrice() - super.getRegularPrice() * .10;
        } else {
            return super.getRegularPrice();
        }
    }

}
