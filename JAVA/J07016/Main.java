package J07016;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    
    static int[] prime = new int[10000];
    
    static void sangNT()
    {
        for(int i = 2; i < 10000; i++)
        {
            prime[i] = 1;
        }
        
        for(int i = 2; i < 100; i++)
        {
            for(int j = i * i; j < 10000; j += i)
            {
                if(prime[i] == 1)
                    prime[j] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
    
        sangNT();
        
        Map<Integer, Integer> map_1 = new TreeMap<>();
        Map<Integer, Integer> map_2 = new TreeMap<>();
    
        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
            
            List<Integer> list = (ArrayList<Integer>) ois.readObject();
            
            for(Integer i : list)
            {
                if(prime[i] == 1)
                {
                    if(map_1.containsKey(i))
                    {
                        map_1.put(i, map_1.get(i) + 1);
                    }
                    else
                        map_1.put(i, 1);
                }
            }
        }
        catch(IOException ex)
        {}
        catch(ClassNotFoundException ex)
        {}
        
        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
            
            List<Integer> list = (ArrayList<Integer>) ois.readObject();
            
            for(Integer i : list)
            {
                if(map_1.containsKey(i))
                {
                    if(map_2.containsKey(i))
                    {
                        map_2.put(i, map_2.get(i) + 1);
                    }
                    else
                        map_2.put(i, 1);
                }
            }
        }
        catch(IOException ex)
        {}
        catch(ClassNotFoundException ex)
        {}
        
        for(Integer i : map_1.keySet())
        {
            System.out.println(i + " " + map_1.get(i) + " " + map_2.get(i));
        }
    }
}
