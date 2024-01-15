package J01013;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static final int MAX = (int) 2e6;

    public static int[] prime = new int[MAX + 1];

    public static void makePrime() {
        for (int i = 2; i <= MAX; i++) {
            prime[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(MAX); i++) {
            if (prime[i] == i) {
                for (int j = i * i; j <= MAX; j += i) {
                    if (prime[j] == j) {
                        prime[j] = i;
                    }
                }
            }
        }
    }

    public static void sumDivisor() {
        int N = in.nextInt();
        long res = 0;

        while (N-- > 0) {
            int n = in.nextInt();

            while (n != 1) {
                res += prime[n];
                n /= prime[n];
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        int T = 1;
        makePrime();
        while (T-- > 0) {
            sumDivisor();
        }

        in.close();
    }
}
