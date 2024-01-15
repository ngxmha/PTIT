package J05055;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Candidate implements Comparable<Candidate>
{
    private static int quantity = 1;
    
    private String id;
    private String name;
    private String dob;
    private Date begin;
    private Date finish;
    private int rank;
    
    public Candidate(String name, String dob, String begin, String finish) {
        this.id = String.format("VDV%02d", quantity++);
        this.name = name;
        this.dob = dob;
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            this.begin = sdf.parse(begin);
            this.finish = sdf.parse(finish);
            
        }
        catch(ParseException ex)
        {}
    }
    
    public long thanhTichThucTe()
    {
        return (finish.getTime() - begin.getTime()) / 1000;
    }
    
    public int getUuTien()
    {
        int age = 2021 - Integer.parseInt(dob.substring(6));
        if(age < 18)
            return 0;
        else if(age >= 18 && age < 25)
            return 1;
        else if(age >= 25 && age < 32)
            return 2;
        return 3;
    }
    
    public long thanhTichXepHang()
    {
        return thanhTichThucTe() - getUuTien();
    }
    
    public String change(long m)
    {
        return String.format("%02d:%02d:%02d", m / 3600, (m % 3600) / 60, (m % 3600) % 60);
    }

    public String getId() {
        return id;
    }

    public int getRank() {
        return rank;
    }
    
    public void setRank(int rank)
    {
        this.rank = rank;
    }
    
    @Override
    public int compareTo(Candidate c)
    {
        return thanhTichXepHang() > c.thanhTichXepHang() ? 1 : -1;
    }

    @Override
    public String toString()
    {
        return id + " " + name + " " + change(thanhTichThucTe()) + " " + change(getUuTien()) + " " + change(thanhTichXepHang()) + " " + rank;
    }
}
