package J05023;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String stClass = sc.nextLine();
            String email = sc.nextLine();
            list.add(new Student(id, name, stClass, email));
        }
        
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < q; i++) {
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
            for(Student st : list) {
                if(st.getStClass().substring(1, 3).equals(s.substring(2, 4)) == true) {
                    System.out.println(st);
                }
            }
        }
    }
}
