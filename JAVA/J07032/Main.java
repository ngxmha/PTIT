package J07032;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Main 
{
    static boolean isThuanNghich(int n)
    {
        int m = n, res = 0, quantity_digit = 0;
        
        while(m > 0)
        {
            int r = m % 10;
            quantity_digit++;
            if(r % 2 == 0)
                return false;
            res = res * 10 + r;
            m /= 10;
        }
        
        if(quantity_digit < 3 || quantity_digit % 2 == 0)
            return false;
        
        return res == n;
    }
    
    public static void main(String[] args)
    {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        
        int[] cnt = new int[1000001];
        
        try 
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
            
            ArrayList<Integer> list = (ArrayList<Integer>)ois.readObject();
            
            for(Integer i : list)
            {
                cnt[i]++;
                if(isThuanNghich(i))
                    hs1.add(i);
            }
            
            ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
            
            list = (ArrayList<Integer>)ois.readObject();
            
            for(Integer i : list)
            {
                cnt[i]++;
                if(isThuanNghich(i))
                    hs2.add(i);
            }

            for(Integer i : hs1)
            {
                if(hs2.contains(i))
                    tm.put(i, cnt[i]);
            }
        } 
        catch (FileNotFoundException ex) 
        {} 
        catch (IOException ex) 
        {} 
        catch (ClassNotFoundException ex) 
        {}
        
        int dem = 0;
        for(Map.Entry<Integer, Integer> entry : tm.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
            dem++;
            if(dem == 10)
                break;
        }
    }
}