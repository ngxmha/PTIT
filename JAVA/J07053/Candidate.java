package J07053;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Candidate {
    static int quantity = 1;
    
    private String idCa, nameCa, dobCa;
    private double theoryScore, practiceScore;

    public Candidate(String nameCa, String dobCa, double theoryScore, double practiceScore) {
        this.idCa = "PH" + String.format("%02d", quantity++);
        this.nameCa = standardName(nameCa);
        this.dobCa = standardDob(dobCa);
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
    }
    
    public String standardName(String s){
        String name = "";
        String[] arr = s.trim().split("\\s+");
        for(int i = 0; i < arr.length; i++){
            name += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        return name;
    }
    
    public String standardDob(String s){
        String dob = "";
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dob = df.format(df.parse(s));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return dob;
    }
    
    public int getAge(){
        return 2021 - Integer.parseInt(dobCa.substring(6));
    }
    
    public long getScore(){
        double bonus = 0;
        if(theoryScore >= 8 && practiceScore >= 8){
           bonus = 1;
        } else if(theoryScore >= 7.5 && practiceScore >= 7.5){
            bonus = 0.5;
        }
        double score = (theoryScore + practiceScore) / 2 + bonus;
        if(score >= 10){
            return 10;
        }
        return Math.round(score);
    }
    
    public String getClassification(){
        String classification = "";
        if(getScore() == 9 || getScore() == 10){
            classification = "Xuat sac";
        } else if(getScore() == 8){
            classification = "Gioi";
        } else if(getScore() == 7){
            classification = "Kha";
        } else if(getScore() == 6 || getScore() == 5){
            classification = "Trung binh";
        } else {
            classification = "Truot";
        }
        return classification;
    }
    
    @Override
    public String toString(){
        return idCa + " " + nameCa + getAge() + " " + getScore() + " " + getClassification();
    }
}
