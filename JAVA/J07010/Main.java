package J07010;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        ArrayList<Student> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String nameSt = sc.nextLine();
            String classSt = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            list.add(new Student(nameSt, classSt, dob, gpa));
        }
        
        for(Student st : list){
            System.out.println(st);
        }
    }
}
