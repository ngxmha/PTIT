package J07048;

public class Product {
    private String id, name;
    private int price, guarantee;

    public Product(String id, String name, int price, int guarantee) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.guarantee = guarantee;
    }
    
    public int getPrice(){
        return price;
    }
    
    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + guarantee;
    }
        
}
