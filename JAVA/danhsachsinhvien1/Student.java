package danhsachsinhvien1;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable
{
    
    private static int quantity = 1;
    
    private String id;
    private String name;
    private String group;
    private Date dob;
    private float gpa;

    public Student(String name, String group, String dob, float gpa) 
    {
        this.id = "B20DCCN" + String.format("%03d", quantity++);
        this.id = id;
        this.name = name;
        this.group = group;
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            this.dob = sdf.parse(dob);
        }
        catch(ParseException ex)
        {}
        this.gpa = gpa;
    }
    
    @Override
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        return id + " " + name + " " + group + " " + sdf.format(dob) + " " + String.format("%.2f", gpa);
    }
}
