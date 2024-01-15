package J05057;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Candidate> candidates = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            float markMath = Float.parseFloat(sc.nextLine());    
            float markPhys = Float.parseFloat(sc.nextLine());
            float markChem = Float.parseFloat(sc.nextLine());
            candidates.add(new Candidate(code, name, markMath, markPhys, markChem));
        }
        
        for(Candidate c : candidates) {
            System.out.println(c);
        }
    }
}