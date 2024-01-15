package J05068;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String id = sc.next();
            int quantity = sc.nextInt();
            products.add(new Product(id, quantity));
        }
        
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p2.getTotal() > p1.getTotal() ? 1 : -1;
            }
        });
        for(Product p : products) {
            System.out.println(p);
        }
    }
}
