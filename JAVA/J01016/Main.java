package J01016;

import java.util.Scanner;

public class Main {
    
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        String s = in.next();
        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '4' || s.charAt(i) == '7'){
                ans++;
            }
        }
        if(ans == 4 || ans == 7){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    
        in.close();
    }
}
