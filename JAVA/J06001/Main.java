package J06001;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Type> types = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) 
        {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int unit1 = sc.nextInt();
            int unit2 = sc.nextInt();
            types.add(new Type(id, name, unit1, unit2));
        }
        
        ArrayList<Bill> bills = new ArrayList<>();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) 
        {
            String id = sc.next();
            int quantity = sc.nextInt();
            for(Type t : types)
            {
                if(t.getId().equals(id.substring(0, 2)))
                {
                    bills.add(new Bill(id, quantity, t));
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
