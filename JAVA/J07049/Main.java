package J07049;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        
        ArrayList<Product> products = new ArrayList<>();
        int n = sc.nextInt();
        while(n-- > 0)
        {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            int guarantee = sc.nextInt();
            products.add(new Product(id, name, price, guarantee));
        }
        
        ArrayList<Customer> customers = new ArrayList<>();
        int m = sc.nextInt();
        while(m-- > 0)
        {
            sc.nextLine();
            String name = sc.nextLine();
            String addr = sc.nextLine();
            String idPro = sc.next();
            int quantity = sc.nextInt();
            String date = sc.next();
            
            for(Product p : products)
            {
                if(p.getId().equals(idPro))
                {
                    customers.add(new Customer(name, addr, p, quantity, date));
                    break;
                }
            }
        }
        
        Collections.sort(customers);
        
        for(Customer c : customers)
        {
            System.out.println(c);
        }
    }
}
