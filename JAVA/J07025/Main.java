package J07025;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner sc = null;
        
        try 
        {
            sc = new Scanner(new File("KHACHHANG.in"));
        } catch (FileNotFoundException e) 
        {}
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine().trim();
            String gender = sc.next();
            String dob = sc.next();
            sc.nextLine();  
            String address = sc.nextLine();
            customers.add(new Customer(name, gender, dob, address));
        }
        
        customers.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                return c1.getDobTypeDate(c1.getDob()).compareTo(c2.getDobTypeDate(c2.getDob()));
            }
        });
        
        for(Customer c : customers) {
            System.out.println(c);
        }
    }
}
