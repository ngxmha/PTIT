package J05021;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while(sc.hasNextLine()) {
            String id = sc.nextLine();
            if(id.isEmpty()) {
                break;
            }
            String name = sc.nextLine();
            String stClass = sc.nextLine();
            String email = sc.nextLine();
            list.add(new Student(id, name, stClass, email));
        }
        
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getId().compareTo(st2.getId());
            }
        });
        
        for(Student st : list) {
            System.out.println(st);
        }
    }
}