package J07051;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    static int num = 1;
    
    private String idCus, nameCus;
    private Date dayArrive, dayPart;
    private int room, serviceFee;

    public Customer(String nameCus, int room, Date dayArrive, Date dayPart, int serviceFee) throws ParseException {
        this.idCus = "KH" + String.format("%02d", num++);
        this.room = room;
        this.nameCus = standardName(nameCus);
        this.dayArrive = standardDate(dayArrive);
        this.dayPart = standardDate(dayPart);
        this.serviceFee = serviceFee;
    }
    
    public String standardName(String s){
        String name = "";
        String[] arr = s.trim().split("\\s+");
        for(int i = 0; i < arr.length; i++){
            name += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        return name;
    }
    
    public Date standardDate(Date a) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.parse(df.format(a));
    }
    
    public int getDayStay(){
        int dayStay = (int)((dayPart.getTime() - dayArrive.getTime()) / (1000 * 60 * 60 * 24));
        return dayStay + 1;
    }
    
    public int getTotalMoney(){
        int unit = 0;
        switch(room / 100){
            case 1:
                unit = 25;
                break;
            case 2:
                unit = 34;
                break;
            case 3:
                unit = 50;
                break;
            case 4:
                unit = 80;
                break;
        }
        return getDayStay() * unit + serviceFee;
    }
    
    @Override
    public String toString(){
        return idCus + " " + nameCus + " " + room + " " + getDayStay() + " " + getTotalMoney();
    }
    
}
