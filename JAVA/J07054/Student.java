package J07054;

public class Student {
    static int quantity = 1;
    
    private String id, name;
    private int score1, score2, score3, rank;

    public Student(String name, int score1, int score2, int score3) {
        this.id = "SV" + String.format("%02d", quantity++);
        this.name = standardName(name);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.rank = rank;
    }

    public String standardName(String s){
        String name = "";
        String[] arr = s.trim().split("\\s+");
        for(int i = 0; i < arr.length; i++){
            name += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        return name;
    }
    
    public float getAverageScore(){
        return (score1*3 + score2*3 + score3*2) / 8.0f;
    }
    
    public int getRank(){
        return this.rank;
    }
    
    public void setRank(int i){
        this.rank = i;
    }
    
    @Override
    public String toString(){
        return id + " " + name + String.format("%.2f", getAverageScore()) + " " + this.rank;
    }
}
