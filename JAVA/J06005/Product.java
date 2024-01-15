package J06005;

public class Product
{
    private static int num = 1;
    
    private String id;
    private String name;
    private String unit;
    private int buy;
    private int sell;

    public Product(String name, String unit, int buy, int sell) 
    {
        this.id = "MH" + String.format("%03d", num++);
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getBuy() {
        return buy;
    }

    public int getSell() {
        return sell;
    }

}
