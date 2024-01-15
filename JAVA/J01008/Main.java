package J01008;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void primeFactor() {
        int n = in.nextInt();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int cnt = 0;
                while(n % i == 0) {
                    cnt++;
                    n /= i;
                }
                System.out.printf("%d(%d) ", i, cnt);
            }

        }
        if (n != 1) {
            System.out.printf("%d(1)", n);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        int t = 1;
        while (t <= T) {
            System.out.print("Test " + t + ": ");
            primeFactor();
            t++;
        }

        in.close();
    }
}


