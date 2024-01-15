package J05017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            int oldIndex = sc.nextInt();
            int newIndex = sc.nextInt();
            customers.add(new Customer(name, oldIndex, newIndex));
        }
        
        Collections.sort(customers);
        
        for(Customer c : customers) {
            System.out.println(c);
        }
    }
}
