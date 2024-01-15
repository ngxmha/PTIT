package J06005;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Customer> customers = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String dob = sc.nextLine();
            String address = sc.nextLine();
            customers.add(new Customer(name, gender, dob, address));
        }
        
        ArrayList<Product> products = new ArrayList<>();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++)
        {
            sc.nextLine();
            String name = sc.nextLine();
            String unit = sc.next();
            int buy = sc.nextInt();
            int sell = sc.nextInt();
            products.add(new Product(name, unit, buy, sell));
        }
        
        ArrayList<Bill> bills = new ArrayList<>();
        int k = sc.nextInt();
        for(int i = 0; i < k; i++)
        {
            String idKH = sc.next();
            String idMH = sc.next();
            int quantity = sc.nextInt();
            for(Customer c : customers) {
                if(c.getId().equals(idKH))
                {
                    for(Product p : products) 
                    {
                        if(p.getId().equals(idMH))
                        {
                            bills.add(new Bill(c, p, quantity));
                            break;
                        }
                    }
                    break;
                }
            }
        }
        
        for(Bill b : bills) 
        {
            System.out.println(b);
        }
    }
}
