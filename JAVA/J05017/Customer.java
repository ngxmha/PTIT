package J05017;

public class Customer implements Comparable<Customer> {
    
    private static int quantity = 1;
    
    private String id;
    private String name;
    private int oldIndex;
    private int newIndex;

    public Customer(String name, int oldIndex, int newIndex) {
        this.id = "KH" + String.format("%02d", quantity++);
        this.name = name;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }
    
    public int getTotal() {
        double V = newIndex - oldIndex;
        double total = 0;
        if(V >= 0 && V <= 50) {
            total = V * 100;
            total = total + total * 0.02;
        }
        else if(V <= 100) {
            total =  50 * 100 + (V - 50) * 150;
            total = total + total * 0.03;
        }
        else {
            total = 50 * 250 + (V - 100) * 200;
            total = total + total * 0.05; 
        }
        return (int)Math.round(total);
    }
    
    @Override
    public int compareTo(Customer c) {
        return c.getTotal() - getTotal();
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + getTotal();
    }
    
}
