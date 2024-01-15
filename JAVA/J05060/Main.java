package J05060;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String dob = sc.nextLine();
            double theoryScore = Double.parseDouble(sc.nextLine());
            double practiceScore = Double.parseDouble(sc.nextLine());
            employees.add(new Employee(name, dob, theoryScore, practiceScore));
        }
        
        for(Employee e : employees) {
            System.out.println(e);
        }
    }
}
