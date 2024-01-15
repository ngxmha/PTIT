package J05066;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
     public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            String id = sc.next();
            String name = sc.nextLine().trim();
            employees.add(new Employee(id, name));
        }
        
        Collections.sort(employees);
        
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < m; i++) 
        {
            String search = sc.nextLine();
            for(Employee e : employees)
            {
                if(e.getName().toLowerCase().contains(search.toLowerCase()))
                    System.out.println(e);
            }
            System.out.println();
        }
    }
}
