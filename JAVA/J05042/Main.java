package J05042;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrList = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int AC = Integer.parseInt(sc.next());
            int submits = Integer.parseInt(sc.next());
            sc.nextLine();
            arrList.add(new Student(name, AC, submits));
        }
        
        arrList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if(st1.getAC() == st2.getAC()) {
                    if(st1.getSubmits() == st2.getSubmits()) {
                        return st1.getName().compareTo(st2.getName());
                    }
                    return st1.getSubmits() - st2.getSubmits();
                }
                return st2.getAC() - st1.getAC();
            }
        });
        
        for(Student st : arrList) {
            System.out.println(st);
        }
    }
}
