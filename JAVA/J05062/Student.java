package J05062;

public class Student {
    
    private static int quantity = 1;
    
    private String id;
    private String name;
    private double gpa;
    private int drl;
    private String statusHocBong;
    
    public Student(String name, double gpa, int drl) {
        this.id = "SV" + String.format("%03d", quantity++);
        this.name = name;
        this.gpa = gpa;
        this.drl = drl;
        setStatusHocBong();
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getDrl() {
        return drl;
    }

    public String getStatusHocBong() {
        return statusHocBong;
    }
    
    public void setStatusHocBong() {
        if(gpa >= 3.6 && drl >= 90)
            statusHocBong = "XUATSAC";
        else if(gpa >= 3.2 && drl >= 80)
            statusHocBong = "GIOI";
        else if(gpa >= 2.5 && drl >= 70)
            statusHocBong = "KHA";
        else 
            statusHocBong = "KHONG";
    }
    
    public void setStatusHocBong(String s) {
        statusHocBong = s;
    }
}
