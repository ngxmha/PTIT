package J03016;

import java.math.BigInteger;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        while(T-- > 0)
        {
            BigInteger big = new BigInteger(sc.next());
            if(big.remainder(new BigInteger("11")).intValue() == 0)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
