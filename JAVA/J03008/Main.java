package J03008;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void prettyNum3(){
        String s = in.next();
        int l = 0, r = s.length() - 1;

        while(l <= r){
            if(s.charAt(l) != s.charAt(r) || !isPrime(s.charAt(l) - '0') || !isPrime(s.charAt(r) - '0')){
                System.out.println("NO");
                return;
            }
            l++;
            r--;
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            prettyNum3();
        }
        in.close();
    }
}
