package J07073;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        ArrayList<Subject> subjects = new ArrayList<>();
        Scanner sc = null;
        
        try 
        {
            sc = new Scanner(new File("MONHOC.in"));
        } 
        catch (FileNotFoundException e) 
        {}

        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int credit = sc.nextInt();
            sc.nextLine();
            String theory = sc.nextLine();
            String practice = sc.nextLine();
            subjects.add(new Subject(id, name, credit, theory, practice));
        }
        
        Collections.sort(subjects);
        
        for(Subject s : subjects)
        {
            if(s.getPractice().equals("Truc tuyen") || s.getPractice().endsWith(".ptit.edu.vn"))
                System.out.println(s);
        }
    }
}
