package J07081;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
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
        } catch (FileNotFoundException e) 
        {}
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String phone = sc.next();
            String email = sc.next();
            students.add(new Student(id, name, phone, email));
        }
        
        Collections.sort(students);
        
        for(Student st : students)
        {
            System.out.println(st);
        }
    }
}
