package J05010;

public class Product {
    static int num = 1;
    
    private int id;
    private String name, group;
    private double purchase, price;

    public Product(String name, String group, double purchase, double price) {
        id = num++;
        this.name = name;
        this.group = group;
        this.purchase = purchase;
        this.price = price;
    }
    
    public double getProfit(){
        return price - purchase;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + String.format("%.2f", getProfit());
    }
       
}
