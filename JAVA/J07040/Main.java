package J07040;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        HashSet<String> hs = new HashSet<>();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        try 
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
            
            ArrayList<String> list = (ArrayList<String>)ois.readObject();
            
            for(int i = 0; i < list.size(); i++)
            {
                String[] arr = list.get(i).split(" ");
                for(int j = 0; j < arr.length; j++)
                {
                    hs.add(arr[j].toLowerCase());
                }
            }
            
            Scanner sc = new Scanner(new File("VANBAN.in"));
            
            while(sc.hasNextLine())
            {
                String[] arr = sc.nextLine().split(" ");
                for(int i = 0; i < arr.length; i++)
                {
                    if(hs.contains(arr[i].toLowerCase()))
                        lhs.add(arr[i].toLowerCase());
                }
            }
        } 
        catch (FileNotFoundException e) 
        {} 
        catch (IOException ex) 
        {} 
        catch (ClassNotFoundException ex) 
        {}
        
        for(String s : lhs)
            System.out.println(s);
    }
}
