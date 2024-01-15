package J05013;

public class Employee implements Comparable<Employee> {
    
    private static int quantity = 1;
    
    private String id;
    private String name;
    private double theoryScore;
    private double practiceScore;

    public Employee(String name, double theoryScore, double practiceScore) {
        this.id = "TS" + String.format("%02d", quantity++);
        this.name = name;
        this.theoryScore = theoryScore/10 > 1 ? theoryScore/10 : theoryScore;
        this.practiceScore = practiceScore/10 > 1 ? practiceScore/10 : practiceScore;
    }
    
    public double getAvg() {
        return (theoryScore + practiceScore)/2;
    }
    
    public String getClassification() {
        if(getAvg() < 5) 
            return "TRUOT";
        else if(getAvg() > 5 && getAvg() < 8) 
            return "CAN NHAC";
        else if(getAvg() >= 8 && getAvg() <= 9.5)
            return "DAT";
        return "XUAT SAC";
    }
    
    @Override
    public int compareTo(Employee e) {
        return getAvg() > e.getAvg() ? -1 : 1;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", getAvg()) + " " + getClassification();
    }
}
