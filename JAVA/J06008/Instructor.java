package J06008;

public class Instructor 
{
    private String id;
    private String name;
    private double timeTotal;

    public Instructor(String id, String name) 
    {
        this.id = id;
        this.name = name;
    }

    public String getId() 
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
    
    public void setTimeTotal(double timeTotal)
    {
        this.timeTotal = timeTotal;
    }
    
}
