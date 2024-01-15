package J05011;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Gamer> list = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String in = sc.nextLine();
            String out = sc.nextLine();
            list.add(new Gamer(id, name, in, out));
        }
        
        list.sort(new Comparator<Gamer>() {
            @Override
            public int compare(Gamer g1, Gamer g2) {
                return g2.getTime() - g1.getTime();
            }
        });
        
        for(Gamer g : list) {
            System.out.println(g);
        }
    }
}
