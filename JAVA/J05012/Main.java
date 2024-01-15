package J05012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int quantity = sc.nextInt();
            long unitPrice = sc.nextLong();
            int chietKhau = sc.nextInt();
            products.add(new Product(id, name, quantity, unitPrice, chietKhau));
        }
        
        Collections.sort(products);
        
        for(Product p : products) {
            System.out.println(p);
        }
    }
}
