package J03004;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    
    static void standardFullName(){
        String s = in.nextLine().trim();
        int len = s.length();
        int i = 0;
        while(i < len){
            if(s.charAt(i) == ' '){
                i++;
                continue;
            } else {
                String s1 = "";
                while(i < len && s.charAt(i) != ' '){
                    s1 += s.charAt(i);
                    i++;    
                }
                System.out.print(s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase() + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int T = Integer.parseInt(in.nextLine());
        while(T-- > 0){
            standardFullName();
        }
        in.close();
    }
}