
package vehicle;

public class Vehicle {
    private int price;
    private double getprice;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int price, double getprice, String color) {
        this.price = price;
        this.getprice = getprice;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getGetprice() {
        return getprice;
    }

    public void setGetprice(double getprice) {
        this.getprice = getprice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getsalseprice(){
    return getprice;
    }
    
}
