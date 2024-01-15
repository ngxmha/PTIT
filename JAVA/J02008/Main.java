package J02008;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    
    static long gcd(long a, long b){
        while(b != 0){
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
    
    static void lcmOfNumbers(){
        int n = in.nextInt();
        long res = 1;
        
        for(int i = 1; i <= n; i++){
            res = lcm(res, i);
        }
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            lcmOfNumbers();
        }
        in.close();
    }
}
