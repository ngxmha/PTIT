package J05051;

public class Customer {
    
    private static int quantity = 1;
    
    private String id;
    private String type;
    private int oldIndex;
    private int newIndex;

    public Customer(String type, int oldIndex, int newIndex) {
        this.id = "KH" + String.format("%02d", quantity++);
        this.type = type;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }
    
    public int getHeSo() {
        if(this.type.equals("KD")) {
            return 3;
        } else if(this.type.equals("NN")) {
            return 5;
        } else if(this.type.equals("TT")) {
            return 4;
        }
        return 2;
    }
    
    public int getThanhTien() {
        return (this.newIndex - this.oldIndex) * getHeSo() * 550;
    }
    
    public int getPhuTroi() {
        if(this.newIndex - this.oldIndex > 100) {
            return getThanhTien();
        } else if(this.newIndex - this.oldIndex >= 50) {
            return (int)Math.round((getThanhTien() * 0.35f));
        }
        return 0;
    }
    
    public int getTotal() {
        return getPhuTroi() + getThanhTien();
    }
    
    @Override
    public String toString() {
        return this.id + " " + getHeSo() + " " + getThanhTien() + " " + getPhuTroi() + " " + getTotal();
    }
}
