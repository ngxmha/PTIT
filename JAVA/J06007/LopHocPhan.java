package J06007;

public class LopHocPhan 
{
    private String insId;
    private String subId;
    private double time;

    public LopHocPhan(String insId, String subId, double time) 
    {
        this.insId = insId;
        this.subId = subId;
        this.time = time;
    }

    public String getInsId() {
        return insId;
    }

    public double getTime() {
        return time;
    }
    
    
}
