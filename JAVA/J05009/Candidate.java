package J05009;

public class Candidate {
    static int num = 1;
    
    private int id;
    private String name, dob;
    private double score;

    public Candidate(String name, String dob, double score) {
        id = num++;
        this.name = name;
        this.dob = dob;
        this.score = score;
    }
    
    public double getScore(){
        return score;
    }
    
    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + dob + " " + score;
    }
    
}
