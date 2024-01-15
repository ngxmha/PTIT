package J07047;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner sc = new Scanner(new File("DATA.in"));
        
        ArrayList<Room> rooms = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            char sign = sc.next().charAt(0);
            String type = sc.next();
            int unit = sc.nextInt();
            double fee = sc.nextFloat();
            rooms.add(new Room(sign, type, unit, fee));
        }
        
        ArrayList<Customer> customers = new ArrayList<>();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++)
        {
            sc.nextLine();
            String name = sc.nextLine();
            String room = sc.next();
            String checkIn = sc.next();
            String checkOut = sc.next();
            customers.add(new Customer(name, room, checkIn, checkOut, rooms));
        }
        
        Collections.sort(customers);
        
        for(Customer c : customers)
        {
            System.out.println(c);
        }
    }
}
