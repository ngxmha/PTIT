package J07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    static int num = 1;
    
    private String idCus, nameCus, room;
    private int dayStay;

    public Customer(String nameCus, String room, int dayStay) {
        this.idCus = "KH" + String.format("%02d", num++); 
        this.nameCus = nameCus;
        this.room = room;
        this.dayStay = dayStay;
    }
    
    public int getDayStay(){
        return dayStay;
    }
    
    @Override
    public String toString() {
        return idCus + " " + nameCus + " " + room + " " + dayStay;
    }
    
}
