package J07053;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Candidate> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("XETTUYEN.in"));
            int n = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < n; i++){
                String nameCa = sc.nextLine();
                String dobCa = sc.nextLine();
                double theoryScore = Double.parseDouble(sc.nextLine());
                double practiceScore = Double.parseDouble(sc.nextLine());
                list.add(new Candidate(nameCa, dobCa, theoryScore, practiceScore));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        for(Candidate c : list){
            System.out.println(c);
        }
    }
}
