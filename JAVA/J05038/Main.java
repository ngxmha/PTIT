package J05038;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> arrList = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int salaryWorkDay = Integer.parseInt(sc.nextLine());
            int WorkDays = Integer.parseInt(sc.nextLine());
            String duty = sc.nextLine();
            arrList.add(new Employee(name, salaryWorkDay, WorkDays, duty));
        }
        
        int total = 0;
        for(Employee e : arrList) {
            total += e.getTolal();
            System.out.println(e);
        }
        System.out.println("Tong chi phi tien luong: " + total);
    }
}
