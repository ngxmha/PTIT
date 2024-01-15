package J06005;

public class Bill 
{
    private static int num = 1;
    
    private String id;
    private Customer cus;
    private Product pro;
    private int quantity;

    public Bill(Customer cus, Product pro, int quantity) 
    {
        this.id = "HD" + String.format("%03d", num++);
        this.cus = cus;
        this.pro = pro;
        this.quantity = quantity;
    }
    
    public long thanhTien()
    {
        return quantity * pro.getSell();
    }
    
    @Override
    public String toString()
    {
        return id + " " + cus.getName() + " " + cus.getAddress() + " " + pro.getName() + " " + pro.getUnit() + " " + pro.getBuy() + " " + pro.getSell() + " " + quantity + " " + thanhTien();
    }
}
