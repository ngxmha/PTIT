package J06008;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<Subject> subjects = new ArrayList<>();
        for(int i = 0; i < n; i++) 
        {
            String id = sc.next();
            String name = sc.nextLine().trim();
            subjects.add(new Subject(id, name));
        }
        
        int m = sc.nextInt();
        ArrayList<Instructor> instructors = new ArrayList<>();
        for(int i = 0; i < m; i++)
        {
            String id = sc.next();
            String name = sc.nextLine().trim();
            instructors.add(new Instructor(id, name));
        }
        
        int k = sc.nextInt();
        ArrayList<LopHocPhan> list = new ArrayList<>();
        for(int i = 0; i < k; i++)
        {
            String insId = sc.next();
            String subId = sc.next();
            double time = sc.nextDouble();
            list.add(new LopHocPhan(insId, subId, time));
        }
        
        String id = sc.next();
        Instructor ins = null;
        for(Instructor i : instructors)
        {
            if(i.getId().equals(id))
            {
                ins = i;
                break;
            }
        }
        
        System.out.println("Giang vien: " + ins.getName());
        double time = 0;
        for(LopHocPhan lop : list)
        {
            if(lop.getInsId().equals(ins.getId()))
            {
                for(Subject s : subjects)
                {
                    if(lop.getSubId().equals(s.getId()))
                    {
                        System.out.println(s.getName() + " " + lop.getTime());
                        break;
                    }
                }
                time += lop.getTime();
            }
        }
        System.out.printf("Tong: %.2f\n", time);
    }
}
