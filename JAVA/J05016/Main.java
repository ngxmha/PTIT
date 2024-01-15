package J05016;

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
            int room = sc.nextInt();
            String checkIn = sc.next();
            String checkOut = sc.next();
            int extra = sc.nextInt();
            customers.add(new Customer(name, room, checkIn, checkOut, extra));
        }
                
        Collections.sort(customers);
        
        for(Customer c : customers)
            System.out.println(c);
   }
}
