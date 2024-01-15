package J05003;

public class Student {
    static byte num = 1;
    private String idSt ,nameSt, classSt, dob;
    private double gpa;

    public Student() {
        idSt = "B20DCCN" + String.format("%03d", num++);
        nameSt = "";
        classSt = "";
        dob = "";
        gpa = 0;
    }

    Student(String nameSt, String classSt, String dob, double gpa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setNameSt(String nameSt){
        this.nameSt = nameSt;
    }

    public void setClassSt(String classSt) {
        this.classSt = classSt;
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

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){
        return idSt + " " + nameSt + " " + classSt + " " + dob + " " + String.format("%.2f", gpa);
    }
}
