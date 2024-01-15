package J05016;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer> {
    
    private static int quantity = 1;
    
    private String id;
    private String name;
    private int room;
    private String checkIn;
    private String checkOut;
    private int extra;

    public Customer(String name, int room, String checkIn, String checkOut, int extra) {
        this.id = "KH" + String.format("%02d", quantity++);
        this.name = name;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.extra = extra;
    }
    
    public int getStay() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int day = 0;
        try {
            Date checkIn = sdf.parse(this.checkIn);
            Date checkOut = sdf.parse(this.checkOut);
            day = (int)((checkOut.getTime() - checkIn.getTime()) / 3600000 / 24) + 1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return day;
    }
    
    public int getTotal() {
        if(room / 100 == 1)
            return 25 * getStay() + extra;
        else if(room / 100 == 2) 
            return 34 * getStay() + extra;
        else if(room / 100 == 3) 
            return 50 * getStay() + extra;
        return 80 * getStay() + extra;
    }
    
    @Override
    public int compareTo(Customer c) {
        return c.getTotal() - getTotal();
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + room + " " + getStay() + " " + getTotal();
    }
    
}
