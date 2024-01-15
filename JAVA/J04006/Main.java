package J04006;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String name = in.nextLine();
		String group = in.next();
		String date = in.next();
		float gpa = in.nextFloat();
		Student st = new Student(name, group, date, gpa);
		System.out.println(st);
		in.close();
	}
}