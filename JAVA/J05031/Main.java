package J05031;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrList = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String Class = sc.nextLine();
            float score1 = Float.parseFloat(sc.nextLine());
            float score2 = Float.parseFloat(sc.nextLine());
            float score3 = Float.parseFloat(sc.nextLine());
            arrList.add(new Student(id, name, Class, score1, score2, score3));
        }
        
        arrList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getName().compareTo(st2.getName());
            }
        });
    
        for(int i = 0; i < arrList.size(); i++) {
            System.out.println(i + 1 + " " + arrList.get(i));
        }
    }
}
