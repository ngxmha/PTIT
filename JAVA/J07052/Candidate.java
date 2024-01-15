package J07052;

public class Candidate {
    private String idCa, nameCa, status;
    private double mathScore, physScore, chemScore;

    public Candidate(String idCa, String nameCa, double mathScore, double physScore, double chemScore) {
        this.idCa = idCa;
        this.nameCa = standardName(nameCa);
        this.mathScore = mathScore;
        this.physScore = physScore;
        this.chemScore = chemScore;
    }
    
    public String standardName(String s){
        String name = "";
        String[] arr = s.trim().split("\\s+");
        for(int i = 0; i < arr.length; i++){
            name += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        return name;
    }
    
    public String getIdCa(){
        return idCa;
    }
    
    public double getPriorityScore(){
        double prio = 0;
        if(idCa.charAt(2) == '1'){
            prio = 0.5f;
        } else if(idCa.charAt(2) == '2'){
            prio = 1.0f;
        } else {
            prio = 2.5f;
        }
        return prio;
    }
    
    public void setStatus(double a){
        if(getScore() >= a){
            status = "TRUNG TUYEN";
        } else {
            status = "TRUOT";
        }
    }
    
    public double getScore(){
        return mathScore * 2 + physScore + chemScore + getPriorityScore();
    }
    
    public String Format(double a){
        if(a == (int)a){
            return String.format("%.0f", a);
        }
        return String.format("%.1f", a);
    }
    
    @Override
    public String toString(){
        return idCa + " " + nameCa + Format(getPriorityScore()) + " " + Format(getScore()) + " " + status; 
    }
    
}
