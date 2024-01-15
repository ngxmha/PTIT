package J05051;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n; i++) {
            String type = sc.nextLine();
            int oldIndex = Integer.parseInt(sc.nextLine());
            int newIndex = Integer.parseInt(sc.nextLine());
            customers.add(new Customer(type, oldIndex, newIndex));
        }
        
        customers.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                return c2.getTotal() - c1.getTotal();
            }
        });
        for(Customer c : customers) {
            System.out.println(c);
        }
    }
}
