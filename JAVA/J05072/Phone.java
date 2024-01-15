package J05072;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Phone implements Comparable<Phone>
{
    private String thueBao;
    private String begin;
    private String finish;
    private City city;

    public Phone(String thueBao, String begin, String finish) 
    {
        this.thueBao = thueBao;
        this.begin = begin;
        this.finish = finish;
    }

    public String getThueBao() {
        return thueBao;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    public int getSoPhut()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        long soPhut = 0;
        try 
        {
            Date begin = sdf.parse(this.begin);
            Date finish = sdf.parse(this.finish);
            soPhut = (finish.getTime() - begin.getTime()) / 60000;
        }
        catch(ParseException ex)
        {}
        if(city.getName().equals("Noi mang"))
        {
            soPhut = soPhut / 3 + 1;
        }
        return (int)soPhut;
    }
    
    public int getGiaCuoc()
    {
        return getSoPhut() * city.getGiaCuoc();
    }
    
    @Override
    public int compareTo(Phone p)
    {
        return p.getGiaCuoc()- getGiaCuoc();
    }
    
    @Override
    public String toString()
    {
        return thueBao + " " + city.getName() + " " + getSoPhut() + " " + getGiaCuoc();
    }
}
