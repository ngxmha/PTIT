package J07028;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner sc = null;
        
        try 
        {
            sc = new Scanner(new File("MONHOC.in"));
        } 
        catch (FileNotFoundException e) 
        {}
        
        int n = sc.nextInt();
        ArrayList<Subject> subjects = new ArrayList<>();
        for(int i = 0; i < n; i++) 
        {
            String id = sc.next();
            String name = sc.nextLine().trim();
            subjects.add(new Subject(id, name));
        }
        
         try 
        {
            sc = new Scanner(new File("GIANGVIEN.in"));
        } 
        catch (FileNotFoundException e) 
        {}
        
        int m = sc.nextInt();
        ArrayList<Instructor> instructors = new ArrayList<>();
        for(int i = 0; i < m; i++)
        {
            String id = sc.next();
            String name = sc.nextLine().trim();
            instructors.add(new Instructor(id, name));
        }
        
         try 
        {
            sc = new Scanner(new File("GIOCHUAN.in"));
        } 
        catch (FileNotFoundException e) 
        {}
        
        int k = sc.nextInt();
        ArrayList<LopHocPhan> list = new ArrayList<>();
        for(int i = 0; i < k; i++)
        {
            String insId = sc.next();
            String subId = sc.next();
            double time = sc.nextDouble();
            list.add(new LopHocPhan(insId, subId, time));
        }
        
        for(Instructor ins : instructors)
        {
            double time = 0;
            for(LopHocPhan lop : list)
            {
                if(lop.getInsId().equals(ins.getId()))
                {
                    time += lop.getTime();
                }
            }
            ins.setTimeTotal(time);
        }
        
        for(Instructor ins : instructors)
        {
            System.out.println(ins);
        }
    }
}
