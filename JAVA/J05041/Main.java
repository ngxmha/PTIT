package J05041;

import java.util.ArrayList;
import java.util.Comparator;
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
        
        arrList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e2.getTolal() - e1.getTolal();
            }
        });
        for(Employee e : arrList) {
            System.out.println(e);
        }
    }
}
