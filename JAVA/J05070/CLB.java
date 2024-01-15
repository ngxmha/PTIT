package J05070;

public class CLB {
    
    private String id;
    private String name;
    private int price;

    public CLB() {
    }

    public CLB(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public String getId() {
        return this.id;
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public String getName() {
        return this.name;
    }
    
}
