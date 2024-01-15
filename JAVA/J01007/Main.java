package J01007;

import java.util.Scanner;

public class Main {
    
     public static Scanner in = new Scanner(System.in);

    public static long[] f = new long[93];

    public static void fibo(){
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= 92; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
    }

    public static void isFibo(){
        long n = in.nextLong();
        for(int i = 0; f[i] <= n; i++){
            if(f[i] == n){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        fibo();
        while(T-- > 0){
            isFibo();
        }

        in.close();
    }
}
