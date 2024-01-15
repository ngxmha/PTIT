package J07034;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> arr = new ArrayList<Subject>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String idSub = sc.nextLine();
            String nameSub = sc.nextLine();
            byte credits = Byte.parseByte(sc.nextLine());
            arr.add(new Subject(idSub, nameSub, credits));
        }
        
        arr.sort(new Comparator<Subject>(){
            @Override
            public int compare(Subject s1, Subject s2){
                return s1.getNameSub().compareTo(s2.getNameSub());
            }
        });
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
