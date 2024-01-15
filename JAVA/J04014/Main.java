package J04014;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            Fraction f1 = new Fraction(a, b);
            Fraction f2 = new Fraction(c, d);
            Fraction C = f1.calculationC(f2);
            Fraction D = f1.calculationD(f2, C);
            System.out.println(C + " " + D);
        }
    }
}
