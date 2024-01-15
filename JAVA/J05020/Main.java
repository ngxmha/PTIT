package J05020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String stClass = sc.nextLine();
            String email = sc.nextLine();
            list.add(new Student(id, name, stClass, email));
        }
        
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if(st1.getStClass().equals(st2.getStClass())) {
                    return st1.getId().compareTo(st2.getId());
                } 
                return st1.getStClass().compareTo(st2.getStClass());
            }
        });
        
        for(Student st : list) {
            System.out.println(st);
        }
    }
}
