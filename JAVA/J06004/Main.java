package J06004;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
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
            for(Student st : students) {
                if(st.getSttGroup() == i) 
                    st.setNameGroup(name);
            }
        }
        
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getId().compareTo(st2.getId());
            }
        });
        
        for(Student st : students) {
            System.out.println(st);
        }
    }
}
