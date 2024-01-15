package J05080;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Subject> subjects = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String group = sc.next();
            sc.nextLine();
            String nameInstructor = sc.nextLine();
            subjects.add(new Subject(id, name, group, nameInstructor));
        }
        
        subjects.sort(new Comparator<Subject>() {
                @Override
                public int compare(Subject s1, Subject s2) {
                    if(s1.getId().equals(s2.getId())) {
                        return s1.getGroup().compareTo(s2.getGroup());
                    }
                    return s1.getId().compareTo(s2.getId());
                }
            });
        
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < m; i++) {
            String nameInstructor = sc.nextLine();
            boolean check = false;
            
            for(Subject s : subjects) {
                if(s.getNameInstructor().equals(nameInstructor)) {
                    if(!check) {
                        System.out.println("Danh sach cho giang vien " + s.getNameInstructor()+ ":");
                        check = true;
                    }
                    System.out.println(s);
                }
            }
        }
    }
}
