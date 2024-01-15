package J07027;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner sc = null;
        
        ArrayList<Student> students = new ArrayList<>();
        
        sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String phone = sc.next();
            students.add(new Student(id, name, phone));
        }
        
        ArrayList<Exercise> exercises = new ArrayList<>();
        
        sc = new Scanner(new File("BAITAP.in"));
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < m; i++)
        {
            String name = sc.nextLine();
            exercises.add(new Exercise(name));
        }
        
        sc = new Scanner(new File("NHOM.in"));
        for(int i = 0; i < n; i++)
        {
            String id = sc.next();
            int stt = sc.nextInt();
            for(Student st : students)
            {
                if(st.getId().equals(id))
                {
                    for(Exercise e : exercises)
                    {
                        if(e.getStt() == stt)
                        {
                            st.setExc(e);
                            break;
                        }
                    }
                    break;
                }
            }
        }
        
        Collections.sort(students);
        
        for(Student st : students)
        {
            System.out.println(st);
        }
    }
}
