package J05049;

public class Product {
    
    private String id;
    private int quantityImport;

    public Product(String id, int quantityImport) {
        this.id = id;
        this.quantityImport = quantityImport;
    }
    
    public String getId() {
        return this.id;
    }
    
    public int getQuantityExport() {
        if(this.id.charAt(0) == 'A') {
            return (int)(Math.round(this.quantityImport * 0.6f));
        }
        return (int)(Math.round(this.quantityImport * 0.7f));
    }
    
    public int getUnitPrice() {
        if(this.id.charAt(this.id.length() - 1) == 'Y') {
            return 110000;
        }
        return 135000;
    }
      
    public long getMoney() {
        return 1l * getQuantityExport() * getUnitPrice();
    }
    
    public long getFax() {
        if(this.id.charAt(0) == 'A' && this.id.charAt(this.id.length() - 1) == 'Y') {
            return (long)(getMoney() * 0.08);
        } else if(this.id.charAt(0) == 'A' && this.id.charAt(this.id.length() - 1) == 'N') {
            return (long)(getMoney() * 0.11);
        } else if(this.id.charAt(0) == 'B' && this.id.charAt(this.id.length() - 1) == 'Y') {
            return (long)(getMoney() * 0.17);
        }
        return (long)(getMoney() * 0.22);
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.quantityImport + " " + getQuantityExport() + " " + getUnitPrice() + " " + getMoney() + " " + getFax();
    }
}
