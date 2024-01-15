package J05005;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte N = Byte.parseByte(sc.nextLine());
        ArrayList<Student> arr = new ArrayList<>();
        for(int i = 0; i < N; i++){
            String nameSt = sc.nextLine().trim();
            String classSt = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            Student st = new Student(nameSt, classSt, dob, gpa);
            st.setNameSt(nameSt);
            st.setDob(dob);
            arr.add(st);
        }
        
        arr.sort(new Comparator<Student>(){
            @Override
            public int compare(Student st1, Student st2){
                if(st1.getGpa() > st2.getGpa()){
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for(Student st : arr){
            System.out.println(st);
        }
    }
}
