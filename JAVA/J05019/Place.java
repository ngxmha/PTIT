package J05019;

public class Place {
    private static int quantity = 1;
    
    private String id;
    private String name;
    private int rain;
    private int timeRain;

    public Place(String name, int rain, int timeRain) {
        this.id = String.format("T%02d", quantity++);
        this.name = name;
        this.rain = rain;
        this.timeRain = timeRain;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getTimeRain()
    {
        return timeRain;
    }
    
    public int getRain() {
        return rain;
    }

    public void setRain(int rain) {
        this.rain = rain;
    }

    public void setTimeRain(int timeRain) {
        this.timeRain = timeRain;
    }
    
    @Override
    public String toString()
    {
        return id + " " + name + " " + String.format("%.02f", getRain() / ((double)getTimeRain() / 60));
    }
}
