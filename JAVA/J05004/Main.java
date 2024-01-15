package J05004;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte N = Byte.parseByte(sc.nextLine());
        for(int i = 0; i < N; i++){
            String nameSt = sc.nextLine().trim();
            String classSt = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            Student st = new Student(nameSt, classSt, dob, gpa);
            st.setNameSt(nameSt);
            st.setDob(dob);
            System.out.println(st);
        }
    }
}
