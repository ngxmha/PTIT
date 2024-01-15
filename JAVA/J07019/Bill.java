package J07019;

public class Bill 
{
     private static int num = 1;
    
    private String id;
    private int quantity;
    private Type type;

    public Bill(String id, int quantity, Type type) {
        this.id = id + String.format("-%03d", num++);
        this.quantity = quantity;
        this.type = type;
    }
    
    public int thanhTien()
    {
        if(id.charAt(2) == '1')
            return quantity * type.getUnit1();
        return quantity * type.getUnit2();
    }
    
    public int discount()
    {
        if(quantity >= 150)
            return (int)(thanhTien() * 0.5);
        else if(quantity >= 100)
            return (int)(thanhTien() * 0.3);
        else if(quantity >= 50)
            return (int)(thanhTien() * 0.15);
        return 0;
    }
    
    public int money()
    {
        return thanhTien() - discount();
    }
    
    @Override
    public String toString()
    {
        return id + " " + type.getName() + " " + discount() + " " + money();
    }
    
}
