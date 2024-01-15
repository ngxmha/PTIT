package J07056;

public class Bill {

    static int quantity = 1;

    private String id, name;
    private char type;
    private int begin, finish;

    public Bill(String name, String s) {
        this.id = "KH" + String.format("%02d", quantity++);
        this.name = standardName(name);
        String[] arr = s.split(" ");
        this.type = arr[0].charAt(0);
        this.begin = Integer.parseInt(arr[1]);
        this.finish = Integer.parseInt(arr[2]);
    }

    public String standardName(String s) {
        String name = "";
        String[] arr = s.trim().split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            name += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        return name;
    }
    
    public int getLimit() {
        if(this.type == 'A') {
            return 100;
        } else if(this.type == 'B') {
            return 500;
        } 
        return 200;
    }
    
    public int moneyInLimit() {
        if(this.finish - this.begin < getLimit()) {
            return (this.finish - this.begin) * 450;
        }
        return getLimit() * 450;
    }
    
    public int moneyOutLimit() {
        if(this.finish - this.begin > getLimit()) {
            return (this.finish - this.begin - getLimit()) * 1000;
        }
        return 0;
    }
    
    public int getVAT() {
        return (int)(0.05 * moneyOutLimit());
    }
    
    public int getTotalBill() {
        return moneyInLimit() + moneyOutLimit() + getVAT();
    }
    
    @Override
    public String toString() {
        return id + " " + name + moneyInLimit() + " " + moneyOutLimit() + " " + getVAT() + " " + getTotalBill();
    }
}
