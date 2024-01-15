package J05074;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String group = sc.nextLine();
            students.add(new Student(id, name, group));
        }
        
        for(int i = 0; i < n; i++) {
            String id = sc.next();
            String s = sc.next();
            for(Student st : students) {
                if(st.getId().equals(id)) {
                    st.setChuyenCan(s);
                    break;
                }
            }
        }
        
        for(Student st : students) {
            System.out.println(st);
        }
    }
}
