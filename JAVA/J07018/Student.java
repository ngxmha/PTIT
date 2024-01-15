package J07018;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student 
{
    private static int num = 1;
    
    private String id;
    private String name;
    private String group;
    private String dob;
    private double gpa;

    public Student(String name, String group, String dob, double gpa) 
    {
        this.id = String.format("B20DCCN%03d", num++);
        this.name = standardName(name);
        this.group = group;
        this.dob = standardDob(dob);
        this.gpa = gpa;
    }
    
    public String standardName(String s)
    {
        String name = "";
        String[] arr = s.split("\\s++");
        
        for(int i = 0; i < arr.length; i++)
        {
            name += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        
        return name;
        
    }
    
    public String standardDob(String s)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dob = null;
        
        try 
        {
            dob = sdf.format(sdf.parse(s));
        } catch (ParseException e) 
        {}
        
        return dob;
    }
    
    @Override
    public String toString()
    {
        return id + " " + name + " " + group + " " + dob + " " + String.format("%.2f", gpa);
    }
}
