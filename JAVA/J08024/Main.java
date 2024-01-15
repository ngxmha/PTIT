package J08024;

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
            
            LinkedList<String> queue = new LinkedList<>();
            queue.offer("9");
            
            while(true)
            {
                String tmp = queue.poll();
                int x = Integer.parseInt(tmp);
                if(x % n == 0)
                {
                    System.out.println(x);
                    break;  
                }
                
                String s1 = tmp + "0", s2 =  tmp + "9";
                queue.offer(s1);
                queue.offer(s2);
            }
        }
    }
}
