package J05047;

import java.util.HashMap;

public class Product {
    
    private static HashMap<String, Integer> hMap = new HashMap<>();
    
    private String id;
    private String name;
    private int quantity;
    private int unitPrice;

    public Product(String name, int quantity, int unitPrice) {
        setId(name);
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    public void setId(String s) {
        String id = "";
        String[] arr = s.split(" ");
        id += arr[0].substring(0, 1).toUpperCase() + arr[1].substring(0, 1).toUpperCase();
        if(!hMap.containsKey(id)) {
            hMap.put(id, 1);
            this.id = id + String.format("%02d", 1);
        } else {
            int cnt = hMap.get(id);
            this.id = id + String.format("%02d", ++cnt);
            hMap.put(id, cnt);
        }
    }
    
    public int getTotalBill() {
        return this.quantity * this.unitPrice;
    }
    
    public int getChietKhau() {
        if(this.quantity > 10) {
            return (int)(getTotalBill() * 0.05f);
        } else if(this.quantity >= 8) {
            return (int)(getTotalBill() * 0.02f);
        } else if(this.quantity >= 5) {
            return (int)(getTotalBill() * 0.01f);
        }
        return 0;
    }
    
    public int getRealityBill() {
        return getTotalBill() - getChietKhau();
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + getChietKhau() + " " + getRealityBill();
    }

}
