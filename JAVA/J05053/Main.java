package J05053;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String id = sc.nextLine();
            int unitPrice = Integer.parseInt(sc.nextLine());
            int quantity = Integer.parseInt(sc.nextLine());
            products.add(new Product(name, id, unitPrice, quantity));
        }
        
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getSTT().compareTo(p2.getSTT());
            }
        });
        for(Product p : products) {
            System.out.println(p);
        }
    }
}
