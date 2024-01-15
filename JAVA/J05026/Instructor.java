package J05026;

public class Instructor {
    static int quantity = 1;
    
    private String id;
    private String name;
    private String subject;

    public Instructor(String name, String subject) {
        this.id = "GV" + String.format("%02d", quantity++);
        this.name = name;
        this.subject = sorterSubject(subject);
    }
    
    public String sorterSubject(String s) {
        String[] arr = s.split(" ");
        String subject = "";
        for(int i = 0; i < arr.length; i++) {
            subject += arr[i].substring(0, 1).toUpperCase();
        }
        return subject;
    }

    public String getSubject() {
        return this.subject;
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.subject;
    }
}
