package J05042;

public class Student {
    
    private String name;
    private int AC;
    private int submits;

    public Student(String name, int AC, int submits) {
        this.name = name;
        this.AC = AC;
        this.submits = submits;
    }

    public String getName() {
        return name;
    }

    public int getAC() {
        return AC;
    }

    public int getSubmits() {
        return submits;
    }

    @Override
    public String toString() {
        return this.name + " " + this.AC + " " + this.submits;
    }
}
