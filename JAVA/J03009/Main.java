package J03009;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

        static void privateWord(){
            HashSet<String> hs = new HashSet<String>();
            String S1 = in.nextLine();
            String S2 = in.nextLine();
            
            String[] s1 = S1.split("\\s+");
            String[] s2 = S2.split("\\s+");
            for(int i = 0; i < s1.length; i++){
                hs.add(s1[i]);
            }
            for(int i = 0; i < s2.length; i++){
                if(hs.contains(s2[i])){
                    hs.remove(s2[i]);
                }
            }
            for(String i : hs){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
	public static void main(String[] args) {
            int T = Integer.parseInt(in.nextLine());
            while(T-- > 0){
                privateWord();
            }
            in.close();
	}
} 