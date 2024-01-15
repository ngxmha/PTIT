package J07058;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
       
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> arr = new ArrayList<Subject>();
        byte n = Byte.parseByte(sc.nextLine());
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String form = sc.nextLine();
            arr.add(new Subject(id, name, form));
        }
        
        arr.sort(new Comparator<Subject>(){
            @Override 
            public int compare(Subject s1, Subject s2){
                return s1.getId().compareTo(s2.getId());
            }
        });
        for(Subject s : arr){
            System.out.println(s);
        }
    }
}
