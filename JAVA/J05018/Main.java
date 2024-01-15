package J05018;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        float[] f = new float[10];
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for(int j = 0; j < 10; j++) {
                f[j] = sc.nextFloat();
            }
            sc.nextLine();
            list.add(new Student(s, f));
        }
        
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if(st1.getAverageScore() == st2.getAverageScore()) {
                    return st1.getId().compareTo(st2.getId());
                } else {
                    return st1.getAverageScore() > st2.getAverageScore() ? -1 : 1;
                }
            }
        });
       
        for(Student st : list) {
            System.out.println(st);
        }
    }
}
