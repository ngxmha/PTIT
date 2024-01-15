package J05026;

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
        
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < q; i++) {
            String s = sc.nextLine();  
            String search = "";
            String[] arr = s.split(" ");
            for(int j = 0; j < arr.length; j++) {
                search += arr[j].substring(0, 1).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + search + ":");
            for(Instructor ins : list) {
                if(ins.getSubject().equals(search)) {
                    System.out.println(ins);
                }
            }            
        }
    }
}
