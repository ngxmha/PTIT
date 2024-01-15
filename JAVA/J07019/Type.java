package J07019;

public class Type 
{
    private String id;
    private String name;
    private int unit1;
    private int unit2;

    public Type(String id, String name, int unit1, int unit2) 
    {
        this.id = id;
        this.name = name;
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public String getName() 
    {
        return name;
    }

    public String getId() {
        return id;
    }
    
    public int getUnit1() 
    {
        return unit1;
    }

    public int getUnit2() 
    {
        return unit2;
    }
}
