package J05073;

public class Product
{
    private String id;
    private int unit;
    private int quantity;

    public Product(String id, int unit, int quantity) 
    {
        this.id = id;
        this.unit = unit;
        this.quantity = quantity;
    }
    
    public double giaBan()
    {
        double giaBan = unit * quantity;
        char first = id.charAt(0), last = id.charAt(id.length() - 1);
        if(last == 'C')
        {
            if(first == 'T')
                giaBan = giaBan * (1 + 0.29 * 0.95 + 0.04);
            else if(first == 'C')
                giaBan = giaBan * (1 + 0.1 * 0.95 + 0.03);
            else if(first == 'D')
                giaBan = giaBan * (1 + 0.08 * 0.95 + 0.025);
            else
                giaBan = giaBan * (1 + 0.02 * 0.95 + 0.005);
        }
        else 
        {
            if(first == 'T')
                giaBan = giaBan * (1 + 0.29 + 0.04);
            else if(first == 'C')
                giaBan = giaBan * (1 + 0.1 + 0.03);
            else if(first == 'D')
                giaBan = giaBan * (1 + 0.08+ 0.025);
            else
                giaBan = giaBan * (1 + 0.02 + 0.005);
        }
        return (giaBan + giaBan * 0.2) / quantity;
    }
    
    @Override
    public String toString()
    {
        return id + " " + String.format("%.2f", giaBan());
    }
}
