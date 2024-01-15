package JKT013;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        while(T-- > 0) 
        {
            int n = sc.nextInt();
            
            ArrayList<String> arr = new ArrayList<>();
            arr.add("6");
            arr.add("8");
            
            LinkedList<String> queue = new LinkedList<>();
            queue.offer("6");
            queue.offer("8");
            
            while(true)
            {
                String tmp = queue.poll();
                if(tmp.length() == n)
                    break;  
                String s1 = tmp + "6", s2 =  tmp + "8";
                queue.offer(s1);
                queue.offer(s2);
                arr.add(s1);
                arr.add(s2);
            }
            
            System.out.println(arr.size());
            for(int i = arr.size() - 1; i >= 0; i--)
            {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }
    }
}
