package J03021;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static String change(String s){
		String s1 = "";
		for(int i = 0; i < s.length(); i++){
			int c = s.charAt(i);
			switch(c){
			
			case 'a' : case 'b' : case 'c':
				s1 += '2';
				break;
			case 'd' : case 'e' : case 'f':
				s1 += '3';
				break;
			case 'g' : case 'h' : case 'i':
				s1 += 4;
				break;
			case 'j' : case 'k' : case 'l':
				s1 += 5;
				break;
			case 'm' : case 'n' : case 'o':
				s1 += 6;
				break;
			case 'p' : case 'q' : case 'r': case 's':
				s1 += 7;
				break;
			case 't' : case 'u' : case 'v':
				s1 += 8;
				break;
			case 'w' : case 'x' : case 'y': case 'z':
				s1 += 9;
				break;				
			}
		}
		return s1;
	}

	public static void oldPhone(){
		String s = change(in.next().toLowerCase());
		String s1 = "";

		for(int i = s.length() - 1; i >= 0; i--){
			s1 += s.charAt(i);
		}
		if(s.equals(s1)){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	public static void main(String[] args) {
		int T = Integer.parseInt(in.nextLine());
		while(T-- > 0){
			oldPhone();
		}	
		in.close();
	}
}