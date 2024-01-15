package J05078;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Department> deparments = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String id = sc.next();
            String name = sc.nextLine().trim();
            deparments.add(new Department(id, name));
        }
        
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int basicSalary = sc.nextInt();
            int workDay = sc.nextInt();
            for(Department dep : deparments) {
                if(id.substring(3).equals(dep.getId()))
                    employees.add(new Employee(id, name, basicSalary, workDay, dep));
            }
        }
        
        String search = sc.next();
        for(Department dep : deparments) {
            if(dep.getId().equals(search)) {
                System.out.println("Bang luong phong " + dep.getName() + ":");
                break;
            }
        }
        for(Employee e : employees) {
            if(e.getId().substring(3).equals(search))
                System.out.println(e);
        }
    }
}
