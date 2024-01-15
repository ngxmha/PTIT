package J05076;

public class Product {
    
    private Product_Type type;
    private int quantityImport;
    private int unitPrice;
    private int quantityExport;
    
    public Product(Product_Type type, int quantityImport, int unitPrice, int quantityExport) {
        this.type = type;
        this.quantityImport = quantityImport;
        this.unitPrice = unitPrice;
        this.quantityExport = quantityExport;
    }
    
    public int getToTalImport() {
        return this.quantityImport * this.unitPrice;
    }
    
    public int getTotalExport() {
        double laiSuat;
        if(this.type.getType() == 'A') 
            laiSuat = 0.08;
        else if(type.getType() == 'B') 
            laiSuat = 0.05;
        else
            laiSuat = 0.02;
        return (int)(this.quantityExport * this.unitPrice * laiSuat) + this.quantityExport * this.unitPrice;
    }
    
    @Override
    public String toString() {
        return this.type.getId() + " " + this.type.getName() + " " + getToTalImport() + " " + getTotalExport();
    }
    
}
