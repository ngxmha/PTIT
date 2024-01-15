package J05076;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product_Type> products_type = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            char type = sc.nextLine().charAt(0);
            products_type.add(new Product_Type(id, name, type));
        }
        
        ArrayList<Product> products = new ArrayList<>();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            String id = sc.next();
            int quantityImport = sc.nextInt();
            int unitPrice = sc.nextInt();
            int quantityExport = sc.nextInt();
            for(Product_Type p : products_type) {
                if(p.getId().equals(id))
                    products.add(new Product(p, quantityImport, unitPrice, quantityExport));
            }
        }
        
        for(Product p : products) {
            System.out.println(p);
        }
    }
}
