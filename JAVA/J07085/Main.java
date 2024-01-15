package J07085;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {   
        
        ObjectInputStream ois = null;
        ArrayList<String> arr = null;
        
        try
        {
            ois = new ObjectInputStream(new FileInputStream("DATA.in"));
            arr = (ArrayList<String>)ois.readObject();
        }
        catch(FileNotFoundException ex)
        {} 
        catch (IOException ex) 
        {}
        catch (ClassNotFoundException ex) 
        {}
        
        for(String s : arr)
        {
            String res = "";
            int sum = 0;
            for(int i = 0; i < s.length(); i++)
            {
                if(Character.isDigit(s.charAt(i)))
                {
                    res += s.charAt(i);
                    sum += s.charAt(i) - '0';
                }
            }
            BigInteger ans = new BigInteger(res);
            System.out.println(ans + " " + sum);
        }
    }
}
