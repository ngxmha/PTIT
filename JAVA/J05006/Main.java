package J05006;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte N = Byte.parseByte(sc.nextLine());
        ArrayList<Employee> arr = new ArrayList<>();
        
        for(int i = 0; i < N; i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            String s4 = sc.nextLine();
            String s5 = sc.nextLine();
            String s6 = sc.nextLine();
            arr.add(new Employee(s1, s2, s3, s4, s5, s6));
        }
        
        for(Employee e : arr){
            System.out.println(e);
        }
    }
}
