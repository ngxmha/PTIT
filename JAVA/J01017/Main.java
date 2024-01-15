package J01017;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void beside(){
        String s = in.next();
        
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i + 1) - s.charAt(i) != 1 && s.charAt(i + 1) - s.charAt(i) != -1){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            beside();
        }
    
        in.close();
    }
}
