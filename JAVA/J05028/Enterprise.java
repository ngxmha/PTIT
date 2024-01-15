package J05028;

public class Enterprise {
    
    private String id;
    private String name;
    private int quantity;

    public Enterprise(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getId() {
        return this.id;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + quantity;
    }
}
