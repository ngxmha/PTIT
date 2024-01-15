package J03032;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    
   static void reverseWord(){
       String[] s = in.nextLine().split("\\s+");
       
       for(int i = 0; i < s.length; i++){
           StringBuilder sb = new StringBuilder(s[i]);
           System.out.print(sb.reverse() + " ");
        } 
       System.out.println();
   }
   
    public static void main(String[] args) {
        int T = Integer.parseInt(in.nextLine());
        while(T-- > 0){
            reverseWord();
        }
        in.close();
    }
}
