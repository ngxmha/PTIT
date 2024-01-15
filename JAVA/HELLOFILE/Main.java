package HELLOFILE;

import java.util.Scanner;
import java.io.*;

public class Main{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Hello.txt"));
		while(sc.hasNext()){
			String s = sc.nextLine();
			System.out.println(s);
		}
	}
}