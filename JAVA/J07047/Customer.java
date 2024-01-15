package J07047;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Customer implements Comparable<Customer>{
    
    private static int quantity = 1;
    
    private String id;
    private String name;
    private String room;
    private Room typeRoom;
    private String checkIn;
    private String checkOut;

    public Customer(String name, String room, String checkIn, String checkOut, ArrayList<Room> rooms) {
        this.id = String.format("KH%02d", quantity++);
        this.name = name;
        this.room = room;
        for(Room typeRoom : rooms)
        {
            if(typeRoom.getSign() == room.charAt(2))
            {
                this.typeRoom = typeRoom;
                break;
            }
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    
    public int getDay() throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date checkIn = sdf.parse(this.checkIn);
        Date checkOut = sdf.parse(this.checkOut);
        long day = (checkOut.getTime() - checkIn.getTime()) / (24 * 60 * 60 * 1000);
        return (int)day;
    }
    
    public double getBill() throws ParseException
    {
        int day = getDay();
        if(day == 0)
            day++;
        double bill = typeRoom.getUnit() * day + typeRoom.getUnit() * day * typeRoom.getFee();
        if(day < 10)
            return bill;
        else if(day < 20)
            return bill * 0.98;
        else if(day < 30)
            return bill * 0.96;
        return bill * 0.94;
    }
    
    @Override
    public int compareTo(Customer o)
    {
        int res = 0;
        
        try
        {
            res = o.getDay() - getDay();
        }
        catch(ParseException ex)
        {}
        
        return res;
    }
    
    @Override
    public String toString()
    {
        String res = "";
        
        try
        {
            res = id + " " + name + " " + room + " " + getDay() + " " + String.format("%.2f", getBill());
        }
        catch(ParseException ex)
        {}
        
        return res;
    }
    
}
