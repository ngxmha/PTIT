package J07072;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main 
{
    static String standard(String s)
    {
        String name = "";
        
        String[] arr = s.split("\\s++");
        for(int i = 0; i < arr.length; i++)
        {
            name += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        
        return name;
    }
    
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
       
        try 
        {
            Scanner sc = new Scanner(new File("DANHSACH.in"));    

            while(sc.hasNextLine())
            {
                String s = sc.nextLine().trim();
                names.add(standard(s));
            }
        } 
        catch (FileNotFoundException e) 
        {
        }
        
        names.sort(new Comparator<String>() 
        {
           public int compare(String s1, String s2)
           {
               String[] arr1 = s1.split(" ");
               String[] arr2 = s2.split(" ");
               if(arr1[arr1.length - 1].equals(arr2[arr2.length - 1]))
               {
                   int i = 0, j = 0;
                    while(i < arr1.length - 1 && j < arr2.length - 1){
                        if(!arr1[i].equals(arr2[j])){
                            return arr1[i].compareTo(arr2[j]);
                        }
                        i++; j++;
                    }
               }
               return arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]);
           }
        });
        
        for(String s : names)
        {
            System.out.println(s);
        }
    }
}
