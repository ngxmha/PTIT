package J05079;

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
                    return s1.getGroup().compareTo(s2.getGroup());
                }
            });
        
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            String id = sc.next();
            boolean check = false;
            
            for(Subject s : subjects) {
                if(s.getId().equals(id)) {
                    if(!check) {
                        System.out.println("Danh sach nhom lop mon " + s.getName() + ":");
                        check = true;
                    }
                    System.out.println(s);
                }
            }
        }
    }
}
