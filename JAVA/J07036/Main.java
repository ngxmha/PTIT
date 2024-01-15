package J07036;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner sc = null;
        
        sc = new Scanner(new File("SINHVIEN.in"));
        
        ArrayList<Student> students = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String group = sc.next();
            String email = sc.next();
            students.add(new Student(id, name, group, email));
        }
        
        sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> subjects = new ArrayList<>();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++)
        {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int credit = sc.nextInt();
            subjects.add(new Subject(id, name, credit));
        }
        
        sc = new Scanner(new File("BANGDIEM.in"));
        
        ArrayList<BangDiem> bangdiems = new ArrayList<>();
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            String idSt = sc.next();
            String idSub = sc.next();
            float score = sc.nextFloat();
            
            Student student = null;
            for(Student st : students)
            {
                if(st.getId().equals(idSt))
                {
                    student = st;
                    break;
                }
            }
            
            Subject subject = null;
            for(Subject sub : subjects)
            {
                if(sub.getId().equals(idSub))
                {
                    subject = sub;
                    break;
                }
            }
            
            bangdiems.add(new BangDiem(student, subject, score));
        }
        
        Collections.sort(bangdiems);
        
        int q = sc.nextInt();
        for(int i = 0; i < q; i++)
        {
            String group = sc.next();
            for(Student st : students)
            {
                if(st.getGroup().equals(group))
                {
                    System.out.println("BANG DIEM lop " + st.getGroup()+ ":");
                    break;
                }
            }
            
            for(BangDiem bd : bangdiems)
            {
                if(bd.getGroupStudent().equals(group))
                {
                    System.out.println(bd);
                }
            }
        }
    }
}
