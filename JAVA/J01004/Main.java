package J01004;

import java.util.Scanner;

public class Main {
    
    public static Scanner in = new Scanner(System.in);

    public static void isPrime(){
        int N = in.nextInt();
        for(int i = 2; i <= Math.sqrt(N); i++){
            if(N % i == 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            isPrime();
        }

        in.close();
    }
}
