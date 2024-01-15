package J05015;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RacingBoy implements Comparable<RacingBoy> 
{
    
    private String name;
    private String area;
    private String time;

    public RacingBoy(String name, String area, String time)
    {
        this.name = name;
        this.area = area;
        this.time = time;
    }
    
    public String getId() 
    {
        String id = "";
        String[] arr = name.split(" ");
        String[] arr1 = area.split(" ");
        for(int i = 0; i < arr1.length; i++) {
            id += arr1[i].substring(0, 1).toUpperCase();
        }
        for(int i = 0; i < arr.length; i++) {
            id += arr[i].substring(0, 1).toUpperCase();
        }
        return id;
    }
    
    public double getVanToc() {
        SimpleDateFormat sdf = new SimpleDateFormat("H:mm");
        double vanToc = 0;
        try {
            Date date1 = sdf.parse("6:00");
            Date date2 = sdf.parse(time);
            double hour = (double)(date2.getTime() - date1.getTime()) / 3600000;
            vanToc = 120 / hour;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return vanToc;
    }
    
    @Override
    public int compareTo(RacingBoy rb) {
        return rb.getVanToc() > getVanToc() ? 1 : -1;
    }
    
    @Override
    public String toString() {
        return getId() + " " + name + " " + area + " " + Math.round(getVanToc()) + " Km/h";
    }
}