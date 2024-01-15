package J05025;

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
    
    public String getId() {
        return this.id;
    }
    
    public String getLastName() {
        String[] arr = this.name.split(" ");
        return arr[arr.length - 1];
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.subject;
    }
}
