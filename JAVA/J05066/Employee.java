package J05066;

public class Employee implements Comparable<Employee>
{
    private static int GD_cnt = 0, TP_cnt = 0, PP_cnt = 0; 
    
    private String id;
    private String name;

    public Employee(String id, String name)
    {
        this.id = id;
        this.name = name;
        fixedId();
    }
    
    public void fixedId() 
    {
        String s = id.substring(0, 2);
        if(s.equals("GD"))
        {
            if(soHieu() > 1)
                id = "NV" + id.substring(2);
        } 
        else if(s.equals("TP"))
        {
            if(soHieu() > 3)
                id = "NV" + id.substring(2);
        }
        else if(s.equals("PP"))
        {
            if(soHieu() > 3)
                id = "NV" + id.substring(2);
        }
    }
    
    public String getName() 
    {
        return name;
    }
    
    public String chucVu()
    {
        return id.substring(0, 2); 
    }
    
    public int bacLuong() 
    {
        return Integer.parseInt(id.substring(2, 4));
    }
    
    public int soHieu()
    {
        return Integer.parseInt(id.substring(4));
    }
    
    @Override
    public int compareTo(Employee e)
    {
        if(bacLuong() == e.bacLuong())
            return soHieu() - e.soHieu();
        return e.bacLuong() - bacLuong();
        
    }
    
    @Override
    public String toString()
    {
        return name + " " + chucVu() + " " + String.format("%03d", soHieu()) + " " + String.format("%02d", bacLuong());
    }
    
}
