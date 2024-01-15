package J05076;

public class Product_Type {
    
    private String id;
    private String name;
    private char type;

    public Product_Type(String id, String name, char type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public char getType() {
        return this.type;
    }
}
