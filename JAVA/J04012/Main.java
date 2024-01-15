package J04012;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String name = in.nextLine();
		int basicSalary = in.nextInt();
		int dayOfWork = in.nextInt();
		String pos = in.next();
		Employee e = new Employee(name, basicSalary, dayOfWork, pos);
		System.out.println(e);
		in.close();
	}
}