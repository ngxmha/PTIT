package J05003;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte N = Byte.parseByte(sc.nextLine());
        for(int i = 0; i < N; i++){
            Student st = new Student();
            String nameSt = sc.nextLine();
            String classSt = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            st.setNameSt(nameSt);
            st.setClassSt(classSt);
            st.setDob(dob);
            st.setGpa(gpa);
            System.out.println(st);
        }
    }
}
