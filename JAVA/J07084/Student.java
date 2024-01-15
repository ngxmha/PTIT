package J07084;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Student implements Comparable<Student>
{
    private String name;
    private Date begin;
    private Date finish;

    public Student(String name, String begin, String finish) {
        this.name = name;
        try 
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            this.begin = sdf.parse(begin);
            this.finish = sdf.parse(finish);
        }
        catch(ParseException ex)
        {}
    }
    
    public long getTimeOnl()
    {
        long timeOnl = finish.getTime() - begin.getTime();
        return TimeUnit.MILLISECONDS.toMinutes(timeOnl);
    }
    
    @Override
    public int compareTo(Student st)
    {
        if(getTimeOnl() == st.getTimeOnl())
        {
            return name.compareTo(st.name);
        }
        return getTimeOnl() > st.getTimeOnl() ? -1 : 1;
    }
    
    @Override
    public String toString()
    {
        return name + " " + getTimeOnl();
    }
}
