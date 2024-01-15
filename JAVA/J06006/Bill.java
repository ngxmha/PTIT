package J06006;

public class Bill implements Comparable<Bill>
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
    
    public long profit()
    {
        return thanhTien() - quantity * pro.getBuy();
    }
    
    @Override
    public int compareTo(Bill b) 
    {
        return (int)(b.profit() - profit());
    }
    
    @Override
    public String toString()
    {
        return id + " " + cus + " " + pro + " " + quantity + " " + thanhTien() + " " + profit();
    }
}
