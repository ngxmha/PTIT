package J05009;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Candidate> arr = new ArrayList<>();
        int N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < N; i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double c = Double.parseDouble(sc.nextLine());
            arr.add(new Candidate(s1, s2, a + b + c));
        }
        
        arr.sort(new Comparator<Candidate>(){
           @Override
           public int compare(Candidate c1, Candidate c2){
               if(c1.getScore() != c2.getScore()){
                return -(int)(c1.getScore() - c2.getScore());
               } else {
                   return c1.getId() - c2.getId();
               }
           }
        });
        
        double d = arr.get(0).getScore();
        for(Candidate c : arr){
            if(c.getScore() == d){
                System.out.println(c);
            }
        }
    }
}
