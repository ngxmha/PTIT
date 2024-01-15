package J04001;

import java.util.Scanner;


public class Main{
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int T = in.nextInt();
		while(T-- > 0){
			double a = in.nextDouble();
			double b = in.nextDouble();
			Point p1 = new Point(a, b);
			double c = in.nextDouble();
			double d = in.nextDouble();
			Point p2 = new Point(c, d);
			System.out.printf("%.4f\n", p1.distance(p2));
		}
		in.close();
	}
}