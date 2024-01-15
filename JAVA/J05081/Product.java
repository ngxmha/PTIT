package J05081;

public class Product {
    private static byte num = 1; 
            
    private String id, name, unit;
    private int priceBuy, priceSell;

    public int getProfit(){
        return priceSell - priceBuy;
    }
    
    public String getId(){
        return id;
    }
    
    public Product(String name, String unit, int priceBuy, int priceSell) {
        id = "MH" + String.format("%03d", num++);
        this.name = name;
        this.unit = unit;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + priceBuy + " " + priceSell + " " + getProfit();
    }   
}
