package J04018;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte T = sc.nextByte();
        while(T-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            RealNumber A = new RealNumber(a, b);
            RealNumber B = new RealNumber(c, d);
            System.out.print(A.calculationC(B) + ", " + A.calculationD(B) + "\n");
        }
    }
}
