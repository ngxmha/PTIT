package J07037;

public class Enterprise {
    private String id, name;
    private int quantity;

    public Enterprise(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getId(){
        return id;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + quantity;
    }
}
