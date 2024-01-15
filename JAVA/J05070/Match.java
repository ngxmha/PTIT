package J05070;

public class Match {
    
    private String nameMatch;
    private CLB clb;
    private int quantity;

    public Match(String nameMatch, CLB clb, int quantity) {
        this.nameMatch = nameMatch;
        this.clb = clb;
        this.quantity = quantity;
    }
   
    public String getClbName() {
        return this.clb.getName();
    }
    
    public int getProceed() {
        return quantity * clb.getPrice();
    }
    
    @Override
    public String toString() {
        return this.nameMatch + " " + clb.getName() + " " + getProceed();
    }
    
}
