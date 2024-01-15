package J07059;

public class Exam {
    
    static int quantity = 1;
    
    private String id;
    private String date;
    private String time;
    private String room;

    public Exam(String date, String time, String room) {
        this.id = "C" + String.format("%03d", quantity++);
        this.date = date;
        this.time = time;
        this.room = room;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getDate() {
        return this.date;
    }
    
    public String getTime() {
        return this.time;
    }
    
    @Override
    public String toString() {
        return id + " " + date + " " + time + " " + room;
    }
}
