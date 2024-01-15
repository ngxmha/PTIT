package J07059;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        List<Exam> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("CATHI.in"));
            int n = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < n; i++) {
                String date = sc.nextLine();
                String time = sc.nextLine();
                String room = sc.nextLine();
                list.add(new Exam(date, time, room));
            } 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        list.sort(new Comparator<Exam>() {
            @Override
            public int compare(Exam e1, Exam e2) {
                if(e1.getDate().equals(e2.getDate())) {
                    if(e1.getTime().equals(e2.getTime())) {
                        return e1.getId().compareTo(e2.getId());
                    } else {
                        return e1.getTime().compareTo(e2.getTime());
                    }
                }
                return e1.getDate().compareTo(e2.getDate());
            }
        });
        
        for(Exam e : list) {
            System.out.println(e);
        }
    }    
}
