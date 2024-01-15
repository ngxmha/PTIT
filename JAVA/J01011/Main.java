package J01011;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
   
    public static int gcd(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void solve(){
        int a = in.nextInt();
        int b = in.nextInt();
        int res = gcd(a, b);
        System.out.println((long)a * b / res + " " + res);
    }
    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            solve();
        }
    
        in.close();
    }

}
