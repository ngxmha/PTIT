package J07031;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main 
{
    
    static int[] prime = new int[1000001];
    
    static void makePrime()
    {
        for(int i = 0; i <= 1000000; i++)
        {
            prime[i] = 1;
        }
        prime[0] = prime[1] = 0;
        
        for(int i = 2; i <= 1000; i++)
        {
            if(prime[i] == 1)
            {
                for(int j = i * i; j <= 1000000; j += i)
                    prime[j] = 0;
            }
        }
    }
    
    public static void main(String[] args)
    {
        makePrime();
        
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        
        TreeSet<Integer> tset1 = new TreeSet<>();
        TreeSet<Integer> tset2 = new TreeSet<>();
        
        try 
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
            
            ArrayList<Integer> list = (ArrayList<Integer>)ois.readObject();
            
            for(Integer i : list)
            {
               if(prime[i] == 1)
                    tset1.add(i);
            }
            
            ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
            
            list = (ArrayList<Integer>)ois.readObject();
            
            for(Integer i : list)
            {
               if(prime[i] == 1)
                    tset2.add(i);
            }
            
            for(Integer i : tset1)
            {
                if(i < 1000000 - i && tset1.contains(1000000 - i) && !tset2.contains(i) && !tset2.contains(1000000 - i))
                    treeMap.put(i, 1000000 - i);
            }
        } 
        catch (FileNotFoundException e) 
        {} 
        catch (IOException ex) 
        {} 
        catch (ClassNotFoundException ex) 
        {}
        
        for(Map.Entry<Integer, Integer> entry : treeMap.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
