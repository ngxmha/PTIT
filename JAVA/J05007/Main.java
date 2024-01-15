package J05007;

import java.util.ArrayList;
import java.util.Comparator;
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
        
        arr.sort(new Comparator<Employee>(){
            @Override
            public int compare(Employee e1, Employee e2){
                String s1 = e1.getDob(), s2 = e2.getDob();
                if(s1.substring(6).equals(s2.substring(6))){
                    if(s1.substring(3, 5).equals(s2.substring(3, 5))){
                        return s1.substring(0, 2).compareTo (s2.substring(0, 2));
                    } else {
                        return s1.substring(3, 5).compareTo(s2.substring(3, 5));
                    }
                } else {
                    return s1.substring(6).compareTo(s2.substring(6));
                }
            }
        });
        for(Employee e : arr){
            System.out.println(e);
        }
    }
}
