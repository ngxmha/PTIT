package J07054;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("BANGDIEM.in"));
            int n = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < n; i++) {
                String name = sc.nextLine();
                int score1 = Integer.parseInt(sc.nextLine());
                int score2 = Integer.parseInt(sc.nextLine());
                int score3 = Integer.parseInt(sc.nextLine());
                list.add(new Student(name, score1, score2, score3));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if(st1.getAverageScore() > st2.getAverageScore()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        
        list.get(0).setRank(1);
        for(int i = 1; i < list.size(); i++) {
            Student st1 = list.get(i);
            Student st2 = list.get(i - 1);
            if(st1.getAverageScore() == st2.getAverageScore()) {
                st1.setRank(st2.getRank());
            } else {
                st1.setRank(i + 1);
            }
        }
        
        for(Student st : list) {
            System.out.println(st);
        }
    }
}
