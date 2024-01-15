package J01009;

import java.util.Scanner;

public class Main {
    
    public static Scanner in = new Scanner(System.in);    
    
    public static void sumFactorial(){
        int n = in.nextInt();
        long res = 0, tmp = 1;
        for(int i = 1; i <= n; i++){
            tmp *= i;
            res += tmp;
        }
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        int T = 1;
        while(T-- > 0){
            sumFactorial();
        }

        in.close();
    }
}