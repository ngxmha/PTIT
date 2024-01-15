package J05045;

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
            String duty = sc.nextLine();
            int basicSalary = Integer.parseInt(sc.nextLine());
            int workDays = Integer.parseInt(sc.nextLine());
            arrList.add(new Employee(name, duty, basicSalary, workDays));
        }
        
        arrList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getEarn() == e2.getEarn()) {
                    return e1.getId().compareTo(e2.getId());
                }
                return e2.getEarn() - e1.getEarn();
            }
        });
        for(Employee e : arrList) {
            System.out.println(e);
        }
    }
}
