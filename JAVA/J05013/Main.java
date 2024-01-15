package J05013;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double theoryScore = sc.nextDouble();
            double practiceScore = sc.nextDouble();
            employees.add(new Employee(name, theoryScore, practiceScore));
        }
        
        Collections.sort(employees);
        
        for(Employee e : employees) {
            System.out.println(e);
        }
    }
}
