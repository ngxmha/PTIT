package J05061;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
        
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getAverageScore() == e2.getAverageScore()) {
                    return e1.getId().compareTo(e2.getId());
                }
                return e1.getAverageScore() < e2.getAverageScore() ? 1 : -1;
            }
        });
        
        for(Employee e : employees) {
            System.out.println(e);
        }
    }
}
