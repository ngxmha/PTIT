package J05014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> teachers = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String idXetTuyen = sc.next();
            double diemTin = sc.nextDouble();
            double diemChuyenMon = sc.nextDouble();
            teachers.add(new Teacher(name, idXetTuyen, diemTin, diemChuyenMon));
        }
        
        Collections.sort(teachers);
        
        for(Teacher t : teachers) {
            System.out.println(t);
        }
    }
}
