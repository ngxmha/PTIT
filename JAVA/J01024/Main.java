package J01024;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static void ternaryNumber(){
        int n = in.nextInt();
        while(n != 0){
            int r = n % 10;
            if(r != 1 && r != 2 && r != 0){
                System.out.println("NO");
                return;
            }
            n /= 10;
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            ternaryNumber();
        }
    
        in.close();
    }
}
