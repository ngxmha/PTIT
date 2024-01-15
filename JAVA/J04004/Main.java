package J04004;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();

		Fraction f1 = new Fraction(a, b);
		Fraction f2 = new Fraction(c, d);
		Fraction f = new Fraction();
		f = f.sumOfTwoFraction(f1, f2);
		System.out.println(f);
		in.close();
	}
}