package J05031;

public class Student {

    private String id;
    private String name;
    private String Class;
    private float score1;
    private float score2;
    private float score3;

    public Student(String id, String name, String Class, float score1, float score2, float score3) {
        this.id = id;
        this.name = name;
        this.Class = Class;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.Class + " " + String.format("%.1f ", score1) + String.format("%.1f ", score2) + String.format("%.1f", score3);
    } 
}

