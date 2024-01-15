package J05018;

public class Student {
    
    static int quantity = 1;
    
    private String id;
    private String name;
    private float averageScore;

    public Student(String name, float[] f) {
        this.id = "HS" + String.format("%02d", quantity++);
        this.name = name;
        this.averageScore = getAverageScore(f);
    }
    
    public String getId() {
        return this.id;
    }
    
    public float getAverageScore() {
        return this.averageScore;
    }
    
    public float getAverageScore(float[] f) {
        float result = 0;
        result += f[0] * 2;
        result += f[1] * 2;
        for(int i = 2; i < f.length; i++) {
            result += f[i];
        }
        return Math.round(result / 12 * 10) / 10.0f;
    }
    
    public String getClassification() {
        if(this.averageScore >= 9) {
            return "XUAT SAC";
        } else if(this.averageScore >= 8 && this.averageScore <= 8.9) {
            return "GIOI";
        } else if(this.averageScore >= 7 && this.averageScore <= 7.9) {
            return "KHA";
        } else if(this.averageScore >= 5 && this.averageScore <= 6.9) {
            return "TB";
        }
        return "YEU";
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.averageScore + " " + getClassification();
    }
}
