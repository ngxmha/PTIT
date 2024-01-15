package J04015;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String code = in.nextLine();
		String name = in.nextLine();
		int basicSalary = in.nextInt();
		Teacher t = new Teacher(code, name , basicSalary);
		System.out.println(t);
		in.close();
	}
}
