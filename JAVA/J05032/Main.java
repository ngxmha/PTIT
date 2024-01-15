package J05032;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> arrList = new ArrayList<>();

        int n = Integer.parseInt(sc.next());
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            String dob = sc.next();
            arrList.add(new Person(name, dob));
        }
        
        arrList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if(p1.getDob().substring(6).equals(p2.getDob().substring(6))) {
                    if(p1.getDob().substring(3, 5).equals(p2.getDob().substring(3, 5))) {
                        return p1.getDob().substring(0, 2).compareTo(p2.getDob().substring(0, 2));
                    } else {
                        return p1.getDob().substring(3, 5).compareTo(p2.getDob().substring(3, 5));
                    }
                }
                return p1.getDob().substring(6).compareTo(p2.getDob().substring(6));
            }
        });
        
        System.out.printf("%s\n%s", arrList.get(arrList.size() - 1).getName(), arrList.get(0).getName());
    }
}
