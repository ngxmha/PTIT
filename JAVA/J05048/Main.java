package J05048;

import java.util.ArrayList;
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
        
        for(Product p : products) {
            System.out.println(p);
        }
    }
}
