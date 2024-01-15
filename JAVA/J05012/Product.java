package J05012;

public class Product implements Comparable<Product> {
    
    private String id;
    private String name;
    private int quantity;
    private long unitPrice;
    private int chietKhau;

    public Product(String id, String name, int quantity, long unitPrice, int chietKhau) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.chietKhau = chietKhau;
    }
    
    public long getTotal() {
        return quantity * unitPrice - chietKhau;
    }
    
    @Override
    public int compareTo(Product p) {
        return getTotal() > p.getTotal() ? -1 : 1;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + quantity + " " + unitPrice + " " + chietKhau + " " + getTotal();
    }
    
}
