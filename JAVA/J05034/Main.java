package J05034;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrList = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String Class = sc.nextLine();
            String email = sc.nextLine();
            String nameEnterprise = sc.nextLine();
            arrList.add(new Student(id, name, Class, email, nameEnterprise));
        }
        
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < q; i++) {
            String s = sc.next();
            ArrayList<Student> arrListTmp = new ArrayList<>();
            for(Student st : arrList) {
                if(st.getNameEnterprise().equals(s)) {
                    arrListTmp.add(st);
                }
            }
            
            arrListTmp.sort(new Comparator<Student>() {
                @Override
                public int compare(Student st1, Student st2) {
                    return st1.getName().compareTo(st2.getName());
                }
            });
            
            for(Student st : arrListTmp) {
                System.out.println(st);
            }
        }
    }
}
