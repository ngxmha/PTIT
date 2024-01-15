package J07057;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
       
    public static void main(String[] args) {
        ArrayList<Candidate> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("THISINH.in"));
            int n = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < n; i++){
                String nameCa = sc.nextLine();
                float score = Float.parseFloat(sc.nextLine());
                String ethnic = sc.nextLine();
                int area = Integer.parseInt(sc.nextLine());
                list.add(new Candidate(nameCa, score, ethnic, area));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        list.sort(new Comparator<Candidate>(){
            @Override
            public int compare(Candidate c1, Candidate c2){
                return c1.getTotalScore() > c2.getTotalScore() ? -1 : 1;
            }
        });
        
        for(Candidate c : list){
            System.out.println(c);
        }
    }
}
