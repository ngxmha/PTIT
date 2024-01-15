package J05044;

import java.util.ArrayList;
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
        
        String search = sc.next();
        for(Employee e : arrList) {
            if(e.getDuty().equals(search)) {
                System.out.println(e);
            }
        }
    }
}
