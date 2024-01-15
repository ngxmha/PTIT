package J07033;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String idSt = sc.nextLine();
            String nameSt = sc.nextLine();
            String classSt = sc.nextLine();
            String emailSt = sc.nextLine();
            list.add(new Student(idSt, nameSt, classSt, emailSt));
        }
        
        list.sort(new Comparator<Student>(){
            @Override
            public int compare(Student st1, Student st2){
                return st1.getIdSt().compareTo(st2.getIdSt());
            }
        });
        
        for(Student st : list){
            System.out.println(st);
        }
    }
}
