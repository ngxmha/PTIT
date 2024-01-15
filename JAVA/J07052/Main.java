package J07052;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Candidate> list = new ArrayList<>();
        int targets = 1;
        try {
            Scanner sc = new Scanner(new File("THISINH.in"));
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                String idCa = sc.nextLine();
                String nameCa = sc.nextLine();
                double mathScore = Double.parseDouble(sc.nextLine());
                double physScore = Double.parseDouble(sc.nextLine());
                double chemScore = Double.parseDouble(sc.nextLine());
                list.add(new Candidate(idCa, nameCa, mathScore, physScore, chemScore));
            }
            targets = Integer.parseInt(sc.nextLine());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        list.sort(new Comparator<Candidate>(){
            @Override
            public int compare(Candidate c1, Candidate c2){
                if(c1.getScore() == c2.getScore()){
                    return c1.getIdCa().compareTo(c2.getIdCa());
                } else {
                    if(c1.getScore() > c2.getScore()){
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
        });
        
        double benchMark = list.get(targets - 1).getScore();
        for(Candidate c : list){
            c.setStatus(benchMark);
        }
        System.out.printf("%.1f\n", benchMark);
        for(Candidate c : list){
            System.out.println(c);
        }
    }
}
