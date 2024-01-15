package J01014;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void maxDivPrime(){
        long N = in.nextLong();
        long res = N;
        
        for(int i = 2; i <= Math.sqrt(N); i++){
            if(N % i == 0){
                res = i;
                while(N % i == 0){
                    N /= i;
                }
            }
        }
        if(N != 1){
            res = N;
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while (T-- > 0) {
            maxDivPrime();
        }

        in.close();
    }
}
