package J03040;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	static boolean check1(String s){
		for(int i = 0; i < s.length() - 1; i++){
			if(s.charAt(i) >= s.charAt(i + 1)){
				return false;
			}
		}
		return true;
	}

	static boolean check2(String s){
		return s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4);
	}

	static boolean check3(String s){
		for(int i = 0; i < s.length() - 1; i++){
			if(s.charAt(i) != '6' && s.charAt(i) != '8'){
				return false;
			}
		} 
		return true;
	}

	static void isBeautiful(String s){
		if(check1(s) || check2(s) || check3(s)){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		int T = in.nextInt();
		while(T-- > 0){
			String s = in.next();
			isBeautiful(s.substring(5).replace(".", ""));
		}
		in.close();
	}
}