package J07038;

public class Enterprise {
    
    private String id;
    private String name;
    private int quantity;
    private int limit;

    public Enterprise(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.limit = 0;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }
    
}
