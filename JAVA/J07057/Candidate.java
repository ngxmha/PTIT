package J07057;

public class Candidate {
    static int quantity = 1;
    
    private String idCa, nameCa, ethnic;
    private float score;
    private int area;

    public Candidate(String nameCa, float score, String ethnic, int area) {
        this.idCa = "TS" + String.format("%02d", quantity++);
        this.nameCa = standardName(nameCa);
        this.score = score;
        this.ethnic = ethnic;
        this.area = area;
    }
    
    public String standardName(String s){
        String name = "";
        String[] arr = s.trim().split("\\s+");
        for(int i = 0; i < arr.length; i++){
            name += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        return name;
    }
    
    public float getTotalScore(){
        float prio = 0;
        if(area == 1){
            prio += 1.5;
        } else if(area == 2){
            prio += 1;
        }
        if(!ethnic.equals("Kinh")){
            prio += 1.5;
        }
        return score + prio;
    }
    
    @Override
    public String toString(){
        return idCa + " " + nameCa + String.format("%.1f", getTotalScore()) + " " + (getTotalScore() >= 20.5 ? "Do" : "Truot");
    }
}
