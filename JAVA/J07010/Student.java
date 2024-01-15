package J07010;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student {
    static byte num = 1;
    
    private String idSt, nameSt, classSt, dob;
    private double gpa;

    public Student(String nameSt, String classSt, String dob, double gpa) throws ParseException {
        idSt = "B20DCCN" + String.format("%03d", num++);
        this.nameSt = nameSt;
        this.classSt = classSt;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.dob = df.format(df.parse(dob));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return idSt + " " + nameSt + " " + classSt + " " + dob + " " + String.format("%.2f", gpa);
    }
        
}
