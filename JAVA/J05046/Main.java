package J05046;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
         
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int quantity = Integer.parseInt(sc.nextLine());
            int unitPrice = Integer.parseInt(sc.nextLine());
            products.add(new Product(name, quantity, unitPrice));
        }
        
        for(Product p : products) {
            System.out.println(p);
        }
    }
}
