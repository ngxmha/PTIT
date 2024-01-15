package J03006;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static void prettyNum1(){
        String s = in.next();
        int l = 0, r = s.length() - 1;
        
        while(l <= r){
            if((s.charAt(l) != s.charAt(r)) || ((s.charAt(l) - '0') % 2 == 1) || ((s.charAt(r) - '0') % 2 == 1)){
                System.out.println("NO");
                return;
            } 
            l++;
            r--;
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            prettyNum1();
        }
        in.close();
    }
}
