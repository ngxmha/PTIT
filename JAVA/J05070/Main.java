package J05070;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CLB> arrList1 = new ArrayList<>();
        ArrayList<Match> arrList2 = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            arrList1.add(new CLB(id, name, price));
        }
        
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++) {
            String name = sc.next();
            int quantity = Integer.parseInt(sc.next());
            for(CLB c : arrList1) {
                if(c.getId().equals(name.substring(1, 3))) {
                    arrList2.add(new Match(name, c, quantity));
                    break;
                }
            }
        }
        
        arrList2.sort(new Comparator<Match>() {
            @Override
            public int compare(Match m1, Match m2) {
                if(m1.getProceed() == m2.getProceed()) {
                    return m1.getClbName().compareTo(m2.getClbName());
                }
                return m2.getProceed() - m1.getProceed();
            }
        });
        
        for(Match match : arrList2) {
            System.out.println(match);
        }
    }
}
