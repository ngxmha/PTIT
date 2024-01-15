package J03025;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    
    static void symmetryString(){
        String s = in.next();
        int cnt = 0;
        
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                cnt++;
            }
            l++; r--;
        }
        
        if(cnt > 1){
            System.out.println("NO");
        } else if(cnt == 1) {
            System.out.println("YES");
        } else {
            System.out.println(s.length() % 2 == 0 ? "NO" : "YES");
        }
    }
    
    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            symmetryString();
        }
        in.close();
    }
}
