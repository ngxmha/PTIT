package J02022;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static int n, k;
    public static int[] x = new int[10];
    public static boolean[] used = new boolean[10];

    public static boolean check(){
        for(int i = 1; i < n; i++){
            if(Math.abs(x[i + 1] - x[i]) == 1){
                return false;
            }
        }
        return true;
    }

    public static void out(){
        for(int i = 1; i <= n; i++){
            System.out.print(x[i]);
        }
        System.out.println();
    }

    public static void Try(int i){
        for(int j = 1; j <= n; j++){
            if(!used[j]){
                x[i] = j;
                used[j] = true;
                if(i == n){
                    if(check()){
                        out();
                    }
                } else {
                    Try(i + 1);
                }
                used[j] = false;
            } 
        }
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            n = in.nextInt();
            Try(1);
        }
        in.close();
    }
}
