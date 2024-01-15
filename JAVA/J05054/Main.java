package J05054;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            float averageScore = Float.parseFloat(sc.nextLine());
            students.add(new Student(name, averageScore));
        }
        
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st2.getAverageScore() > st1.getAverageScore() ? 1 : -1; 
            }
        });
        students.get(0).setRank(1);
        for(int i = 1; i < students.size(); i++) {
            Student st1 = students.get(i - 1);
            Student st2 = students.get(i);
            if(st2.getAverageScore() == st1.getAverageScore()) {
                st2.setRank(st1.getRank());
            } else {
                st2.setRank(i + 1);
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
