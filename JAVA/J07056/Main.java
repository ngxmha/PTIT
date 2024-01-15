package J07056;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        List<Bill> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("KHACHHANG.in"));
            int n = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < n; i++) {
                String name = sc.nextLine();
                String s = sc.nextLine();
                list.add(new Bill(name, s));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        list.sort(new Comparator<Bill>() {
            @Override 
            public int compare(Bill b1, Bill b2) {
                return b2.getTotalBill() - b1.getTotalBill();
            }
        });
        
        for(Bill b : list) {
            System.out.println(b);
        }
    }
}
