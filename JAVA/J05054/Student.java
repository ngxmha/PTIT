package J05054;

public class Student {
    
    private static int quantity = 1;
    
    private String id;
    private String name;
    private float averageScore;
    private int rank;

    public Student(String name, float averageScore) {
        this.id = "HS" + String.format("%02d", quantity++);
        this.name = name;
        this.averageScore = averageScore;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public int getRank() {
        return this.rank;
    }
    
    public float getAverageScore() {
        return this.averageScore;
    }
    
    public String getClassification() {
        if(this.averageScore >= 9) {
            return "Gioi";
        } else if(this.averageScore >= 7) {
            return "Kha";
        } else if(this.averageScore >= 5) {
            return "Trung Binh";
        }
        return "Yeu";
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.averageScore + " " + this.getClassification() + " " + this.rank;
    }
}
