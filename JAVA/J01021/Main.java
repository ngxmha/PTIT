package J01021;

import java.util.Scanner;

public class Main {
    
    public static Scanner in = new Scanner(System.in);
    
    public static final int MOD = (int)1e9 + 7;

    public static long power(int a, long b){
        if(b == 0){
            return 1;
        }
        long x = power(a, b / 2);
        if(b % 2 == 0){
            return (x * x) % MOD;
        } else {
            return ((x * x) % MOD * (a % MOD)) % MOD;
        }
    }

    public static void main(String[] args) {
        while(true){
            int a = in.nextInt();
            long b = in.nextLong();
            if(a == 0 && b == 0)
                break;
            System.out.println(power(a, b));        
        }
    
        in.close();
    }
}
