package J03039;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.remainder(b).intValue() == 0 || b.remainder(a).intValue() == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
