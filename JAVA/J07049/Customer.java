package J07049;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Customer implements Comparable<Customer>{
   
    private static int num = 1;
    
    private String id;
    private String name;
    private String addr;
    private Product pro;
    private int quantity;
    private String date;

    public Customer(String name, String addr, Product pro, int quantity, String date) {
        this.id = String.format("KH%02d", num++);
        this.name = name;
        this.addr = addr;
        this.pro = pro;
        this.quantity = quantity;
        this.date = date;
    }
    
    public int getBill()
    {
        return quantity * pro.getPrice();
    }
    
    public Date getExpiredGuarantee()
    {
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(date.substring(6)), Integer.parseInt(date.substring(3, 5)) - 1, Integer.parseInt(date.substring(0, 2)));
        cal.add(Calendar.MONTH, pro.getGuarantee());
        return cal.getTime();
    }
    
    @Override
    public int compareTo(Customer o)
    {
        if(getExpiredGuarantee().equals(o.getExpiredGuarantee()))
            return id.compareTo(o.id);
        return getExpiredGuarantee().compareTo(o.getExpiredGuarantee());
    }
    
    @Override
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %s %s %s %d %s", id, name, addr, pro.getId(), getBill(), sdf.format(getExpiredGuarantee()));
    }
    
}
