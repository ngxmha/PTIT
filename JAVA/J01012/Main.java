package J01012;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void solve() {
        int N = in.nextInt();

        int res = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (i % 2 == 0) {
                    res++;
                }
                if (i != N / i && N / i % 2 == 0) {
                    res++;
                }
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while (T-- > 0) {
            solve();
        }

        in.close();
    }
}
