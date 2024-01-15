package J05028;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Enterprise> arrList = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int quantity = Integer.parseInt(sc.nextLine());
            arrList.add(new Enterprise(id, name, quantity));
        }
        
        arrList.sort(new Comparator<Enterprise>() {
            @Override
            public int compare(Enterprise e1, Enterprise e2) {
                if(e1.getQuantity() == e2.getQuantity()) {
                    return e1.getId().compareTo(e2.getId());
                }
                return e2.getQuantity() - e1.getQuantity();
            }
        });

        for(Enterprise e : arrList) {
            System.out.println(e);
        }
    }
}
