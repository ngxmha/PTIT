package J07074;

public class Schedule implements Comparable<Schedule>{
    
    private static int quantity = 1;
    
    private String id;
    private String idSub;
    private int day;
    private int kip;
    private String nameIns;
    private String room;

    public Schedule(String idSub, int day, int kip, String nameIns, String room) {
        this.id = String.format("HP%03d", quantity++);
        this.idSub = idSub;
        this.day = day;
        this.kip = kip;
        this.nameIns = nameIns;
        this.room = room;
    }
    
    public String getIdSub()
    {
        return idSub;
    }
    
    @Override
    public int compareTo(Schedule o)
    {
        if(day == o.day)
        {
            if(kip == o.kip)
                return nameIns.compareTo(o.nameIns);
            return kip - o.kip;
        }
        return day - o.day;
    }
    
    @Override
    public String toString()
    {
        return id + " " + day + " " + kip + " " + nameIns + " " + room;
    }
}
