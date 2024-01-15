package danhsachsinhvien1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
//        ArrayList<Student> arr = new ArrayList<>();
////        arr.add(new Student("B20DCCN001", "Nguyen Van An", "D20CQCN01-B", "2/12/2002", 3.19f));
////        arr.add(new Student("Nguyen Minh Ha", "D21CQAT02-B", "3/4/2003", 3.2f));
//        arr.add(new Student("NGuyen van a", "d20", "1/12/2002", 3));
//        try
//        {
//           ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("SV.in"));
//           ous.writeObject(arr);
//        }
//        catch(FileNotFoundException ex)
//        {}
//        catch(IOException ex)
//        {}
        
        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
            ArrayList<Student> res = (ArrayList<Student>)ois.readObject();
            for(Student st : res)
            {
                System.out.println(st);
            }
        }
        catch(FileNotFoundException ex)
        {}
        catch(IOException ex)
        {}
        catch(ClassNotFoundException ex)
        {}
        
    }
}
