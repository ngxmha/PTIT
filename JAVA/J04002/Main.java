package J04002;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		double a = in.nextDouble();
		double b = in.nextDouble();
		String s = in.next();

		if(a <= 0 || b <= 0){
			System.out.println("INVALID");
		} else {
			Rectangle rec = new Rectangle(a, b, s);
			rec.display();
		}
		in.close();
	}
}