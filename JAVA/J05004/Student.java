package J05004;

public class Student {
    static byte num = 1;
    private String idSt ,nameSt, classSt, dob;
    private double gpa;

    public Student(String nameSt, String classSt, String dob, double gpa) {
        idSt = "B20DCCN" + String.format("%03d", num++);
        this.nameSt = nameSt;
        this.classSt = classSt;
        this.dob = dob;
        this.gpa = gpa;
    }
    
    public void setNameSt(String nameSt){
        String[] s = nameSt.split("\\s+");
        String newName = "";
        for(int i = 0; i < s.length; i++){
            newName += s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase() + " ";
        }
        this.nameSt = newName;
    }


    public void setDob(String dob) {
        if(dob.charAt(1) == '/'){
            dob = "0" + dob;
        }
        if(dob.charAt(4) == '/'){
            dob = dob.substring(0, 3) + "0" + dob.substring(3);
        }
        this.dob = dob;
    }
    
    @Override
    public String toString(){
        return idSt + " " + nameSt + " " + classSt + " " + dob + " " + String.format("%.2f", gpa);
    }
}
