package J03007;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static void prettyNum2(){
        String s = in.next();
        int l = 0, r = s.length() - 1;
        int sum = 0;

        if(s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8'){
            System.out.println("NO");
            return;
        }
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                System.out.println("NO");
                return;
            }
            sum += 2 * (s.charAt(l) - '0'); 
            l++;
            r--;
        }
        if(sum % 10 != 0){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            prettyNum2();
        }
        in.close();
    }
}
