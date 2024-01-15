package J05065;

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
            if(GD_cnt == 0)
                GD_cnt++;
            else 
                id = "NV" + id.substring(2);
        } 
        else if(s.equals("TP"))
        {
            if(TP_cnt < 3)
                TP_cnt++;
            else 
                id = "NV" + id.substring(2);
        }
        else if(s.equals("PP"))
        {
            if(PP_cnt < 3)
                PP_cnt++;
            else 
                id = "NV" + id.substring(2);
        }
    }
    
    public String chucVu()
    {
        return id.substring(0, 2); 
    }
    
    public String bacLuong() 
    {
        return id.substring(2, 4);
    }
    
    public String soHieu()
    {
        return id.substring(4);
    }
    
    @Override
    public int compareTo(Employee e)
    {
        if(bacLuong().equals(e.bacLuong()))
            return soHieu().compareTo(e.soHieu());
        return e.bacLuong().compareTo(bacLuong());
        
    }
    
    @Override
    public String toString()
    {
        return name + " " + chucVu() + " " + soHieu() + " " + bacLuong();
    }
    
}
