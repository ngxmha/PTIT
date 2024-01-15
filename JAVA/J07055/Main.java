package J07055;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<Student> list = new ArrayList<>();
        byte n = Byte.parseByte(sc.nextLine());
        for(int i = 0; i < n; i++){
            String nameSt = sc.nextLine();
            double score1 = Byte.parseByte(sc.nextLine()) *  0.25;
            double score2 = Byte.parseByte(sc.nextLine()) *  0.35;
            double score3 = Byte.parseByte(sc.nextLine()) *  0.4;
            list.add(new Student(nameSt, score1 + score2 + score3));
        }
        
        list.sort(new Comparator<Student>(){
           @Override
           public int compare(Student st1, Student st2){
               if(st1.getAverageScore() > st2.getAverageScore()){
                   return -1;
               } else {
                   return 1;
               }
           }
        });
        
        for(Student st : list){
            System.out.println(st);
        }
    }
}
