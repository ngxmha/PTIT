package J01018;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static void notBeside(){
        long n = in.nextLong();
        int sum = 0;

        while(n > 10){
            int r = (int)n % 10;
            sum += r;
            if(Math.abs(r - n / 10 % 10) != 2){
                System.out.println("NO");
                return;
            }    
            n /= 10;
        }
        sum += n;
        if(sum % 10 != 0){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            notBeside();
        }
        in.close();
    }
}
