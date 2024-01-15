package J05036;

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
        return Math.round((this.unitPriceIn * this.quantity) * 0.05f);
    }
    
    public int getMoney() {
        return  Math.round(this.unitPriceIn * this.quantity + getTranferFee() * 1f);
    }
    
    public int getSellPrice() {
        return Math.round(getMoney() * 1.02f);
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.unit + " " + getTranferFee() + " " + getMoney() + " " + getSellPrice();
    }
    
}
