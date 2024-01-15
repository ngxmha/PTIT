package J05025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Instructor> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String subject = sc.nextLine();
            list.add(new Instructor(name, subject));
        }
        
        list.sort(new Comparator<Instructor>() {
            @Override
            public int compare(Instructor i1, Instructor i2) {
                if(i1.getLastName().equals(i2.getLastName())) {
                    return i1.getId().compareTo(i2.getId());
                }
                return i1.getLastName().compareTo(i2.getLastName());
            }
        });
        
        for(Instructor i : list) {
            System.out.println(i);
        }
    }
}
