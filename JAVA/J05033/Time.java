package J05033;

public class Time {
    private byte hh, mm, ss;
    
    public Time(byte hh, byte mm, byte ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }
    
    public int getSumOfTime(){
        return hh * 3600 + mm * 60 + ss;
    }

    @Override
    public String toString() {
        return hh + " " + mm + " " + ss;
    }
    
    
}
