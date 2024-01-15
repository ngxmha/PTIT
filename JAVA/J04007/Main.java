package J04007;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String name = in.nextLine();
		String gender = in.nextLine();
		String date = in.nextLine();
		String addr = in.nextLine();
		String codeFax = in.nextLine();
		String day = in.nextLine();
		Employee epl = new Employee(name, gender, date, addr, codeFax, day);
		System.out.println(epl);
		in.close();
	}
}