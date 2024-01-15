package J01006;

import java.util.Scanner;

public class Main {
    
    public static Scanner in = new Scanner(System.in);

    public static long[] f = new long[93];

    public static void fibo(){
        f[1] = f[2] = 1;
        for(int i = 3; i <= 92; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
    }

    public static void solve(){
        int n = in.nextInt();
        System.out.println(f[n]);
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        fibo();
        while(T-- > 0){
            solve();
        }

        in.close();
    }
}
