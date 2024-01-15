package J05073;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            String id = sc.next();
            int unit = sc.nextInt();
            int quantity = sc.nextInt();
            products.add(new Product(id, unit, quantity));
        }
        
        for(Product p : products) 
        {
            System.out.println(p);
        }
    }
}
