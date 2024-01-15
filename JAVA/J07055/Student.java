package J07055;

public class Student {
    static int num = 1;
    
    private String idSt, nameSt, classification;
    private double averageScore;

    public Student(String nameSt, double averageScore) {
        idSt = "SV" + String.format("%02d", num++);
        String s = "";
        String[] arr = nameSt.trim().split("\\s+");
        for(int i = 0; i < arr.length; i++){
            s += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        this.nameSt = s;
        this.averageScore = averageScore;
        if(averageScore >= 8) {
            classification = "GIOI";
        } else if(averageScore >= 6.5 && averageScore < 8) {
            classification = "KHA";
        } else if(averageScore >= 5 && averageScore < 6.5) {
            classification = "TRUNG BINH";
        } else {
            classification = "KEM";
        }
    }
    
    public double getAverageScore(){
        return averageScore;
    }
    
    @Override
    public String toString(){
        return idSt + " " + nameSt + " " + String.format("%.2f", averageScore) + " " + classification;
    }
}
