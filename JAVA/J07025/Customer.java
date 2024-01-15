package J07025;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    
    private static int quantity = 1;
   
    private String id;
    private String name;
    private String gender;
    private String dob;
    private String address;

    public Customer(String name, String gender, String dob, String address) {
        this.id = "KH" + String.format("%03d", quantity++);
        this.name = standardName(name);
        this.gender = gender;
        this.dob = standardDob(dob);
        this.address = address;
    }
    
    public String getDob() {
        return dob;
    }
    
    public Date getDobTypeDate(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date d = new Date();
        try {
            d = simpleDateFormat.parse(s);
        } catch (ParseException ex) { 
            ex.printStackTrace();
        }
        return d;
    }
    
    public String standardName(String s) {
        String name = "";
        String[] arr = s.split("\\s+");
        for(int i = 0; i < arr.length; i++) {
            name += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        return name;
    }
    
    public String standardDob(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            s = simpleDateFormat.format(simpleDateFormat.parse(s));
        } catch (ParseException ex) { 
            ex.printStackTrace();
        }
        return s;
    }
    
    @Override
    public String toString() {
        return id + " " + name + gender  + " " + address + " " + dob;
    }
}
