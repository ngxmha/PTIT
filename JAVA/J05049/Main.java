package J05049;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String id = sc.nextLine();
            int quantityImport = Integer.parseInt(sc.nextLine());
            products.add(new Product(id, quantityImport));
        }
        
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return (int)(p2.getFax() - p1.getFax());
            }
        });
        
        char c = sc.next().charAt(0);
        for(Product p : products) {
            if(p.getId().charAt(0) == c) {
                System.out.println(p);
            }
        }
    }
}
