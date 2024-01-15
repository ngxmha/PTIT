package J05027;

import java.util.ArrayList;
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
        
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < q; i++) {
            String search = sc.nextLine();  
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + search + ":");
            for(Instructor ins : list) {
                if(ins.getName().toLowerCase().contains(search.toLowerCase())) {
                    System.out.println(ins);
                }
            }            
        }
    }
}
