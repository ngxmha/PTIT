package J07049;

public class Product {
    
    private String id;
    private String name;
    private int price;
    private int guarantee;

    public Product(String id, String name, int price, int guarantee) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.guarantee = guarantee;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getGuarantee() {
        return guarantee;
    }
    
}
