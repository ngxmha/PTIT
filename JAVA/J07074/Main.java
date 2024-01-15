package J07074;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = null;
        
        ArrayList<Subject> subjects = new ArrayList<>();
        ArrayList<Schedule> schedules = new ArrayList<>();
    
        sc = new Scanner(new File("MONHOC.in"));
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int credit = sc.nextInt();
            subjects.add(new Subject(id, name, credit));
        }
        
        sc = new Scanner(new File("LICHGD.in"));
        int m = sc.nextInt();
        for(int i = 0; i < m; i++)
        {
            String idSub = sc.next();
            int day = sc.nextInt();
            int kip = sc.nextInt();
            sc.nextLine();
            String nameIns = sc.nextLine();
            String room = sc.next();
            schedules.add(new Schedule(idSub, day, kip, nameIns, room));
        }
       
        Collections.sort(schedules);
        
        String idSub = sc.next();
        for(Subject s : subjects)
        {
            if(s.getId().equals(idSub))
            {
                System.out.println("LICH GIANG DAY MON " + s.getName() + ":");
                break;
            }
        }
        for(Schedule s : schedules)
        {
            if(s.getIdSub().equals(idSub))
                System.out.println(s);
        }
    }
}
