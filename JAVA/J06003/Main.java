package J06003;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Group> groups = new ArrayList<>();
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String phoneNum = sc.next();
            int sttGroup = sc.nextInt();
            students.add(new Student(id, name, phoneNum, sttGroup));
        }
        
        sc.nextLine();
        for(int i = 1; i <= m; i++) {
            String name = sc.nextLine();
            groups.add(new Group(i, name));
        }
        
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int j = sc.nextInt();
            System.out.println("DANH SACH NHOM " + j + ":");
            for(Student st : students) {
                if(st.getSttGroup() == j) {
                    System.out.println(st);
                }
            }
            System.out.println("Bai tap dang ky: " + groups.get(j - 1).getName());
        }
    }
}
