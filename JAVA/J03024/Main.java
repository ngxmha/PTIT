package J03034;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void advantageNumber(){
		String s = in.next();
		int even = 0, odd = 0;

		if(s.charAt(0) == '0'){
			System.out.println("INVALID");
			return;
		}
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) < '0' || s.charAt(i)> '9'){
				System.out.println("INVALID");
				return;
			}
			if((s.charAt(i) - '0') % 2 == 0){
				even++;
			} else {
				odd++;
			}
		}
		if((s.length() % 2 == 0 && even > odd) || (s.length() % 2 == 1 && odd > even)){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		int T = in.nextInt();
		while(T-- > 0){
			advantageNumber();
		}
		in.close();
	}
}