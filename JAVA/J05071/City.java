package J05071;

public class City 
{
    private int id;
    private String name;
    private int giaCuoc;

    public City(int id, String name, int giaCuoc) 
    {
        this.id = id;
        this.name = name;
        this.giaCuoc = giaCuoc;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }
        
    public int getGiaCuoc() 
    {
        return giaCuoc;
    }
    
}
