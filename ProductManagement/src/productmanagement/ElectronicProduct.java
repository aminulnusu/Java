
package productmanagement;


public class ElectronicProduct extends Product{
    
    private int warrantyPeriode;

    public ElectronicProduct() {
    }

    public ElectronicProduct(int warrantyPeriode) {
        this.warrantyPeriode = warrantyPeriode;
    }

    public ElectronicProduct(int warrantyPeriode, String name, double regularPrice) {
        super(name, regularPrice);
        this.warrantyPeriode = warrantyPeriode;
    }

    public int getWarrantyPeriode() {
        return warrantyPeriode;
    }

    public void setWarrantyPeriode(int warrantyPeriode) {
        this.warrantyPeriode = warrantyPeriode;
    }

    @Override
    public double getSalePrice() {
        if(this.warrantyPeriode>1){
        return super.getRegularPrice()- super.getRegularPrice()*.15;
        }else{
        return super.getRegularPrice();
        }
        
    }
    
    
    
    
}
