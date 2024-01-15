package J07060;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaThi {
    
    private static int quantity = 1;
    
    private String id;
    private Date dateExam;
    private Date timeExam;
    private String room;

    public CaThi(String dateExam, String timeExam, String room) throws ParseException{
        this.id = String.format("C%03d", quantity++);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dateExam = sdf.parse(dateExam);
        sdf = new SimpleDateFormat("HH:mm");
        this.timeExam = sdf.parse(timeExam);
        this.room = room;
    }

    public String getId() {
        return id;
    }

    public Date getDateExam() {
        return dateExam;
    }

    public Date getTimeExam() {
        return timeExam;
    }

    public String getRoom() {
        return room;
    }
  
}
