package J05037;

public class Product {
    
    static int num = 1;
    
    private String id;  
    private String name;
    private String unit;
    private int unitPriceIn;
    private int quantity;

    public Product(String name, String unit, int unitPriceIn, int quantity) {
        this.id = "MH" + String.format("%02d", num++);
        this.name = name;
        this.unit = unit;
        this.unitPriceIn = unitPriceIn;
        this.quantity = quantity;
    }
    
    public int getTranferFee() {
        return (int)Math.ceil(this.unitPriceIn * this.quantity * 0.05);
    }
    
    public int getMoney() {
        return (int)Math.ceil(this.unitPriceIn * this.quantity + getTranferFee());
    }
    
    public int getSellPrice() {
        return (int)Math.ceil(getMoney() * 1.02f / this.quantity / 100) * 100;
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.unit + " " + getTranferFee() + " " + getMoney() + " " + getSellPrice();
    }
    
}
