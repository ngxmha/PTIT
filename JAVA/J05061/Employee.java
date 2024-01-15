package J05061;

public class Employee {
    
    private static int quantity = 1;
    
    private String id;
    private String name;
    private String dob;
    private double theoryScore;
    private double practiceScore;

    public Employee(String name, String dob, double theoryScore, double practiceScore) {
        this.id = "PH" + String.format("%02d", quantity++);
        this.name = name;
        this.dob = dob;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
    }
    
    public String getId() {
        return this.id;
    }
    
    public int getAge() {
        return 2021 - Integer.parseInt(this.dob.substring(6));
    }
    
    public double getBonus() {
        if(this.theoryScore >= 8 && this.practiceScore >= 8) {
            return 1;
        } else if(this.theoryScore >= 7.5 && this.practiceScore >= 7.5) {
            return 0.5;
        }
        return 0;
    }
    
    public int getAverageScore() {
        int averageScore = (int)Math.round((this.theoryScore + this.practiceScore) / 2 + getBonus());
        if(averageScore > 10) {
            return 10;
        }
        return averageScore;
    }
    
    public String getClassification() {
        if(getAverageScore() >= 9) {
            return "Xuat sac";
        } else if(getAverageScore() == 8) {
            return "Gioi";
        } else if(getAverageScore() == 7) {
            return "Kha";
        } else if(getAverageScore() == 5 || getAverageScore() == 6) {
            return "Trung binh";
        }
        return "Truot";
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + getAge() + " " + getAverageScore() + " " + getClassification();
    }
}
