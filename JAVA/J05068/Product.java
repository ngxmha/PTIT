package J05068;

public class Product {
    
    private String id;
    private int quantity;

    public Product(String id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }
    
    public String getManufacturer() {
        if(this.id.endsWith("BP")) {
            return "British Petro";
        } else if(this.id.endsWith("ES")) {
            return "Esso";
        } else if(this.id.endsWith("SH")) {
            return "Shell";
        } else if(this.id.endsWith("CA")) {
            return "Castrol";
        } else if(this.id.endsWith("MO")) {
            return "Mobil";
        }
        return "Trong Nuoc";
    }
    
    public int getUnitPrice() {
        if(this.id.charAt(0) == 'X') {
            return 128000;
        } else if(this.id.charAt(0) == 'D') {
            return 11200;
        }
        return 9700;
    }
    
    public long getMoney() {
        return 1l * this.quantity * getUnitPrice();
    }
    
    public int getFax() {
        if(this.id.endsWith("TN")) {
            return 0;
        }
        if(this.id.charAt(0) == 'X') {
            return (int)(getMoney() * 0.03);
        } else if(this.id.charAt(0) == 'D') {
            return (int)(getMoney() * 0.035);
        } 
        return (int)(getMoney() * 0.02);
    }
    
    public long getTotal() {
        return getMoney() + getFax();
    }
    
    @Override
    public String toString() {
        return this.id + " " + getManufacturer() + " " + getUnitPrice() + " " + getFax() + " " + getTotal();
    }
}
