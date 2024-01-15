package J04005;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String name = in.nextLine();
		String date = in.next();
		float sc1 = in.nextFloat();
		float sc2 = in.nextFloat();
		float sc3 = in.nextFloat();
		Student st = new Student(name, date, sc1, sc2, sc3);
		System.out.println(st);
		in.close();
	}
}