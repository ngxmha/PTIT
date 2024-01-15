package J07084;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {   
        Scanner sc = null;
        ArrayList<Student> students = new ArrayList<>();
        
        try
        {
            sc = new Scanner(new File("ONLINE.in"));
        }
        catch(FileNotFoundException ex)
        {}
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++)
        {
            String name = sc.nextLine();
            String begin = sc.nextLine();
            String finish = sc.nextLine();
            students.add(new Student(name, begin, finish));
        }
        
        Collections.sort(students);
        
        for(Student st : students)
        {
            System.out.println(st);
        }
    }
}
