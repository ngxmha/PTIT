package J05036;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> arrList = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String unit = sc.nextLine();
            int unitPrice = Integer.parseInt(sc.nextLine());
            int quantity = Integer.parseInt(sc.nextLine());
            arrList.add(new Product(name, unit, unitPrice, quantity));
        }
        
        for(Product p : arrList) {
            System.out.println(p);
        }
    }
}
