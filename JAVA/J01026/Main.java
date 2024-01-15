package J01026;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static void sqrNumber(){
        int n = in.nextInt();
        if((int)Math.sqrt(n) == Math.sqrt(n)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            sqrNumber();
        }

        in.close();
    }
}
