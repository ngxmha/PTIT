package J07018;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = null;
        
        try 
        {
            sc = new Scanner(new File("SINHVIEN.in"));
        } catch (Exception e) 
        {}
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            sc.nextLine();
            String name = sc.nextLine().trim();
            String group = sc.next();
            String dob = sc.next();
            double gpa = sc.nextDouble();
            students.add(new Student(name, group, dob, gpa));
        }
        
        for(Student st : students)
        {
            System.out.println(st);
        }
    }
}
