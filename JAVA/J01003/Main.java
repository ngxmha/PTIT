package J01003;

import java.util.Scanner;

public class Main{

    public static Scanner in = new Scanner(System.in);

    public static void solve(){
        int a = in.nextInt();
        int b = in.nextInt();
        if(a == 0 && b != 0){
            System.out.println("VN");
        } else if(a == 0 && b == 0){
            System.out.println("VSN");
        } else {
            System.out.printf("%.2f\n", (float)-b/a);
        }
    }

    public static void main(String[] args) {
        int T = 1;
        while(T-- > 0){
            solve();
        }        

        in.close();
    }
}
