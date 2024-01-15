package J05062;

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
            sc.nextLine();
            String name = sc.nextLine();
            double gpa = sc.nextDouble();
            int drl = sc.nextInt();
            students.add(new Student(name, gpa, drl));
        }
        
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if(st1.getGpa() == st2.getGpa())
                    return st2.getDrl() - st1.getDrl();
                return st2.getGpa() > st1.getGpa() ? 1 : -1;
            }
        }); 
        
        for(int i = m; i < students.size(); i++) {
            if(students.get(i).getGpa() < students.get(m - 1).getGpa())
                students.get(i).setStatusHocBong("KHONG");
        }
        
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getId().compareTo(st2.getId());
            }
        }); 
        
        for(Student st : students) {
            System.out.println(st.getName() + ": " + st.getStatusHocBong());
        }
    }
}
