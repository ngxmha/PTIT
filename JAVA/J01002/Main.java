package J01002;

import java.util.Scanner;

public class Main {
        
    public static Scanner in = new Scanner(System.in);

    public static void test(){
        int n = in.nextInt();
        long res = (long)n * (n + 1) / 2;
        System.out.println(res);
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            test();
        }

        in.close();
    }
}
