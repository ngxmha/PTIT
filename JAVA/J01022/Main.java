package J01022;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static long[] x = new long[93];

    public static void make(){
        x[1] = 1;
        x[2] = 1;
        for(int i = 3; i < 93; i++){
            x[i] = x[i - 2] + x[i - 1]; 
        }
    }

    public static int binString(int n, long k){
        if(n == 1)
            return 0;
        if(n == 2)
            return 1;
        if(k > x[n - 2]){
            return binString(n - 1, k - x[n - 2]);
        } else {
            return binString(n - 2, k);
        }
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        make();
        while(T-- > 0){
            int n = in.nextInt();
            long k = in.nextLong();
            System.out.println(binString(n, k));
        }
    
        in.close();
    }
}
