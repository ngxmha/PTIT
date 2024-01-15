package J05052;

public class Product {

    private String name;
    private String id;
    private int unitPrice;
    private int quantity;

    public Product(String name, String id, int unitPrice, int quantity) {
        this.name = name;
        this.id = id;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
   

    public char getType() {
        if (this.id.endsWith("1")) {
            return '1';
        }
        return '2';
    }

    public String getSTT() {
        return this.id.substring(1, 4);
    }

    public int getSale() {
        if(getType() == '1') {
            return (int)(0.5 * this.unitPrice * this.quantity);
        }
        return (int)(0.3 * this.unitPrice * this.quantity);
    }
    
    public int getTotal() {
        return this.unitPrice * this.quantity - getSale();
    }
    
    @Override
    public String toString() {
        return this.name + " " + this.id + " " + getSTT() + " " + getSale() + " " + getTotal();
    }

}
