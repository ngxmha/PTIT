package J05022;

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
            System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
            for(Student st : list) {
                if(st.getStClass().equals(s) == true) {
                    System.out.println(st);
                }
            }
        }
    }
}
