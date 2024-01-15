package J04003;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long t = in.nextLong();
		long m = in.nextLong();

		Fraction f = new Fraction(t, m);
		System.out.println(f);
		in.close();
	}
}