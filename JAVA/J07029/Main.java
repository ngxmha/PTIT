package J07029;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

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
        
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(cmp);
        
        try 
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
            
            ArrayList<Integer> list = (ArrayList<Integer>)ois.readObject();
            
            for(Integer i : list)
            {
                if(prime[i] == 1)
                {
                    if(treeMap.containsKey(i))
                    {
                        int tanSuat = treeMap.get(i);
                        tanSuat++;
                        treeMap.put(i, tanSuat);
                    }
                    else
                        treeMap.put(i, 1);
                }
            }
        } 
        catch (FileNotFoundException e) 
        {} 
        catch (IOException ex) 
        {} 
        catch (ClassNotFoundException ex) 
        {}
        
        int cnt = 0;
        
        for(Map.Entry<Integer, Integer> entry : treeMap.entrySet())
        {
            if(cnt == 10)
                break;
            System.out.println(entry.getKey() + " " + entry.getValue());
            cnt++;
        }
    }
}
