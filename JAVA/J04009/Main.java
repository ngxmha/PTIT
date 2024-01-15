package J04009;

import java.util.Scanner;

public class Main {
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
			double e = in.nextDouble();
			double f = in.nextDouble();
			Point p3 = new Point(e, f);
			double d1 = p1.distance(p2), d2 = p2.distance(p3), d3 = p3.distance(p1);
			if(d1 == 0 || d2 == 0 || d3 == 0 || d1 + d2 <= d3 || d2 + d3 <= d1 || d3 + d1 <= d2){
				System.out.println("INVALID");
			} else {
				double halfC = (d1 + d2 + d3) / 2;
				System.out.printf("%.2f\n", Math.sqrt(halfC * (halfC - d1) * (halfC - d2) * (halfC - d3)));
			}
		}
		in.close();
	}
}